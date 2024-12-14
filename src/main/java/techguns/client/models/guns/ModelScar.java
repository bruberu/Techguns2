package techguns.client.models.guns;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.Entity;

import techguns.client.models.ModelMultipart;

public class ModelScar extends ModelMultipart {

    public ModelRenderer Grip1;
    public ModelRenderer Trigger01;
    public ModelRenderer Trigger02;
    public ModelRenderer BarrelRails01;
    public ModelRenderer BarrelRails02;
    public ModelRenderer Barrel;
    public ModelRenderer Receiver03;
    public ModelRenderer Magazine01;
    public ModelRenderer TopRails;
    public ModelRenderer Grip01;
    public ModelRenderer BarrelRails04;
    public ModelRenderer MagSocket;
    public ModelRenderer Receiver01;
    public ModelRenderer Receiver04;
    public ModelRenderer Receiver05;
    public ModelRenderer Stock01;
    public ModelRenderer Stock02;
    public ModelRenderer StockMount;
    public ModelRenderer Stock03;
    public ModelRenderer Stock04;
    public ModelRenderer Stock05;
    public ModelRenderer BarrelMount01;
    public ModelRenderer BarrelMiniPart;
    public ModelRenderer BarrelMount02;
    public ModelRenderer Muzzle;
    public ModelRenderer FrontSights;
    public ModelRenderer FrontSightsMount;
    public ModelRenderer BackSightsMount;
    public ModelRenderer BackSightsMount2;
    public ModelRenderer BackSights;
    public ModelRenderer Grip02;
    public ModelRenderer Grip03;
    public ModelRenderer Grip04;
    public ModelRenderer Grip05;
    public ModelRenderer Grip06;
    public ModelRenderer Bolt;
    public ModelRenderer ScopeMount;
    public ModelRenderer ScopePlate;
    public ModelRenderer Scope01;
    public ModelRenderer Scope02;
    public ModelRenderer Scope03;
    public ModelRenderer Scope04;
    public ModelRenderer Scope05;
    public ModelRenderer Stock06;
    public ModelRenderer StockMount02;

    public ModelScar() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.StockMount = new ModelRenderer(this, 0, 0);
        this.StockMount.setRotationPoint(-2.5F, -6.5F, 11.5F);
        this.StockMount.addBox(0.0F, 0.0F, 0.0F, 4, 7, 2, 0.0F);
        this.Grip03 = new ModelRenderer(this, 111, 9);
        this.Grip03.setRotationPoint(-1.5F, -0.5F, -16.5F);
        this.Grip03.addBox(0.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotation(Grip03, -0.6981317007977318F, 0.0F, 0.0F);
        this.Grip04 = new ModelRenderer(this, 98, 7);
        this.Grip04.setRotationPoint(-1.5F, -0.1F, -10.5F);
        this.Grip04.addBox(0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
        this.setRotation(Grip04, -1.9198621771937625F, 0.0F, 0.0F);
        this.Receiver03 = new ModelRenderer(this, 46, 36);
        this.Receiver03.setRotationPoint(-2.0F, -1.0F, -6.0F);
        this.Receiver03.addBox(0.0F, 0.0F, 0.0F, 3, 3, 16, 0.0F);
        this.Grip1 = new ModelRenderer(this, 68, 0);
        this.Grip1.setRotationPoint(-0.5F, 2.0F, 6.0F);
        this.Grip1.addBox(-1.5F, 0.0F, 0.0F, 3, 9, 4, 0.0F);
        this.setRotation(Grip1, 0.4461061568097506F, -0.0F, 0.0F);
        this.Stock01 = new ModelRenderer(this, 34, 0);
        this.Stock01.setRotationPoint(-2.0F, -2.5F, 13.0F);
        this.Stock01.addBox(0.0F, 0.0F, 0.0F, 3, 3, 10, 0.0F);
        this.BackSightsMount2 = new ModelRenderer(this, 22, 5);
        this.BackSightsMount2.setRotationPoint(-0.5F, -7.0F, 9.0F);
        this.BackSightsMount2.addBox(-2.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F);
        this.setRotation(BackSightsMount2, -0.7853981633974483F, 0.0F, 0.0F);
        this.Grip05 = new ModelRenderer(this, 53, 0);
        this.Grip05.setRotationPoint(-1.5F, 0.3F, -21.3F);
        this.Grip05.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.Muzzle = new ModelRenderer(this, 70, 36);
        this.Muzzle.setRotationPoint(-0.5F, -4.2F, -44.0F);
        this.Muzzle.addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotation(Muzzle, 0.0F, -0.0F, 0.7853981633974483F);
        this.BarrelMount02 = new ModelRenderer(this, 46, 36);
        this.BarrelMount02.setRotationPoint(-0.5F, -5.8F, -30.0F);
        this.BarrelMount02.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotation(BarrelMount02, 0.0F, -0.0F, 0.7853981633974483F);
        this.Stock03 = new ModelRenderer(this, 23, 16);
        this.Stock03.setRotationPoint(-0.5F, -3.5F, 21.0F);
        this.Stock03.addBox(-1.5F, 0.0F, 0.0F, 3, 10, 3, 0.0F);
        this.setRotation(Stock03, 0.2617993877991494F, -0.0F, 0.0F);
        this.FrontSightsMount = new ModelRenderer(this, 0, 48);
        this.FrontSightsMount.setRotationPoint(-1.5F, -6.8F, -26.5F);
        this.FrontSightsMount.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.BackSightsMount = new ModelRenderer(this, 22, 0);
        this.BackSightsMount.setRotationPoint(-0.5F, -7.5F, 6.5F);
        this.BackSightsMount.addBox(-1.5F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
        this.ScopeMount = new ModelRenderer(this, 113, 50);
        this.ScopeMount.setRotationPoint(-0.5F, -7.5F, 0.5F);
        this.ScopeMount.addBox(-1.5F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.Receiver04 = new ModelRenderer(this, 83, 6);
        this.Receiver04.setRotationPoint(-2.0F, -1.5F, 10.0F);
        this.Receiver04.addBox(0.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F);
        this.Grip02 = new ModelRenderer(this, 92, 0);
        this.Grip02.setRotationPoint(-2.0F, -0.5F, -15.5F);
        this.Grip02.addBox(0.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F);
        this.Magazine01 = new ModelRenderer(this, 109, 18);
        this.Magazine01.setRotationPoint(-1.5F, 5.0F, -5.5F);
        this.Magazine01.addBox(0.0F, 0.0F, 0.0F, 2, 6, 7, 0.0F);
        this.Scope03 = new ModelRenderer(this, 115, 33);
        this.Scope03.setRotationPoint(-0.5F, -10.2F, 8.0F);
        this.Scope03.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotation(Scope03, 0.0F, 0.0F, 0.7853981633974483F);
        this.Grip01 = new ModelRenderer(this, 109, 0);
        this.Grip01.setRotationPoint(-2.0F, -1.5F, -21.5F);
        this.Grip01.addBox(0.0F, 0.0F, 0.0F, 3, 2, 6, 0.0F);
        this.Receiver05 = new ModelRenderer(this, 76, 20);
        this.Receiver05.setRotationPoint(-2.0F, -1.5F, -8.0F);
        this.Receiver05.addBox(0.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F);
        this.BarrelRails04 = new ModelRenderer(this, 46, 17);
        this.BarrelRails04.setRotationPoint(-1.5F, -1.0F, -25.0F);
        this.BarrelRails04.addBox(0.0F, 0.0F, 0.0F, 2, 1, 17, 0.0F);
        this.Receiver01 = new ModelRenderer(this, 0, 22);
        this.Receiver01.setRotationPoint(-2.5F, -6.0F, -25.0F);
        this.Receiver01.addBox(0.0F, 0.0F, 0.0F, 4, 5, 37, 0.0F);
        this.Grip06 = new ModelRenderer(this, 53, 0);
        this.Grip06.setRotationPoint(-1.3F, 1.1F, -15.3F);
        this.Grip06.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotation(Grip06, -0.6981317007977318F, 0.0F, 0.0F);
        this.Scope01 = new ModelRenderer(this, 99, 36);
        this.Scope01.setRotationPoint(-0.5F, -10.2F, -3.0F);
        this.Scope01.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 5, 0.0F);
        this.setRotation(Scope01, 0.0F, 0.0F, 0.7853981633974483F);
        this.FrontSights = new ModelRenderer(this, 0, 53);
        this.FrontSights.setRotationPoint(-1.5F, -7.0F, -30.5F);
        this.FrontSights.addBox(0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        this.Stock06 = new ModelRenderer(this, 37, 18);
        this.Stock06.setRotationPoint(0.8F, -1.0F, 23.8F);
        this.Stock06.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotation(Stock06, 0.0F, 0.0F, 0.7853981633974483F);
        this.MagSocket = new ModelRenderer(this, 14, 47);
        this.MagSocket.setRotationPoint(-2.0F, 2.0F, -6.0F);
        this.MagSocket.addBox(0.0F, 0.0F, 0.0F, 3, 3, 8, 0.0F);
        this.BarrelRails01 = new ModelRenderer(this, 9, 31);
        this.BarrelRails01.setRotationPoint(1.5F, -4.25F, -24.5F);
        this.BarrelRails01.addBox(0.0F, 0.0F, 0.0F, 1, 2, 12, 0.0F);
        this.StockMount02 = new ModelRenderer(this, 0, 17);
        this.StockMount02.setRotationPoint(-2.5F, -6.0F, 12.5F);
        this.StockMount02.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotation(StockMount02, 0.0F, 0.7853981633974483F, 0.0F);
        this.Scope04 = new ModelRenderer(this, 93, 36);
        this.Scope04.setRotationPoint(1.2F, -10.2F, 5.0F);
        this.Scope04.addBox(-2.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotation(Scope04, -0.7853981633974483F, 0.0F, 0.0F);
        this.Trigger02 = new ModelRenderer(this, 87, 1);
        this.Trigger02.setRotationPoint(-1.0F, 1.5F, 5.0F);
        this.Trigger02.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotation(Trigger02, -0.2617993950843811F, -0.0F, 0.0F);
        this.Bolt = new ModelRenderer(this, 36, 0);
        this.Bolt.setRotationPoint(2.0F, -4.8F, -10.5F);
        this.Bolt.addBox(-0.5F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotation(Bolt, 0.7853981633974483F, 0.0F, 0.0F);
        this.ScopePlate = new ModelRenderer(this, 111, 40);
        this.ScopePlate.setRotationPoint(0.0F, -10.0F, 0.0F);
        this.ScopePlate.addBox(-1.5F, 0.0F, 0.0F, 2, 3, 6, 0.0F);
        this.BarrelMiniPart = new ModelRenderer(this, 0, 36);
        this.BarrelMiniPart.setRotationPoint(-0.5F, -3.8F, -26.0F);
        this.BarrelMiniPart.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotation(BarrelMiniPart, 0.0F, -0.0F, 0.7853981633974483F);
        this.Stock02 = new ModelRenderer(this, 2, 0);
        this.Stock02.setRotationPoint(-0.5F, -6.5F, 13.0F);
        this.Stock02.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 11, 0.0F);
        this.setRotation(Stock02, -0.17453292519943295F, -0.0F, 0.0F);
        this.Stock04 = new ModelRenderer(this, 10, 16);
        this.Stock04.setRotationPoint(-2.0F, -4.5F, 23.8F);
        this.Stock04.addBox(0.0F, 0.0F, 0.0F, 3, 11, 3, 0.0F);
        this.BackSights = new ModelRenderer(this, 35, 3);
        this.BackSights.setRotationPoint(-0.5F, -7.7F, 9.5F);
        this.BackSights.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.BarrelRails02 = new ModelRenderer(this, 9, 31);
        this.BarrelRails02.setRotationPoint(-3.5F, -4.25F, -24.5F);
        this.BarrelRails02.addBox(0.0F, 0.0F, 0.0F, 1, 2, 12, 0.0F);
        this.Scope05 = new ModelRenderer(this, 101, 31);
        this.Scope05.setRotationPoint(-0.5F, -11.3F, 5.0F);
        this.Scope05.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotation(Scope05, 0.0F, 0.7853981633974483F, 0.0F);
        this.Stock05 = new ModelRenderer(this, 47, 14);
        this.Stock05.setRotationPoint(-2.5F, -5.0F, 25.8F);
        this.Stock05.addBox(0.0F, 0.0F, 0.0F, 4, 12, 2, 0.0F);
        this.Trigger01 = new ModelRenderer(this, 78, 12);
        this.Trigger01.setRotationPoint(-1.5F, 4.0F, 2.0F);
        this.Trigger01.addBox(0.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F);
        this.Barrel = new ModelRenderer(this, 0, 32);
        this.Barrel.setRotationPoint(-0.5F, -3.8F, -38.0F);
        this.Barrel.addBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
        this.setRotation(Barrel, 0.0F, 0.0F, 0.7853981633974483F);
        this.TopRails = new ModelRenderer(this, 51, 21);
        this.TopRails.setRotationPoint(-1.5F, -7.0F, -24.5F);
        this.TopRails.addBox(0.0F, 0.0F, 0.0F, 2, 1, 36, 0.0F);
        this.Scope02 = new ModelRenderer(this, 95, 46);
        this.Scope02.setRotationPoint(-0.5F, -9.4F, 2.0F);
        this.Scope02.addBox(-1.5F, -1.5F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotation(Scope02, 0.0F, 0.0F, 0.7853981633974483F);
        this.BarrelMount01 = new ModelRenderer(this, 24, 36);
        this.BarrelMount01.setRotationPoint(-0.5F, -4.2F, -30.0F);
        this.BarrelMount01.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotation(BarrelMount01, 0.0F, -0.0F, 0.7853981633974483F);
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
                       float headPitch, float scale, int ammoLeft,
                       float reloadProgress, TransformType transformType, int part, float fireProgress,
                       float chargeProgress) {
        if (part == 0) {

            this.StockMount.render(scale);
            this.Grip03.render(scale);
            this.Grip04.render(scale);
            this.Receiver03.render(scale);
            GlStateManager.pushMatrix();
            GlStateManager.translate(this.Grip1.offsetX, this.Grip1.offsetY, this.Grip1.offsetZ);
            GlStateManager.translate(this.Grip1.rotationPointX * scale, this.Grip1.rotationPointY * scale,
                    this.Grip1.rotationPointZ * scale);
            GlStateManager.scale(0.99D, 1.0D, 1.0D);
            GlStateManager.translate(-this.Grip1.offsetX, -this.Grip1.offsetY, -this.Grip1.offsetZ);
            GlStateManager.translate(-this.Grip1.rotationPointX * scale, -this.Grip1.rotationPointY * scale,
                    -this.Grip1.rotationPointZ * scale);
            this.Grip1.render(scale);
            GlStateManager.popMatrix();
            this.Stock01.render(scale);
            GlStateManager.pushMatrix();
            GlStateManager.translate(this.BackSightsMount2.offsetX, this.BackSightsMount2.offsetY,
                    this.BackSightsMount2.offsetZ);
            GlStateManager.translate(this.BackSightsMount2.rotationPointX * scale,
                    this.BackSightsMount2.rotationPointY * scale, this.BackSightsMount2.rotationPointZ * scale);
            GlStateManager.scale(0.8D, 0.7D, 0.7D);
            GlStateManager.translate(-this.BackSightsMount2.offsetX, -this.BackSightsMount2.offsetY,
                    -this.BackSightsMount2.offsetZ);
            GlStateManager.translate(-this.BackSightsMount2.rotationPointX * scale,
                    -this.BackSightsMount2.rotationPointY * scale, -this.BackSightsMount2.rotationPointZ * scale);
            this.BackSightsMount2.render(scale);
            GlStateManager.popMatrix();
            this.Grip05.render(scale);
            this.Muzzle.render(scale);
            GlStateManager.pushMatrix();
            GlStateManager.translate(this.BarrelMount02.offsetX, this.BarrelMount02.offsetY,
                    this.BarrelMount02.offsetZ);
            GlStateManager.translate(this.BarrelMount02.rotationPointX * scale,
                    this.BarrelMount02.rotationPointY * scale, this.BarrelMount02.rotationPointZ * scale);
            GlStateManager.scale(0.8D, 0.8D, 1.0D);
            GlStateManager.translate(-this.BarrelMount02.offsetX, -this.BarrelMount02.offsetY,
                    -this.BarrelMount02.offsetZ);
            GlStateManager.translate(-this.BarrelMount02.rotationPointX * scale,
                    -this.BarrelMount02.rotationPointY * scale, -this.BarrelMount02.rotationPointZ * scale);
            this.BarrelMount02.render(scale);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.translate(this.Stock03.offsetX, this.Stock03.offsetY, this.Stock03.offsetZ);
            GlStateManager.translate(this.Stock03.rotationPointX * scale, this.Stock03.rotationPointY * scale,
                    this.Stock03.rotationPointZ * scale);
            GlStateManager.scale(0.99D, 1.0D, 1.0D);
            GlStateManager.translate(-this.Stock03.offsetX, -this.Stock03.offsetY, -this.Stock03.offsetZ);
            GlStateManager.translate(-this.Stock03.rotationPointX * scale, -this.Stock03.rotationPointY * scale,
                    -this.Stock03.rotationPointZ * scale);
            this.Stock03.render(scale);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.translate(this.FrontSightsMount.offsetX, this.FrontSightsMount.offsetY,
                    this.FrontSightsMount.offsetZ);
            GlStateManager.translate(this.FrontSightsMount.rotationPointX * scale,
                    this.FrontSightsMount.rotationPointY * scale, this.FrontSightsMount.rotationPointZ * scale);
            GlStateManager.scale(0.8D, 1.0D, 1.0D);
            GlStateManager.translate(-this.FrontSightsMount.offsetX, -this.FrontSightsMount.offsetY,
                    -this.FrontSightsMount.offsetZ);
            GlStateManager.translate(-this.FrontSightsMount.rotationPointX * scale,
                    -this.FrontSightsMount.rotationPointY * scale, -this.FrontSightsMount.rotationPointZ * scale);
            this.FrontSightsMount.render(scale);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.translate(this.BackSightsMount.offsetX, this.BackSightsMount.offsetY,
                    this.BackSightsMount.offsetZ);
            GlStateManager.translate(this.BackSightsMount.rotationPointX * scale,
                    this.BackSightsMount.rotationPointY * scale, this.BackSightsMount.rotationPointZ * scale);
            GlStateManager.scale(0.9D, 1.0D, 1.0D);
            GlStateManager.translate(-this.BackSightsMount.offsetX, -this.BackSightsMount.offsetY,
                    -this.BackSightsMount.offsetZ);
            GlStateManager.translate(-this.BackSightsMount.rotationPointX * scale,
                    -this.BackSightsMount.rotationPointY * scale, -this.BackSightsMount.rotationPointZ * scale);
            this.BackSightsMount.render(scale);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.translate(this.ScopeMount.offsetX, this.ScopeMount.offsetY, this.ScopeMount.offsetZ);
            GlStateManager.translate(this.ScopeMount.rotationPointX * scale, this.ScopeMount.rotationPointY * scale,
                    this.ScopeMount.rotationPointZ * scale);
            GlStateManager.scale(0.9D, 1.0D, 1.0D);
            GlStateManager.translate(-this.ScopeMount.offsetX, -this.ScopeMount.offsetY, -this.ScopeMount.offsetZ);
            GlStateManager.translate(-this.ScopeMount.rotationPointX * scale, -this.ScopeMount.rotationPointY * scale,
                    -this.ScopeMount.rotationPointZ * scale);
            this.ScopeMount.render(scale);
            GlStateManager.popMatrix();
            this.Receiver04.render(scale);
            this.Grip02.render(scale);
            this.Magazine01.render(scale);
            GlStateManager.pushMatrix();
            GlStateManager.translate(this.Scope03.offsetX, this.Scope03.offsetY, this.Scope03.offsetZ);
            GlStateManager.translate(this.Scope03.rotationPointX * scale, this.Scope03.rotationPointY * scale,
                    this.Scope03.rotationPointZ * scale);
            GlStateManager.scale(0.9D, 1.0D, 1.0D);
            GlStateManager.translate(-this.Scope03.offsetX, -this.Scope03.offsetY, -this.Scope03.offsetZ);
            GlStateManager.translate(-this.Scope03.rotationPointX * scale, -this.Scope03.rotationPointY * scale,
                    -this.Scope03.rotationPointZ * scale);
            this.Scope03.render(scale);
            GlStateManager.popMatrix();
            this.Grip01.render(scale);
            this.Receiver05.render(scale);
            this.BarrelRails04.render(scale);
            this.Receiver01.render(scale);
            GlStateManager.pushMatrix();
            GlStateManager.translate(this.Grip06.offsetX, this.Grip06.offsetY, this.Grip06.offsetZ);
            GlStateManager.translate(this.Grip06.rotationPointX * scale, this.Grip06.rotationPointY * scale,
                    this.Grip06.rotationPointZ * scale);
            GlStateManager.scale(0.8D, 1.0D, 1.0D);
            GlStateManager.translate(-this.Grip06.offsetX, -this.Grip06.offsetY, -this.Grip06.offsetZ);
            GlStateManager.translate(-this.Grip06.rotationPointX * scale, -this.Grip06.rotationPointY * scale,
                    -this.Grip06.rotationPointZ * scale);
            this.Grip06.render(scale);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.translate(this.Scope01.offsetX, this.Scope01.offsetY, this.Scope01.offsetZ);
            GlStateManager.translate(this.Scope01.rotationPointX * scale, this.Scope01.rotationPointY * scale,
                    this.Scope01.rotationPointZ * scale);
            GlStateManager.scale(0.9D, 1.0D, 1.0D);
            GlStateManager.translate(-this.Scope01.offsetX, -this.Scope01.offsetY, -this.Scope01.offsetZ);
            GlStateManager.translate(-this.Scope01.rotationPointX * scale, -this.Scope01.rotationPointY * scale,
                    -this.Scope01.rotationPointZ * scale);
            this.Scope01.render(scale);
            GlStateManager.popMatrix();
            this.FrontSights.render(scale);
            this.Stock06.render(scale);
            this.MagSocket.render(scale);
            this.BarrelRails01.render(scale);
            GlStateManager.pushMatrix();
            GlStateManager.translate(this.StockMount02.offsetX, this.StockMount02.offsetY, this.StockMount02.offsetZ);
            GlStateManager.translate(this.StockMount02.rotationPointX * scale, this.StockMount02.rotationPointY * scale,
                    this.StockMount02.rotationPointZ * scale);
            GlStateManager.scale(0.6D, 1.0D, 0.6D);
            GlStateManager.translate(-this.StockMount02.offsetX, -this.StockMount02.offsetY,
                    -this.StockMount02.offsetZ);
            GlStateManager.translate(-this.StockMount02.rotationPointX * scale,
                    -this.StockMount02.rotationPointY * scale, -this.StockMount02.rotationPointZ * scale);
            this.StockMount02.render(scale);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.translate(this.Scope04.offsetX, this.Scope04.offsetY, this.Scope04.offsetZ);
            GlStateManager.translate(this.Scope04.rotationPointX * scale, this.Scope04.rotationPointY * scale,
                    this.Scope04.rotationPointZ * scale);
            GlStateManager.scale(0.8D, 0.7D, 0.7D);
            GlStateManager.translate(-this.Scope04.offsetX, -this.Scope04.offsetY, -this.Scope04.offsetZ);
            GlStateManager.translate(-this.Scope04.rotationPointX * scale, -this.Scope04.rotationPointY * scale,
                    -this.Scope04.rotationPointZ * scale);
            this.Scope04.render(scale);
            GlStateManager.popMatrix();
            this.Trigger02.render(scale);

            GlStateManager.pushMatrix();
            GlStateManager.translate(this.ScopePlate.offsetX, this.ScopePlate.offsetY, this.ScopePlate.offsetZ);
            GlStateManager.translate(this.ScopePlate.rotationPointX * scale, this.ScopePlate.rotationPointY * scale,
                    this.ScopePlate.rotationPointZ * scale);
            GlStateManager.scale(0.9D, 1.0D, 1.0D);
            GlStateManager.translate(-this.ScopePlate.offsetX, -this.ScopePlate.offsetY, -this.ScopePlate.offsetZ);
            GlStateManager.translate(-this.ScopePlate.rotationPointX * scale, -this.ScopePlate.rotationPointY * scale,
                    -this.ScopePlate.rotationPointZ * scale);
            this.ScopePlate.render(scale);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.translate(this.BarrelMiniPart.offsetX, this.BarrelMiniPart.offsetY,
                    this.BarrelMiniPart.offsetZ);
            GlStateManager.translate(this.BarrelMiniPart.rotationPointX * scale,
                    this.BarrelMiniPart.rotationPointY * scale, this.BarrelMiniPart.rotationPointZ * scale);
            GlStateManager.scale(0.7D, 0.7D, 1.0D);
            GlStateManager.translate(-this.BarrelMiniPart.offsetX, -this.BarrelMiniPart.offsetY,
                    -this.BarrelMiniPart.offsetZ);
            GlStateManager.translate(-this.BarrelMiniPart.rotationPointX * scale,
                    -this.BarrelMiniPart.rotationPointY * scale, -this.BarrelMiniPart.rotationPointZ * scale);
            this.BarrelMiniPart.render(scale);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.translate(this.Stock02.offsetX, this.Stock02.offsetY, this.Stock02.offsetZ);
            GlStateManager.translate(this.Stock02.rotationPointX * scale, this.Stock02.rotationPointY * scale,
                    this.Stock02.rotationPointZ * scale);
            GlStateManager.scale(0.99D, 1.0D, 1.0D);
            GlStateManager.translate(-this.Stock02.offsetX, -this.Stock02.offsetY, -this.Stock02.offsetZ);
            GlStateManager.translate(-this.Stock02.rotationPointX * scale, -this.Stock02.rotationPointY * scale,
                    -this.Stock02.rotationPointZ * scale);
            this.Stock02.render(scale);
            GlStateManager.popMatrix();
            this.Stock04.render(scale);
            this.BackSights.render(scale);
            this.BarrelRails02.render(scale);
            GlStateManager.pushMatrix();
            GlStateManager.translate(this.Scope05.offsetX, this.Scope05.offsetY, this.Scope05.offsetZ);
            GlStateManager.translate(this.Scope05.rotationPointX * scale, this.Scope05.rotationPointY * scale,
                    this.Scope05.rotationPointZ * scale);
            GlStateManager.scale(0.7D, 0.7D, 0.7D);
            GlStateManager.translate(-this.Scope05.offsetX, -this.Scope05.offsetY, -this.Scope05.offsetZ);
            GlStateManager.translate(-this.Scope05.rotationPointX * scale, -this.Scope05.rotationPointY * scale,
                    -this.Scope05.rotationPointZ * scale);
            this.Scope05.render(scale);
            GlStateManager.popMatrix();
            this.Stock05.render(scale);
            this.Trigger01.render(scale);
            GlStateManager.pushMatrix();
            GlStateManager.translate(this.Barrel.offsetX, this.Barrel.offsetY, this.Barrel.offsetZ);
            GlStateManager.translate(this.Barrel.rotationPointX * scale, this.Barrel.rotationPointY * scale,
                    this.Barrel.rotationPointZ * scale);
            GlStateManager.scale(0.7D, 0.7D, 1.0D);
            GlStateManager.translate(-this.Barrel.offsetX, -this.Barrel.offsetY, -this.Barrel.offsetZ);
            GlStateManager.translate(-this.Barrel.rotationPointX * scale, -this.Barrel.rotationPointY * scale,
                    -this.Barrel.rotationPointZ * scale);
            this.Barrel.render(scale);
            GlStateManager.popMatrix();
            this.TopRails.render(scale);
            GlStateManager.pushMatrix();
            GlStateManager.translate(this.Scope02.offsetX, this.Scope02.offsetY, this.Scope02.offsetZ);
            GlStateManager.translate(this.Scope02.rotationPointX * scale, this.Scope02.rotationPointY * scale,
                    this.Scope02.rotationPointZ * scale);
            GlStateManager.scale(0.9D, 1.0D, 1.0D);
            GlStateManager.translate(-this.Scope02.offsetX, -this.Scope02.offsetY, -this.Scope02.offsetZ);
            GlStateManager.translate(-this.Scope02.rotationPointX * scale, -this.Scope02.rotationPointY * scale,
                    -this.Scope02.rotationPointZ * scale);
            this.Scope02.render(scale);
            GlStateManager.popMatrix();
            this.BarrelMount01.render(scale);
        } else {
            GlStateManager.pushMatrix();

            if (fireProgress > 0) {
                float movebolt = 0f;
                if (fireProgress > 0.4f) {
                    movebolt = 1.0f - (fireProgress - 0.4f) / 0.6f;
                } else {
                    movebolt = fireProgress / 0.4f;
                }
                GlStateManager.translate(0, 0, movebolt * 0.6f);
            }

            GlStateManager.translate(this.Bolt.offsetX, this.Bolt.offsetY, this.Bolt.offsetZ);
            GlStateManager.translate(this.Bolt.rotationPointX * scale, this.Bolt.rotationPointY * scale,
                    this.Bolt.rotationPointZ * scale);
            GlStateManager.scale(1.0D, 0.7D, 0.7D);
            GlStateManager.translate(-this.Bolt.offsetX, -this.Bolt.offsetY, -this.Bolt.offsetZ);
            GlStateManager.translate(-this.Bolt.rotationPointX * scale, -this.Bolt.rotationPointY * scale,
                    -this.Bolt.rotationPointZ * scale);
            this.Bolt.render(scale);
            GlStateManager.popMatrix();
        }
    }
}
