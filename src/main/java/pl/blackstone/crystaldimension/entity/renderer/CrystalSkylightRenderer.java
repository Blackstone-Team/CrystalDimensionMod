package pl.blackstone.crystaldimension.entity.renderer;

import pl.blackstone.crystaldimension.entity.CrystalSkylightEntity;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CrystalSkylightRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(CrystalSkylightEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcrystal_skylight(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("crystal_dimension:textures/crystal_skylight.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcrystal_skylight extends EntityModel<Entity> {
		private final ModelRenderer lewe_skrzydlo;
		private final ModelRenderer prawe_skrzydlo;
		private final ModelRenderer cialo;
		public Modelcrystal_skylight() {
			textureWidth = 16;
			textureHeight = 16;
			lewe_skrzydlo = new ModelRenderer(this);
			lewe_skrzydlo.setRotationPoint(-1.0F, 0.0F, 0.0F);
			setRotationAngle(lewe_skrzydlo, 0.0F, 0.0F, 0.1745F);
			lewe_skrzydlo.setTextureOffset(0, 3).addBox(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);
			prawe_skrzydlo = new ModelRenderer(this);
			prawe_skrzydlo.setRotationPoint(0.0F, 0.0F, 0.0F);
			setRotationAngle(prawe_skrzydlo, 0.0F, 0.0F, -0.1745F);
			prawe_skrzydlo.setTextureOffset(3, 0).addBox(-2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);
			cialo = new ModelRenderer(this);
			cialo.setRotationPoint(0.0F, 24.0F, 0.0F);
			cialo.setTextureOffset(0, 0).addBox(-1.0F, -24.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			lewe_skrzydlo.render(matrixStack, buffer, packedLight, packedOverlay);
			prawe_skrzydlo.render(matrixStack, buffer, packedLight, packedOverlay);
			cialo.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.lewe_skrzydlo.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.prawe_skrzydlo.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
