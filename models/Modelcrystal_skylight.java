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
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		lewe_skrzydlo.render(matrixStack, buffer, packedLight, packedOverlay);
		prawe_skrzydlo.render(matrixStack, buffer, packedLight, packedOverlay);
		cialo.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.lewe_skrzydlo.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.prawe_skrzydlo.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}