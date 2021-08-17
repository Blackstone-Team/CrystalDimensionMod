package pl.blackstone.crystaldimension.entity.renderer;

import pl.blackstone.crystaldimension.entity.CrystalBeastEntity;

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
public class CrystalBeastRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(CrystalBeastEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelCrystal_beast(), 0.8f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("crystal_dimension:textures/crystal_beast.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelCrystal_beast extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer head;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer l_arm;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer r_arm;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer l_leg;
		private final ModelRenderer r_leg;
		public ModelCrystal_beast() {
			textureWidth = 64;
			textureHeight = 64;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.setTextureOffset(12, 35).addBox(-1.0F, -13.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(20, 0).addBox(-3.0F, -11.0F, 4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(1.0F, -16.0F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(33, 33).addBox(-3.0F, -10.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(36, 7).addBox(2.0F, -15.0F, 4.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(36, 2).addBox(1.0F, -16.0F, 4.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(36, 11).addBox(-3.0F, -11.0F, 4.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(33, 31).addBox(3.0F, -16.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r3.setTextureOffset(0, 0).addBox(-4.0F, -18.0F, 1.0F, 8.0F, 11.0F, 4.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.48F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(33, 31).addBox(-1.0F, -10.0F, -10.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 6.0F, 0.0F);
			head.setTextureOffset(24, 22).addBox(-1.0F, -2.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(17, 27).addBox(2.0F, -2.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(17, 30).addBox(-3.0F, -2.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(33, 0).addBox(-3.0F, -1.0F, -6.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(18, 15).addBox(-3.0F, -9.0F, -5.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(33, 36).addBox(-3.0F, -8.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(9, 27).addBox(-3.0F, -7.0F, -4.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(-3.0F, -6.0F, -5.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 18.0F, 0.0F);
			head.addChild(cube_r5);
			setRotationAngle(cube_r5, -0.3054F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(0, 18).addBox(-2.0F, -21.0F, -13.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 18.0F, 0.0F);
			head.addChild(cube_r6);
			setRotationAngle(cube_r6, -0.3079F, -0.1248F, 0.0396F);
			cube_r6.setTextureOffset(0, 15).addBox(1.0F, -21.0F, -13.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			l_arm = new ModelRenderer(this);
			l_arm.setRotationPoint(5.0F, 5.0F, 0.0F);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-5.0F, 19.0F, 0.0F);
			l_arm.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(36, 15).addBox(4.0F, -17.0F, -5.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-5.0F, 19.0F, 0.0F);
			l_arm.addChild(cube_r8);
			setRotationAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(21, 24).addBox(4.0F, -19.0F, -5.0F, 3.0F, 19.0F, 3.0F, 0.0F, false);
			r_arm = new ModelRenderer(this);
			r_arm.setRotationPoint(-5.0F, 5.0F, 0.0F);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(5.0F, 19.0F, 0.0F);
			r_arm.addChild(cube_r9);
			setRotationAngle(cube_r9, -0.1745F, 0.0F, 0.0F);
			cube_r9.setTextureOffset(24, 0).addBox(-7.0F, -19.0F, -5.0F, 3.0F, 19.0F, 3.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(5.0F, 19.0F, 0.0F);
			r_arm.addChild(cube_r10);
			setRotationAngle(cube_r10, 1.3526F, 0.0F, 0.0F);
			cube_r10.setTextureOffset(12, 30).addBox(-8.0F, -5.0F, 6.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
			l_leg = new ModelRenderer(this);
			l_leg.setRotationPoint(2.0F, 17.0F, 2.0F);
			l_leg.setTextureOffset(0, 27).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);
			r_leg = new ModelRenderer(this);
			r_leg.setRotationPoint(-2.0F, 17.0F, 2.0F);
			r_leg.setTextureOffset(33, 19).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			l_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			r_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			l_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			r_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.l_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.r_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.l_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.r_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
