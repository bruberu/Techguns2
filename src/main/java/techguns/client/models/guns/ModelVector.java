package techguns.client.models.guns;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.Entity;

import techguns.client.models.ModelMultipart;

public class ModelVector extends ModelMultipart {

    public ModelRenderer Grip1;
    public ModelRenderer Trigger02;
    public ModelRenderer Grip02;
    public ModelRenderer Eotech01;
    public ModelRenderer Receiver03;
    public ModelRenderer TopRails;
    public ModelRenderer Eotech02;
    public ModelRenderer Eotech03;
    public ModelRenderer Eotech04;
    public ModelRenderer Grip01;
    public ModelRenderer RedDot;
    public ModelRenderer Receiver02;
    public ModelRenderer Receiver03_1;
    public ModelRenderer Receiver04;
    public ModelRenderer FrontRails01;
    public ModelRenderer Grip03;
    public ModelRenderer Bottom;
    public ModelRenderer Receiver05;
    public ModelRenderer Bottom2;
    public ModelRenderer Barrel;
    public ModelRenderer Barrel02;
    public ModelRenderer Magazine;
    public ModelRenderer stock;
    public ModelRenderer stock02;
    public ModelRenderer stock03;
    public ModelRenderer stock04;
    public ModelRenderer stock05;
    public ModelRenderer stock06;

    public ModelVector() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.stock03 = new ModelRenderer(this, 82, 16);
        this.stock03.setRotationPoint(-2.0F, -0.2F, 25.0F);
        this.stock03.addBox(0.0F, 0.0F, 0.0F, 3, 10, 2, 0.0F);
        this.Receiver04 = new ModelRenderer(this, 34, 0);
        this.Receiver04.setRotationPoint(-2.0F, 0.0F, -14.0F);
        this.Receiver04.addBox(0.0F, 0.0F, 0.0F, 3, 3, 10, 0.0F);
        this.Eotech03 = new ModelRenderer(this, 0, 10);
        this.Eotech03.setRotationPoint(-0.5F, -7.7F, 0.4F);
        this.Eotech03.addBox(-2.0F, -0.5F, -2.0F, 4, 1, 4, 0.0F);
        this.stock = new ModelRenderer(this, 72, 0);
        this.stock.setRotationPoint(0.0F, -2.0F, 11.0F);
        this.stock.addBox(-2.0F, 0.0F, 0.0F, 3, 2, 11, 0.0F);
        this.Receiver03 = new ModelRenderer(this, 0, 0);
        this.Receiver03.setRotationPoint(-0.5F, -3.0F, -14.0F);
        this.Receiver03.addBox(-2.0F, 0.0F, 0.0F, 4, 3, 25, 0.0F);
        this.Eotech02 = new ModelRenderer(this, 65, 32);
        this.Eotech02.setRotationPoint(-0.5F, -4.5F, -1.0F);
        this.Eotech02.addBox(-2.0F, -1.5F, -4.5F, 4, 3, 9, 0.0F);
        this.stock04 = new ModelRenderer(this, 72, 20);
        this.stock04.setRotationPoint(-0.5F, 7.3F, 23.0F);
        this.stock04.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotation(stock04, 0.0F, 0.0F, 0.7853981633974483F);
        this.Barrel02 = new ModelRenderer(this, 10, 0);
        this.Barrel02.setRotationPoint(-0.5F, 1.2F, -17.0F);
        this.Barrel02.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotation(Barrel02, 0.0F, -0.0F, 0.7853981633974483F);
        this.FrontRails01 = new ModelRenderer(this, 37, 16);
        this.FrontRails01.setRotationPoint(-1.5F, 3.0F, -13.5F);
        this.FrontRails01.addBox(0.0F, 0.0F, 0.0F, 2, 1, 7, 0.0F);
        this.Grip1 = new ModelRenderer(this, 0, 29);
        this.Grip1.setRotationPoint(-2.0F, -0.1F, 5.9F);
        this.Grip1.addBox(0.0F, 0.0F, 0.0F, 3, 10, 4, 0.0F);
        this.setRotation(Grip1, 0.3490658503988659F, -0.0F, 0.0F);
        this.Bottom = new ModelRenderer(this, 94, 12);
        this.Bottom.setRotationPoint(-1.0F, 9.4F, -4.2F);
        this.Bottom.addBox(-1.0F, 0.0F, 0.0F, 3, 1, 10, 0.0F);
        this.Magazine = new ModelRenderer(this, 60, 0);
        this.Magazine.setRotationPoint(-0.5F, 9.0F, -4.3F);
        this.Magazine.addBox(-1.0F, 0.0F, 0.0F, 2, 11, 3, 0.0F);
        this.setRotation(Magazine, 0.3490658503988659F, -0.0F, 0.0F);
        this.Receiver05 = new ModelRenderer(this, 11, 16);
        this.Receiver05.setRotationPoint(-0.5F, 9.6F, 5.9F);
        this.Receiver05.addBox(-1.5F, -1.0F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotation(Receiver05, -0.3490658503988659F, 0.0F, 0.0F);
        this.Barrel = new ModelRenderer(this, 17, 0);
        this.Barrel.setRotationPoint(-0.5F, 1.2F, -16.0F);
        this.Barrel.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotation(Barrel, 0.0F, 0.0F, 0.7853981633974483F);
        this.Grip02 = new ModelRenderer(this, 35, 13);
        this.Grip02.setRotationPoint(-2.0F, 4.0F, -10.5F);
        this.Grip02.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotation(Grip02, 0.0F, 0.7853981633974483F, 0.0F);
        this.TopRails = new ModelRenderer(this, 36, 23);
        this.TopRails.setRotationPoint(-1.5F, -4.0F, -13.0F);
        this.TopRails.addBox(0.0F, 0.0F, 0.0F, 2, 1, 23, 0.0F);
        this.Bottom2 = new ModelRenderer(this, 91, 0);
        this.Bottom2.setRotationPoint(-1.0F, 8.4F, -3.5F);
        this.Bottom2.addBox(-1.0F, 0.0F, 0.0F, 3, 1, 9, 0.0F);
        this.RedDot = new ModelRenderer(this, 0, 11);
        this.RedDot.setRotationPoint(-1.0F, -7.1F, 1.0F);
        this.RedDot.addBox(0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F);
        this.Grip01 = new ModelRenderer(this, 49, 14);
        this.Grip01.setRotationPoint(-2.0F, 3.1F, -12.5F);
        this.Grip01.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.Eotech01 = new ModelRenderer(this, 0, 3);
        this.Eotech01.setRotationPoint(0.7F, -6.5F, 2.0F);
        this.Eotech01.addBox(-0.5F, -1.0F, -4.0F, 1, 2, 4, 0.0F);
        this.stock02 = new ModelRenderer(this, 64, 15);
        this.stock02.setRotationPoint(-1.0F, -1.1F, 20.1F);
        this.stock02.addBox(0.0F, 0.0F, 0.0F, 1, 10, 2, 0.0F);
        this.setRotation(stock02, 0.3490658503988659F, -0.0F, 0.0F);
        this.stock05 = new ModelRenderer(this, 72, 25);
        this.stock05.setRotationPoint(-0.5F, 1.8F, 21.0F);
        this.stock05.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotation(stock05, 0.0F, -0.0F, 0.7853981633974483F);
        this.Receiver02 = new ModelRenderer(this, 16, 29);
        this.Receiver02.setRotationPoint(-1.0F, 0.0F, -3.0F);
        this.Receiver02.addBox(-1.0F, 0.0F, 0.0F, 3, 11, 5, 0.0F);
        this.setRotation(Receiver02, 0.3490658503988659F, -0.0F, 0.0F);
        this.stock06 = new ModelRenderer(this, 83, 30);
        this.stock06.setRotationPoint(-0.5F, -3.0F, 11.0F);
        this.stock06.addBox(-1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.setRotation(stock06, -0.3490658503988659F, 0.0F, 0.0F);
        this.Eotech04 = new ModelRenderer(this, 0, 3);
        this.Eotech04.setRotationPoint(-1.7F, -6.5F, 0.4F);
        this.Eotech04.addBox(-0.5F, -1.0F, -2.0F, 1, 2, 4, 0.0F);
        this.Receiver03_1 = new ModelRenderer(this, 34, 29);
        this.Receiver03_1.setRotationPoint(-1.0F, 0.0F, -8.0F);
        this.Receiver03_1.addBox(-1.0F, 0.0F, 0.0F, 3, 11, 5, 0.0F);
        this.setRotation(Receiver03_1, 0.3490658503988659F, -0.0F, 0.0F);
        this.Grip03 = new ModelRenderer(this, 0, 19);
        this.Grip03.setRotationPoint(-0.5F, 9.5F, 5.3F);
        this.Grip03.addBox(-1.5F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.setRotation(Grip03, 0.31066860685499065F, -0.0F, 0.0F);
        this.Trigger02 = new ModelRenderer(this, 20, 20);
        this.Trigger02.setRotationPoint(-1.0F, -0.5F, 5.0F);
        this.Trigger02.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotation(Trigger02, -0.17453292519943295F, -0.0F, 0.0F);
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
                       float headPitch, float scale, int ammoLeft,
                       float reloadProgress, TransformType transformType, int part, float fireProgress,
                       float chargeProgress) {
        this.stock03.render(scale);
        this.Receiver04.render(scale);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Eotech03.offsetX, this.Eotech03.offsetY, this.Eotech03.offsetZ);
        GlStateManager.translate(this.Eotech03.rotationPointX * scale, this.Eotech03.rotationPointY * scale,
                this.Eotech03.rotationPointZ * scale);
        GlStateManager.scale(0.8D, 0.8D, 0.8D);
        GlStateManager.translate(-this.Eotech03.offsetX, -this.Eotech03.offsetY, -this.Eotech03.offsetZ);
        GlStateManager.translate(-this.Eotech03.rotationPointX * scale, -this.Eotech03.rotationPointY * scale,
                -this.Eotech03.rotationPointZ * scale);
        this.Eotech03.render(scale);
        GlStateManager.popMatrix();
        this.stock.render(scale);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Receiver03.offsetX, this.Receiver03.offsetY, this.Receiver03.offsetZ);
        GlStateManager.translate(this.Receiver03.rotationPointX * scale, this.Receiver03.rotationPointY * scale,
                this.Receiver03.rotationPointZ * scale);
        GlStateManager.scale(0.8D, 1.0D, 1.0D);
        GlStateManager.translate(-this.Receiver03.offsetX, -this.Receiver03.offsetY, -this.Receiver03.offsetZ);
        GlStateManager.translate(-this.Receiver03.rotationPointX * scale, -this.Receiver03.rotationPointY * scale,
                -this.Receiver03.rotationPointZ * scale);
        this.Receiver03.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Eotech02.offsetX, this.Eotech02.offsetY, this.Eotech02.offsetZ);
        GlStateManager.translate(this.Eotech02.rotationPointX * scale, this.Eotech02.rotationPointY * scale,
                this.Eotech02.rotationPointZ * scale);
        GlStateManager.scale(0.8D, 0.8D, 0.8D);
        GlStateManager.translate(-this.Eotech02.offsetX, -this.Eotech02.offsetY, -this.Eotech02.offsetZ);
        GlStateManager.translate(-this.Eotech02.rotationPointX * scale, -this.Eotech02.rotationPointY * scale,
                -this.Eotech02.rotationPointZ * scale);
        this.Eotech02.render(scale);
        GlStateManager.popMatrix();
        this.stock04.render(scale);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Barrel02.offsetX, this.Barrel02.offsetY, this.Barrel02.offsetZ);
        GlStateManager.translate(this.Barrel02.rotationPointX * scale, this.Barrel02.rotationPointY * scale,
                this.Barrel02.rotationPointZ * scale);
        GlStateManager.scale(0.7D, 0.7D, 1.0D);
        GlStateManager.translate(-this.Barrel02.offsetX, -this.Barrel02.offsetY, -this.Barrel02.offsetZ);
        GlStateManager.translate(-this.Barrel02.rotationPointX * scale, -this.Barrel02.rotationPointY * scale,
                -this.Barrel02.rotationPointZ * scale);
        this.Barrel02.render(scale);
        GlStateManager.popMatrix();
        this.FrontRails01.render(scale);
        this.Grip1.render(scale);
        this.Bottom.render(scale);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Magazine.offsetX, this.Magazine.offsetY, this.Magazine.offsetZ);
        GlStateManager.translate(this.Magazine.rotationPointX * scale, this.Magazine.rotationPointY * scale,
                this.Magazine.rotationPointZ * scale);
        GlStateManager.scale(0.99D, 1.0D, 1.0D);
        GlStateManager.translate(-this.Magazine.offsetX, -this.Magazine.offsetY, -this.Magazine.offsetZ);
        GlStateManager.translate(-this.Magazine.rotationPointX * scale, -this.Magazine.rotationPointY * scale,
                -this.Magazine.rotationPointZ * scale);
        this.Magazine.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Receiver05.offsetX, this.Receiver05.offsetY, this.Receiver05.offsetZ);
        GlStateManager.translate(this.Receiver05.rotationPointX * scale, this.Receiver05.rotationPointY * scale,
                this.Receiver05.rotationPointZ * scale);
        GlStateManager.scale(0.98D, 1.0D, 1.0D);
        GlStateManager.translate(-this.Receiver05.offsetX, -this.Receiver05.offsetY, -this.Receiver05.offsetZ);
        GlStateManager.translate(-this.Receiver05.rotationPointX * scale, -this.Receiver05.rotationPointY * scale,
                -this.Receiver05.rotationPointZ * scale);
        this.Receiver05.render(scale);
        GlStateManager.popMatrix();
        this.Barrel.render(scale);
        this.Grip02.render(scale);
        this.TopRails.render(scale);
        this.Bottom2.render(scale);
        this.RedDot.render(scale);
        this.Grip01.render(scale);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Eotech01.offsetX, this.Eotech01.offsetY, this.Eotech01.offsetZ);
        GlStateManager.translate(this.Eotech01.rotationPointX * scale, this.Eotech01.rotationPointY * scale,
                this.Eotech01.rotationPointZ * scale);
        GlStateManager.scale(0.8D, 0.8D, 0.8D);
        GlStateManager.translate(-this.Eotech01.offsetX, -this.Eotech01.offsetY, -this.Eotech01.offsetZ);
        GlStateManager.translate(-this.Eotech01.rotationPointX * scale, -this.Eotech01.rotationPointY * scale,
                -this.Eotech01.rotationPointZ * scale);
        this.Eotech01.render(scale);
        GlStateManager.popMatrix();
        this.stock02.render(scale);
        this.stock05.render(scale);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Receiver02.offsetX, this.Receiver02.offsetY, this.Receiver02.offsetZ);
        GlStateManager.translate(this.Receiver02.rotationPointX * scale, this.Receiver02.rotationPointY * scale,
                this.Receiver02.rotationPointZ * scale);
        GlStateManager.scale(0.99D, 1.0D, 1.0D);
        GlStateManager.translate(-this.Receiver02.offsetX, -this.Receiver02.offsetY, -this.Receiver02.offsetZ);
        GlStateManager.translate(-this.Receiver02.rotationPointX * scale, -this.Receiver02.rotationPointY * scale,
                -this.Receiver02.rotationPointZ * scale);
        this.Receiver02.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.stock06.offsetX, this.stock06.offsetY, this.stock06.offsetZ);
        GlStateManager.translate(this.stock06.rotationPointX * scale, this.stock06.rotationPointY * scale,
                this.stock06.rotationPointZ * scale);
        GlStateManager.scale(0.99D, 1.0D, 1.0D);
        GlStateManager.translate(-this.stock06.offsetX, -this.stock06.offsetY, -this.stock06.offsetZ);
        GlStateManager.translate(-this.stock06.rotationPointX * scale, -this.stock06.rotationPointY * scale,
                -this.stock06.rotationPointZ * scale);
        this.stock06.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Eotech04.offsetX, this.Eotech04.offsetY, this.Eotech04.offsetZ);
        GlStateManager.translate(this.Eotech04.rotationPointX * scale, this.Eotech04.rotationPointY * scale,
                this.Eotech04.rotationPointZ * scale);
        GlStateManager.scale(0.8D, 0.8D, 0.8D);
        GlStateManager.translate(-this.Eotech04.offsetX, -this.Eotech04.offsetY, -this.Eotech04.offsetZ);
        GlStateManager.translate(-this.Eotech04.rotationPointX * scale, -this.Eotech04.rotationPointY * scale,
                -this.Eotech04.rotationPointZ * scale);
        this.Eotech04.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Receiver03_1.offsetX, this.Receiver03_1.offsetY, this.Receiver03_1.offsetZ);
        GlStateManager.translate(this.Receiver03_1.rotationPointX * scale, this.Receiver03_1.rotationPointY * scale,
                this.Receiver03_1.rotationPointZ * scale);
        GlStateManager.scale(0.99D, 1.0D, 1.0D);
        GlStateManager.translate(-this.Receiver03_1.offsetX, -this.Receiver03_1.offsetY, -this.Receiver03_1.offsetZ);
        GlStateManager.translate(-this.Receiver03_1.rotationPointX * scale, -this.Receiver03_1.rotationPointY * scale,
                -this.Receiver03_1.rotationPointZ * scale);
        this.Receiver03_1.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Grip03.offsetX, this.Grip03.offsetY, this.Grip03.offsetZ);
        GlStateManager.translate(this.Grip03.rotationPointX * scale, this.Grip03.rotationPointY * scale,
                this.Grip03.rotationPointZ * scale);
        GlStateManager.scale(0.99D, 1.0D, 1.0D);
        GlStateManager.translate(-this.Grip03.offsetX, -this.Grip03.offsetY, -this.Grip03.offsetZ);
        GlStateManager.translate(-this.Grip03.rotationPointX * scale, -this.Grip03.rotationPointY * scale,
                -this.Grip03.rotationPointZ * scale);
        this.Grip03.render(scale);
        GlStateManager.popMatrix();
        this.Trigger02.render(scale);
    }
}
