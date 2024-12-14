package techguns.client.models.guns;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.Entity;

import techguns.client.models.ModelMultipart;

public class ModelBoltaction extends ModelMultipart {

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
    ModelRenderer Bolt;
    ModelRenderer Lever;

    public ModelBoltaction() {
        textureWidth = 128;
        textureHeight = 32;

        Shape1 = new ModelRenderer(this, 0, 0);
        Shape1.addBox(0F, 0F, 1F, 38, 2, 2);
        Shape1.setRotationPoint(-3.5F, -2.5F, -1.5F);
        Shape1.setTextureSize(128, 32);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 44, 24);
        Shape2.addBox(0F, 0F, 0F, 9, 2, 1);
        Shape2.setRotationPoint(-19F, 0F, -2F);
        Shape2.setTextureSize(128, 32);
        Shape2.mirror = true;
        setRotation(Shape2, 0F, 0F, 0F);
        Shape3 = new ModelRenderer(this, 20, 16);
        Shape3.addBox(0F, 0F, 0F, 3, 1, 3);
        Shape3.setRotationPoint(-16F, 3F, -1F);
        Shape3.setTextureSize(128, 32);
        Shape3.mirror = true;
        setRotation(Shape3, 0F, 0F, 0F);
        Shape4 = new ModelRenderer(this, 44, 24);
        Shape4.addBox(0F, 0F, 0F, 9, 2, 1);
        Shape4.setRotationPoint(-19F, 0F, 2F);
        Shape4.setTextureSize(128, 32);
        Shape4.mirror = true;
        setRotation(Shape4, 0F, 0F, 0F);
        Shape5 = new ModelRenderer(this, 32, 17);
        Shape5.addBox(0F, 0F, 0F, 3, 7, 3);
        Shape5.setRotationPoint(-19F, -1F, -1F);
        Shape5.setTextureSize(128, 32);
        Shape5.mirror = true;
        setRotation(Shape5, 0F, 0F, 0F);
        Shape6 = new ModelRenderer(this, 44, 17);
        Shape6.addBox(0F, 0F, 0F, 8, 4, 3);
        Shape6.setRotationPoint(-16F, -1F, -1F);
        Shape6.setTextureSize(128, 32);
        Shape6.mirror = true;
        setRotation(Shape6, 0F, 0F, 0F);
        Shape7 = new ModelRenderer(this, 10, 16);
        Shape7.addBox(0F, 0F, 0F, 2, 1, 3);
        Shape7.setRotationPoint(-9F, 3F, -1F);
        Shape7.setTextureSize(128, 32);
        Shape7.mirror = true;
        setRotation(Shape7, 0F, 0F, 0F);
        Shape8 = new ModelRenderer(this, 0, 12);
        Shape8.addBox(0F, 0F, 0F, 13, 1, 3);
        Shape8.setRotationPoint(1F, 0F, -1F);
        Shape8.setTextureSize(128, 32);
        Shape8.mirror = true;
        setRotation(Shape8, 0F, 0F, 0F);
        Shape9 = new ModelRenderer(this, 0, 8);
        Shape9.addBox(0F, 0F, 0F, 24, 1, 3);
        Shape9.setRotationPoint(-5F, -1F, -1F);
        Shape9.setTextureSize(128, 32);
        Shape9.mirror = true;
        setRotation(Shape9, 0F, 0F, 0F);
        Shape10 = new ModelRenderer(this, 54, 4);
        Shape10.addBox(0F, 0F, 0F, 1, 2, 3);
        Shape10.setRotationPoint(1F, -3F, -1F);
        Shape10.setTextureSize(128, 32);
        Shape10.mirror = true;
        setRotation(Shape10, 0F, 0F, 0F);
        Shape11 = new ModelRenderer(this, 32, 12);
        Shape11.addBox(0F, 0F, 0F, 7, 2, 3);
        Shape11.setRotationPoint(-6F, 0F, -1F);
        Shape11.setTextureSize(128, 32);
        Shape11.mirror = true;
        setRotation(Shape11, 0F, 0F, 0F);
        Shape12 = new ModelRenderer(this, 0, 16);
        Shape12.addBox(0F, 0F, 0F, 2, 3, 3);
        Shape12.setRotationPoint(-8F, 0F, -1F);
        Shape12.setTextureSize(128, 32);
        Shape12.mirror = true;
        setRotation(Shape12, 0F, 0F, 0F);
        Shape13 = new ModelRenderer(this, 69, 11);
        Shape13.addBox(0F, 0F, 0F, 3, 3, 3);
        Shape13.setRotationPoint(-7F, -6F, -1F);
        Shape13.setTextureSize(128, 32);
        Shape13.mirror = true;
        setRotation(Shape13, 0F, 0F, 0F);
        Shape14 = new ModelRenderer(this, 54, 4);
        Shape14.addBox(0F, 0F, 0F, 1, 2, 3);
        Shape14.setRotationPoint(-3F, -3F, -1F);
        Shape14.setTextureSize(128, 32);
        Shape14.mirror = true;
        setRotation(Shape14, 0F, 0F, 0F);
        Shape15 = new ModelRenderer(this, 50, 4);
        Shape15.addBox(0F, 0F, 0F, 1, 1, 1);
        Shape15.setRotationPoint(-3F, -4F, 0F);
        Shape15.setTextureSize(128, 32);
        Shape15.mirror = true;
        setRotation(Shape15, 0F, 0F, 0F);
        Shape16 = new ModelRenderer(this, 50, 4);
        Shape16.addBox(0F, 0F, 0F, 1, 1, 1);
        Shape16.setRotationPoint(1F, -4F, 0F);
        Shape16.setTextureSize(128, 32);
        Shape16.mirror = true;
        setRotation(Shape16, 0F, 0F, 0F);
        Shape17 = new ModelRenderer(this, 63, 9);
        Shape17.addBox(0F, 0F, 0F, 1, 1, 1);
        Shape17.setRotationPoint(-1F, -5F, -1F);
        Shape17.setTextureSize(128, 32);
        Shape17.mirror = true;
        setRotation(Shape17, 0F, 0F, 0F);
        Shape18 = new ModelRenderer(this, 57, 11);
        Shape18.addBox(0F, 0F, 0F, 3, 3, 3);
        Shape18.setRotationPoint(3F, -6F, -1F);
        Shape18.setTextureSize(128, 32);
        Shape18.mirror = true;
        setRotation(Shape18, 0F, 0F, 0F);
        Shape19 = new ModelRenderer(this, 62, 4);
        Shape19.addBox(0F, 0F, 0F, 8, 2, 2);
        Shape19.setRotationPoint(-5F, -5.5F, -0.5F);
        Shape19.setTextureSize(128, 32);
        Shape19.mirror = true;
        setRotation(Shape19, 0F, 0F, 0F);
        Shape20 = new ModelRenderer(this, 67, 8);
        Shape20.addBox(0F, 0F, 0F, 2, 2, 1);
        Shape20.setRotationPoint(-1.5F, -5.5F, 1.5F);
        Shape20.setTextureSize(128, 32);
        Shape20.mirror = true;
        setRotation(Shape20, 0F, 0F, 0F);
        Bolt = new ModelRenderer(this, 0, 4);
        Bolt.addBox(0F, 0F, 0F, 7, 1, 1);
        Bolt.setRotationPoint(-5.5F, -2F, 0F);
        Bolt.setTextureSize(128, 32);
        Bolt.mirror = true;
        setRotation(Bolt, 0F, 0F, 0F);
        Lever = new ModelRenderer(this, 16, 4);
        Lever.addBox(0F, -1F, -3F, 1, 1, 3);
        Lever.setRotationPoint(-4.5F, -1F, 0F);
        Lever.setTextureSize(128, 32);
        Lever.mirror = true;
        setRotation(Lever, 0F, 0F, 0F);
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
        Bolt.render(scale);
        Lever.render(scale);
    }
}
