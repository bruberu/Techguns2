package techguns.client.models.guns;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.Entity;
import techguns.client.models.ModelMultipart;
import techguns.client.render.TGRenderHelper;

public class ModelNetherBlaster extends ModelMultipart {
	// fields
	ModelRenderer Glow3;
	ModelRenderer Shape2;
	ModelRenderer Glow2;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape12;
	ModelRenderer Shape13;
	ModelRenderer Shape14;
	ModelRenderer Shape15;
	ModelRenderer Shape16;
	ModelRenderer Shape17;
	ModelRenderer Shape18;
	ModelRenderer Shape19;
	ModelRenderer Shape20;
	ModelRenderer Shape21;
	ModelRenderer Shape22;
	ModelRenderer Glow1;
	ModelRenderer Glow4;

	public ModelNetherBlaster() {
		textureWidth = 64;
		textureHeight = 64;

		Glow3 = new ModelRenderer(this, 6, 54);
		Glow3.addBox(-3F, -2.5F, 0F, 3, 3, 7);
		Glow3.setRotationPoint(1.5F, 4F, -0.5F);
		Glow3.setTextureSize(64, 64);
		setRotation(Glow3, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 28, 50);
		Shape2.addBox(0F, 0F, 0F, 1, 1, 13);
		Shape2.setRotationPoint(-2.5F, -3.5F, -5.5F);
		Shape2.setTextureSize(64, 64);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Glow2 = new ModelRenderer(this, 1, 56);
		Glow2.addBox(-3F, -2F, 0F, 2, 2, 1);
		Glow2.setRotationPoint(2F, 0.5F, -9F);
		Glow2.setTextureSize(64, 64);
		Glow2.mirror = true;
		setRotation(Glow2, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 26, 33);
		Shape4.addBox(0F, 0F, 0F, 4, 1, 14);
		Shape4.setRotationPoint(-2F, -4F, -6F);
		Shape4.setTextureSize(64, 64);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 0, 24);
		Shape5.addBox(0F, 0F, 0F, 4, 1, 2);
		Shape5.setRotationPoint(-2F, 3F, 11F);
		Shape5.setTextureSize(64, 64);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 43, 52);
		Shape6.addBox(0F, 0F, 0F, 0, 1, 10);
		Shape6.setRotationPoint(-1F, -4.5F, -5.5F);
		Shape6.setTextureSize(64, 64);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 20, 35);
		Shape7.addBox(-3F, -2F, 0F, 1, 4, 6);
		Shape7.setRotationPoint(6F, -0.5333334F, -3F);
		Shape7.setTextureSize(64, 64);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 26, 48);
		Shape8.addBox(0F, 0F, 0F, 1, 1, 15);
		Shape8.setRotationPoint(-2.5F, 1.5F, -7.5F);
		Shape8.setTextureSize(64, 64);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 26, 48);
		Shape9.addBox(0F, 0F, 0F, 1, 1, 15);
		Shape9.setRotationPoint(1.5F, 1.5F, -7.5F);
		Shape9.setTextureSize(64, 64);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 38, 1);
		Shape10.addBox(-3F, -2F, 0F, 6, 5, 6);
		Shape10.setRotationPoint(0F, -1F, -3F);
		Shape10.setTextureSize(64, 64);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new ModelRenderer(this, 20, 35);
		Shape11.addBox(-3F, -2F, 0F, 1, 4, 6);
		Shape11.setRotationPoint(-1F, -0.5333334F, -3F);
		Shape11.setTextureSize(64, 64);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 44, 22);
		Shape12.addBox(-3F, -2F, 0F, 6, 5, 4);
		Shape12.setRotationPoint(0F, -1F, -8F);
		Shape12.setTextureSize(64, 64);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 24, 22);
		Shape13.addBox(-3F, -2F, 0F, 6, 5, 4);
		Shape13.setRotationPoint(0F, -1F, 4F);
		Shape13.setTextureSize(64, 64);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0F);
		Shape14 = new ModelRenderer(this, 0, 0);
		Shape14.addBox(-3F, -8F, 3F, 8, 8, 7);
		Shape14.setRotationPoint(-1F, 3.2F, 14F);
		Shape14.setTextureSize(64, 64);
		Shape14.mirror = true;
		setRotation(Shape14, 0.3839724F, 0F, 0F);
		Shape15 = new ModelRenderer(this, 0, 39);
		Shape15.addBox(-3F, -2F, 0F, 7, 7, 6);
		Shape15.setRotationPoint(-0.5F, -2F, 8F);
		Shape15.setTextureSize(64, 64);
		Shape15.mirror = true;
		setRotation(Shape15, 0F, 0F, 0F);
		Shape16 = new ModelRenderer(this, 11, 0);
		Shape16.addBox(0F, 0F, 0F, 4, 3, 19);
		Shape16.setRotationPoint(-2F, 2F, -8F);
		Shape16.setTextureSize(64, 64);
		Shape16.mirror = true;
		setRotation(Shape16, 0F, 0F, 0F);
		Shape17 = new ModelRenderer(this, 28, 50);
		Shape17.addBox(0F, 0F, 0F, 1, 1, 13);
		Shape17.setRotationPoint(1.5F, -3.5F, -5.5F);
		Shape17.setTextureSize(64, 64);
		Shape17.mirror = true;
		setRotation(Shape17, 0F, 0F, 0F);
		Shape18 = new ModelRenderer(this, 43, 52);
		Shape18.addBox(0F, 0F, 0F, 0, 1, 10);
		Shape18.setRotationPoint(1F, -4.5F, -5.5F);
		Shape18.setTextureSize(64, 64);
		Shape18.mirror = true;
		setRotation(Shape18, 0F, 0F, 0F);
		Shape19 = new ModelRenderer(this, 38, 12);
		Shape19.addBox(-1F, 0F, 1F, 4, 1, 6);
		Shape19.setRotationPoint(-1F, 3.2F, 14F);
		Shape19.setTextureSize(64, 64);
		Shape19.mirror = true;
		setRotation(Shape19, 0.3839724F, 0F, 0F);
		Shape20 = new ModelRenderer(this, 0, 28);
		Shape20.addBox(-3F, -8F, 0F, 8, 8, 3);
		Shape20.setRotationPoint(-1F, 3.2F, 14F);
		Shape20.setTextureSize(64, 64);
		Shape20.mirror = true;
		setRotation(Shape20, 0.3839724F, 0F, 0F);
		Shape21 = new ModelRenderer(this, 38, 12);
		Shape21.addBox(-1F, -9F, 1F, 4, 1, 6);
		Shape21.setRotationPoint(-1F, 3.2F, 14F);
		Shape21.setTextureSize(64, 64);
		Shape21.mirror = true;
		setRotation(Shape21, 0.3839724F, 0F, 0F);
		Shape22 = new ModelRenderer(this, 12, 22);
		Shape22.addBox(-3F, -2F, 0F, 4, 4, 1);
		Shape22.setRotationPoint(1F, -0.5F, -9F);
		Shape22.setTextureSize(64, 64);
		Shape22.mirror = true;
		setRotation(Shape22, 0F, 0F, 0F);
		Glow1 = new ModelRenderer(this, 0, 52);
		Glow1.addBox(-3F, -2.5F, 0F, 5, 4, 8);
		Glow1.setRotationPoint(0.5F, 0F, -4F);
		Glow1.setTextureSize(64, 64);
		Glow1.mirror = true;
		setRotation(Glow1, 0F, 0F, 0F);
		Glow4 = new ModelRenderer(this, 0, 52);
		Glow4.addBox(-3F, -2.5F, 0F, 3, 3, 7);
		Glow4.setRotationPoint(1.5F, 4F, -7.5F);
		Glow4.setTextureSize(64, 64);
		Glow4.mirror = true;
		setRotation(Glow4, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale, int ammoLeft,
			float reloadProgress, TransformType transformType, int part, float fireProgress, float chargeProgress) {
	
		Shape2.render(scale);
		Shape4.render(scale);
		Shape5.render(scale);
		Shape6.render(scale);
		Shape7.render(scale);
		Shape8.render(scale);
		Shape9.render(scale);
		Shape10.render(scale);
		Shape11.render(scale);
		Shape12.render(scale);
		Shape13.render(scale);
		Shape14.render(scale);
		Shape15.render(scale);
		Shape16.render(scale);
		Shape17.render(scale);
		Shape18.render(scale);
		Shape19.render(scale);
		Shape20.render(scale);
		Shape21.render(scale);
		Shape22.render(scale);
		
		TGRenderHelper.enableFXLighting();
		Glow3.render(scale);
		Glow2.render(scale);
		Glow1.render(scale);
		Glow4.render(scale);
		TGRenderHelper.disableFXLighting();
	}
}
