package com.greyblockgames.solaceutils.mixins.entityRenderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(PlayerRenderer.class)
public abstract class PlayerRendererMixin extends LivingEntityRenderer<AbstractClientPlayer, PlayerModel<AbstractClientPlayer>> {


    public PlayerRendererMixin(EntityRenderDispatcher dispatcher, PlayerModel<AbstractClientPlayer> model, float scale) {
        super(dispatcher, model, scale);
    }

    @Environment(EnvType.CLIENT)
    @Inject(method = "<init>(Lnet/minecraft/client/renderer/entity/EntityRenderDispatcher;Z)V", at = @At(value = "RETURN"))
    private void mixin(EntityRenderDispatcher dispatcher, boolean bl, CallbackInfo ci) {

        //   this.addFeature(new PlayerUnusualParticlesFeature(this));

    }


}




