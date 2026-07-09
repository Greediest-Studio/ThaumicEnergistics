package additions;

import appeng.api.definitions.IItemDefinition;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import org.dv.minecraft.thaumicenergistics.Reference;

import thaumicenergistics.init.ThEItems;
import thaumicenergistics.item.ItemMaterial;

import java.util.Optional;

public class AdditionalEssentiaComponents {

    private final IItemDefinition itemEssentiaComponent256k;
    private final IItemDefinition itemEssentiaComponent1m;
    private final IItemDefinition itemEssentiaComponent4m;
    private final IItemDefinition itemEssentiaComponent16m;
    private final IItemDefinition itemEssentiaComponent64m;
    private final IItemDefinition itemEssentiaComponent256m;
    private final IItemDefinition itemEssentiaComponent1g;
    private final IItemDefinition itemEssentiaComponent2g;

    public AdditionalEssentiaComponents() {
        this.itemEssentiaComponent256k = this.createItem(AdditionalEssentiaTier.TIER_256K);
        this.itemEssentiaComponent1m = this.createItem(AdditionalEssentiaTier.TIER_1M);
        this.itemEssentiaComponent4m = this.createItem(AdditionalEssentiaTier.TIER_4M);
        this.itemEssentiaComponent16m = this.createItem(AdditionalEssentiaTier.TIER_16M);
        this.itemEssentiaComponent64m = this.createItem(AdditionalEssentiaTier.TIER_64M);
        this.itemEssentiaComponent256m = this.createItem(AdditionalEssentiaTier.TIER_256M);
        this.itemEssentiaComponent1g = this.createItem(AdditionalEssentiaTier.TIER_1G);
        this.itemEssentiaComponent2g = this.createItem(AdditionalEssentiaTier.TIER_2G);
    }

    public IItemDefinition essentiaComponent256k() {
        return this.itemEssentiaComponent256k;
    }

    public IItemDefinition essentiaComponent1m() {
        return this.itemEssentiaComponent1m;
    }

    public IItemDefinition essentiaComponent4m() {
        return this.itemEssentiaComponent4m;
    }

    public IItemDefinition essentiaComponent16m() {
        return this.itemEssentiaComponent16m;
    }

    public IItemDefinition essentiaComponent64m() {
        return this.itemEssentiaComponent64m;
    }

    public IItemDefinition essentiaComponent256m() {
        return this.itemEssentiaComponent256m;
    }

    public IItemDefinition essentiaComponent1g() {
        return this.itemEssentiaComponent1g;
    }

    public IItemDefinition essentiaComponent2g() {
        return this.itemEssentiaComponent2g;
    }

    public static Optional<ItemStack> getComponentStack(String size) {
        Optional<AdditionalEssentiaTier> tier = AdditionalEssentiaTier.bySize(size);
        if (!tier.isPresent()) {
            return Optional.empty();
        }

        Item item = Item.getByNameOrId(Reference.MOD_ID + ":" + tier.get().getComponentId());
        return item != null ? Optional.of(new ItemStack(item)) : Optional.empty();
    }

    private IItemDefinition createItem(AdditionalEssentiaTier tier) {
        return ThEItems.createItem(new ItemMaterial(tier.getComponentId()));
    }
}
