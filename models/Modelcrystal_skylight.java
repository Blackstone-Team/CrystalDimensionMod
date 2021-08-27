// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcrystal_skylight extends EntityModel<Entity> {
	private final ModelRenderer left_wing;
	private final ModelRenderer right_wing;
	private final ModelRenderer body;

	public Modelcrystal_skylight() {
		textureWidth = 16;
		textureHeight = 16;

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(left_wing, 0.0F, 0.0F, 0.1745F);
		left_wing.setTextureOffset(0, 3).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(-1.0F, 0.0F, 0.0F);
		setRotationAngle(right_wing, 0.0F, 0.0F, -0.1745F);
		right_wing.setTextureOffset(3, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(-0.5F, 0.5F, 1.0F);
		body.setTextureOffset(0, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		left_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		right_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.right_wing.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_wing.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
	}
}