package warhammermod.utils;

import com.mojang.blaze3d.platform.InputConstants;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.rendereregistry.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.network.ClientSidePacketRegistry;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.entity.ItemEntityRenderer;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.phys.Vec3;
import org.lwjgl.glfw.GLFW;
import warhammermod.Entities.Living.Renders.PegasusRenderer;
import warhammermod.Entities.Projectile.FlameEntity;
import warhammermod.Entities.Projectile.Render.*;
import warhammermod.Entities.Projectile.StoneEntity;
import warhammermod.utils.Registry.Entityinit;


import java.util.UUID;

@Environment(EnvType.CLIENT)
public class Clientside implements ClientModInitializer {
    public static final ResourceLocation PacketID = new ResourceLocation(reference.modid, "spawn_packet");
    public static KeyMapping pegasus_down;
    @Override
    public void onInitializeClient(){
        registerkeys();
        receiveEntityPacket();

        EntityRendererRegistry.INSTANCE.register(Entityinit.halberdthrust, (dispatcher, context) ->
                new HalberdRender(dispatcher));
        EntityRendererRegistry.INSTANCE.register(Entityinit.Bullet, (dispatcher, context) ->
                new BulletRender(dispatcher));
        EntityRendererRegistry.INSTANCE.register(Entityinit.SpearProjectile, (dispatcher, context) ->
                new HalberdRender(dispatcher));
        EntityRendererRegistry.INSTANCE.register(Entityinit.STONEENTITY, (dispatcher, context) ->
                new ThrownItemRenderer<StoneEntity>(dispatcher, Minecraft.getInstance().getItemRenderer()));
        EntityRendererRegistry.INSTANCE.register(Entityinit.Flame, (dispatcher, context) ->
                new ThrownItemRenderer<FlameEntity>(dispatcher,Minecraft.getInstance().getItemRenderer()));
        EntityRendererRegistry.INSTANCE.register(Entityinit.Grenade, (dispatcher, context) ->
                new GrenadeRender(dispatcher));
        EntityRendererRegistry.INSTANCE.register(Entityinit.Shotentity, (dispatcher, context) ->
                new ShotRender(dispatcher));
        EntityRendererRegistry.INSTANCE.register(Entityinit.WarpBullet, (dispatcher, context) ->
                new WarpbulletRender(dispatcher));
        EntityRendererRegistry.INSTANCE.register(Entityinit.Pegasus, (dispatcher, context) ->
                new PegasusRenderer(dispatcher));
    }

    public void registerkeys(){
        pegasus_down = KeyBindingHelper.registerKeyBinding(new KeyMapping("key"+reference.modid+"pegasusdown",
                InputConstants.Type.KEYSYM,
                GLFW.GLFW_KEY_R,
                "category"+reference.modid+"pegasus_down"
                ));
    }

    public void receiveEntityPacket() {

        ClientSidePacketRegistry.INSTANCE.register(PacketID, (ctx, byteBuf) -> {
            EntityType<?> et = Registry.ENTITY_TYPE.byId(byteBuf.readVarInt());
            UUID uuid = byteBuf.readUUID();
            int entityId = byteBuf.readVarInt();
            Vec3 pos = EntitySpawnPacket.PacketBufUtil.readVec3d(byteBuf);
            float pitch = EntitySpawnPacket.PacketBufUtil.readAngle(byteBuf);
            float yaw = EntitySpawnPacket.PacketBufUtil.readAngle(byteBuf);
            ctx.getTaskQueue().execute(() -> {
                if (Minecraft.getInstance().level == null)
                    throw new IllegalStateException("Tried to spawn entity in a null world!");
                Entity e = et.create(Minecraft.getInstance().level);
                if (e == null)
                    throw new IllegalStateException("Failed to create instance of entity \"" + Registry.ENTITY_TYPE.getId(et) + "\"!");
                e.setPacketCoordinates(pos);
                e.setPos(pos.x, pos.y, pos.z);
                e.xRot = pitch;
                e.yRot = yaw;
                e.setId(entityId);
                e.setUUID(uuid);
                Minecraft.getInstance().level.putNonPlayerEntity(entityId, e);
            });
        });
    }
}
