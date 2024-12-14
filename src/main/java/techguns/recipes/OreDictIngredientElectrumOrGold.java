package techguns.recipes;

import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.IIngredientFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.OreIngredient;

import com.google.gson.JsonObject;

public class OreDictIngredientElectrumOrGold implements IIngredientFactory {

    @Override
    public Ingredient parse(JsonContext context, JsonObject json) {
        if (OreDictionary.doesOreNameExist("ingotElectrum")) {
            return new OreIngredient("ingotElectrum");
        }
        return new OreIngredient("ingotGold");
    }
}
