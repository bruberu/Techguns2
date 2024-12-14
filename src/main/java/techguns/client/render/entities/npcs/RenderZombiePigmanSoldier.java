package techguns.client.render.entities.npcs;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.util.ResourceLocation;

import techguns.client.models.npcs.ModelGenericNPC;
import techguns.entities.npcs.ZombiePigmanSoldier;

public class RenderZombiePigmanSoldier extends RenderGenericNPC<ZombiePigmanSoldier> {

    private static final ResourceLocation TEXTURE = new ResourceLocation("textures/entity/zombie_pigman.png");

    public RenderZombiePigmanSoldier(RenderManager renderManagerIn) {
        super(renderManagerIn, new ModelGenericNPC(), 0.5f);
        LayerBipedArmor layerbipedarmor = new LayerBipedArmor(this) {

            protected void initArmor() {
                this.modelLeggings = new ModelGenericNPC(0.5F, true);
                this.modelArmor = new ModelGenericNPC(1.0F, true);
            }
        };
        this.addLayer(layerbipedarmor);
    }

    @Override
    protected ResourceLocation getEntityTexture(ZombiePigmanSoldier entity) {
        return TEXTURE;
    }
}
