package additions;

import appeng.api.definitions.IItemDefinition;

import thaumicenergistics.init.ThEItems;
import thaumicenergistics.item.ItemEssentiaCell;

public class AdditionalEssentiaCells {

    private final IItemDefinition itemEssentiaCell256k;
    private final IItemDefinition itemEssentiaCell1m;
    private final IItemDefinition itemEssentiaCell4m;
    private final IItemDefinition itemEssentiaCell16m;
    private final IItemDefinition itemEssentiaCell64m;
    private final IItemDefinition itemEssentiaCell256m;
    private final IItemDefinition itemEssentiaCell1g;
    private final IItemDefinition itemEssentiaCell2g;

    public AdditionalEssentiaCells() {
        this.itemEssentiaCell256k = this.createItem(AdditionalEssentiaTier.TIER_256K);
        this.itemEssentiaCell1m = this.createItem(AdditionalEssentiaTier.TIER_1M);
        this.itemEssentiaCell4m = this.createItem(AdditionalEssentiaTier.TIER_4M);
        this.itemEssentiaCell16m = this.createItem(AdditionalEssentiaTier.TIER_16M);
        this.itemEssentiaCell64m = this.createItem(AdditionalEssentiaTier.TIER_64M);
        this.itemEssentiaCell256m = this.createItem(AdditionalEssentiaTier.TIER_256M);
        this.itemEssentiaCell1g = this.createItem(AdditionalEssentiaTier.TIER_1G);
        this.itemEssentiaCell2g = this.createItem(AdditionalEssentiaTier.TIER_2G);
    }

    public IItemDefinition essentiaCell256k() {
        return this.itemEssentiaCell256k;
    }

    public IItemDefinition essentiaCell1m() {
        return this.itemEssentiaCell1m;
    }

    public IItemDefinition essentiaCell4m() {
        return this.itemEssentiaCell4m;
    }

    public IItemDefinition essentiaCell16m() {
        return this.itemEssentiaCell16m;
    }

    public IItemDefinition essentiaCell64m() {
        return this.itemEssentiaCell64m;
    }

    public IItemDefinition essentiaCell256m() {
        return this.itemEssentiaCell256m;
    }

    public IItemDefinition essentiaCell1g() {
        return this.itemEssentiaCell1g;
    }

    public IItemDefinition essentiaCell2g() {
        return this.itemEssentiaCell2g;
    }

    private IItemDefinition createItem(AdditionalEssentiaTier tier) {
        return ThEItems.createItem(
                new ItemEssentiaCell(
                        tier.getSize(), tier.getBytes(), AdditionalEssentiaTier.TYPES));
    }
}
