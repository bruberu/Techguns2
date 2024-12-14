package techguns.client.models.guns;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.Entity;

import techguns.client.models.ModelMultipart;

public class ModelRevolver extends ModelMultipart {

    // fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape12;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape18;
    ModelRenderer Shape19;
    ModelRenderer Shape20;
    ModelRenderer Shape21;
    ModelRenderer Shape22;

    public ModelRevolver() {
        textureWidth = 64;
        textureHeight = 32;

        Shape1 = new ModelRenderer(this, 0, 4);
        Shape1.addBox(0F, -0.5F, -0.5F, 8, 1, 1);
        Shape1.setRotationPoint(9F, 1F, 1F);
        Shape1.setTextureSize(64, 32);
        Shape1.mirror = true;
        setRotation(Shape1, 0.7853982F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 32, 0);
        Shape2.addBox(1F, 0F, 0.5F, 2, 1, 1);
        Shape2.setRotationPoint(19.5F, -2.8F, 0F);
        Shape2.setTextureSize(64, 32);
        Shape2.mirror = true;
        setRotation(Shape2, 0F, 0F, 0F);
        Shape3 = new ModelRenderer(this, 32, 5);
        Shape3.addBox(0F, 0F, 0F, 1, 1, 1);
        Shape3.setRotationPoint(-3.5F, -1F, 0.5F);
        Shape3.setTextureSize(64, 32);
        Shape3.mirror = true;
        setRotation(Shape3, 0F, 0F, 0F);
        Shape4 = new ModelRenderer(this, 0, 0);
        Shape4.addBox(0F, -1F, -1F, 14, 2, 2);
        Shape4.setRotationPoint(9F, -1F, 1F);
        Shape4.setTextureSize(64, 32);
        Shape4.mirror = true;
        setRotation(Shape4, 0.7853982F, 0F, 0F);
        Shape5 = new ModelRenderer(this, 32, 2);
        Shape5.addBox(0F, 0F, 0F, 2, 2, 1);
        Shape5.setRotationPoint(-2.5F, -1F, 0.5F);
        Shape5.setTextureSize(64, 32);
        Shape5.mirror = true;
        setRotation(Shape5, 0F, 0F, 0F);
        Shape6 = new ModelRenderer(this, 0, 18);
        Shape6.addBox(0F, 0F, 0F, 5, 1, 4);
        Shape6.setRotationPoint(1.5F, 1F, -1F);
        Shape6.setTextureSize(64, 32);
        Shape6.mirror = true;
        setRotation(Shape6, 0F, 0F, 0F);
        Shape7 = new ModelRenderer(this, 50, 15);
        Shape7.addBox(0F, 0F, 0F, 3, 0, 2);
        Shape7.setRotationPoint(3F, 5.5F, 0F);
        Shape7.setTextureSize(64, 32);
        Shape7.mirror = true;
        setRotation(Shape7, 0F, 0F, 0F);
        Shape8 = new ModelRenderer(this, 42, 0);
        Shape8.addBox(0F, 0F, 0F, 9, 1, 2);
        Shape8.setRotationPoint(0F, -2.5F, 0F);
        Shape8.setTextureSize(64, 32);
        Shape8.mirror = true;
        setRotation(Shape8, 0F, 0F, 0F);
        Shape9 = new ModelRenderer(this, 42, 12);
        Shape9.addBox(0F, 0F, 0F, 6, 1, 2);
        Shape9.setRotationPoint(2F, 2.5F, 0F);
        Shape9.setTextureSize(64, 32);
        Shape9.mirror = true;
        setRotation(Shape9, 0F, 0F, 0F);
        Shape10 = new ModelRenderer(this, 42, 8);
        Shape10.addBox(0F, 0F, 0F, 9, 2, 2);
        Shape10.setRotationPoint(0F, 0.5F, 0F);
        Shape10.setTextureSize(64, 32);
        Shape10.mirror = true;
        setRotation(Shape10, 0F, 0F, 0F);
        Shape12 = new ModelRenderer(this, 58, 12);
        Shape12.addBox(0F, 0F, 0F, 1, 2, 2);
        Shape12.setRotationPoint(6F, 3.5F, 0F);
        Shape12.setTextureSize(64, 32);
        Shape12.mirror = true;
        setRotation(Shape12, 0F, 0F, 0F);
        Shape14 = new ModelRenderer(this, 24, 4);
        Shape14.addBox(0F, 0F, 0F, 2, 2, 2);
        Shape14.setRotationPoint(-3F, 0.5F, 0F);
        Shape14.setTextureSize(64, 32);
        Shape14.mirror = true;
        setRotation(Shape14, 0F, 0F, 0F);
        Shape15 = new ModelRenderer(this, 58, 12);
        Shape15.addBox(0F, 0F, 0F, 1, 2, 2);
        Shape15.setRotationPoint(2F, 3.5F, 0F);
        Shape15.setTextureSize(64, 32);
        Shape15.mirror = true;
        setRotation(Shape15, 0F, 0F, 0F);
        Shape16 = new ModelRenderer(this, 26, 8);
        Shape16.addBox(0F, 0F, 0F, 6, 2, 2);
        Shape16.setRotationPoint(-4F, 2.5F, 0F);
        Shape16.setTextureSize(64, 32);
        Shape16.mirror = true;
        setRotation(Shape16, 0F, 0F, 0F);
        Shape17 = new ModelRenderer(this, 25, 12);
        Shape17.addBox(0F, 0F, 0F, 4, 2, 2);
        Shape17.setRotationPoint(-4F, 4.5F, 0F);
        Shape17.setTextureSize(64, 32);
        Shape17.mirror = true;
        setRotation(Shape17, 0F, 0F, 0F);
        Shape18 = new ModelRenderer(this, 25, 16);
        Shape18.addBox(-3F, 0F, 0F, 4, 5, 2);
        Shape18.setRotationPoint(-2F, 6.5F, 0F);
        Shape18.setTextureSize(64, 32);
        Shape18.mirror = true;
        setRotation(Shape18, 0F, 0F, 0F);
        Shape19 = new ModelRenderer(this, 37, 15);
        Shape19.addBox(0F, 0F, 0F, 1, 4, 2);
        Shape19.setRotationPoint(-1F, -1.5F, 0F);
        Shape19.setTextureSize(64, 32);
        Shape19.mirror = true;
        setRotation(Shape19, 0F, 0F, 0F);
        Shape20 = new ModelRenderer(this, 40, 3);
        Shape20.addBox(0F, 0F, 0F, 9, 2, 3);
        Shape20.setRotationPoint(0F, -1.5F, -0.5F);
        Shape20.setTextureSize(64, 32);
        Shape20.mirror = true;
        setRotation(Shape20, 0F, 0F, 0F);
        Shape21 = new ModelRenderer(this, 0, 11);
        Shape21.addBox(0F, 0F, 0F, 5, 2, 5);
        Shape21.setRotationPoint(1.5F, -1F, -1.5F);
        Shape21.setTextureSize(64, 32);
        Shape21.mirror = true;
        setRotation(Shape21, 0F, 0F, 0F);
        Shape22 = new ModelRenderer(this, 0, 6);
        Shape22.addBox(0F, 0F, 0F, 5, 1, 4);
        Shape22.setRotationPoint(1.5F, -2F, -1F);
        Shape22.setTextureSize(64, 32);
        Shape22.mirror = true;
        setRotation(Shape22, 0F, 0F, 0F);
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
                       float headPitch, float scale, int ammoLeft,
                       float reloadProgress, TransformType transformType, int part, float fireProgress,
                       float chargeProgress) {
        Shape1.render(scale);
        Shape2.render(scale);
        Shape3.render(scale);
        Shape4.render(scale);
        Shape5.render(scale);
        Shape6.render(scale);
        Shape7.render(scale);
        Shape8.render(scale);
        Shape9.render(scale);
        Shape10.render(scale);
        Shape12.render(scale);
        Shape14.render(scale);
        Shape15.render(scale);
        Shape16.render(scale);
        Shape17.render(scale);
        Shape18.render(scale);
        Shape19.render(scale);
        Shape20.render(scale);
        Shape21.render(scale);
        Shape22.render(scale);
    }
}
