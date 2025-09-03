package thaumicenergistics.init;

import appeng.api.definitions.IItemDefinition;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thaumicenergistics.api.IThEItems;
import thaumicenergistics.client.render.IThEModel;
import thaumicenergistics.definitions.ThEItemDefinition;
import thaumicenergistics.item.*;
import thaumicenergistics.item.part.*;
import thaumicenergistics.util.ThELog;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BrockWS
 */
@Mod.EventBusSubscriber
public class ThEItems implements IThEItems {

    public static List<ItemBase> ITEMS = new ArrayList<>();

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        ThELog.info("Registering {} Items", ThEItems.ITEMS.size());
        event.getRegistry().registerAll(ThEItems.ITEMS.toArray(new ItemBase[0]));
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerModels(ModelRegistryEvent event) {
        ThEItems.ITEMS.forEach(item -> {
            if (item instanceof IThEModel) {
                ((IThEModel) item).initModel();
            }
        });
    }

    private static IItemDefinition createItem(ItemBase item) {
        ThEItems.ITEMS.add(item);
        return new ThEItemDefinition(item);
    }

    private final IItemDefinition itemEssentiaCell1k;
    private final IItemDefinition itemEssentiaCell4k;
    private final IItemDefinition itemEssentiaCell16k;
    private final IItemDefinition itemEssentiaCell64k;
    private final IItemDefinition itemEssentiaCell256k;
    private final IItemDefinition itemEssentiaCell1m;
    private final IItemDefinition itemEssentiaCell4m;
    private final IItemDefinition itemEssentiaCell16m;
    private final IItemDefinition itemEssentiaCell64m;
    private final IItemDefinition itemEssentiaCell256m;
    private final IItemDefinition itemEssentiaCell1g;
    private final IItemDefinition itemEssentiaCell2g;
    private final IItemDefinition itemEssentiaCellCreative;
    private final IItemDefinition itemEssentiaImportBus;
    private final IItemDefinition itemEssentiaExportBus;
    private final IItemDefinition itemEssentiaStorageBus;
    private final IItemDefinition itemEssentiaTerminal;
    private final IItemDefinition itemArcaneTerminal;
    private final IItemDefinition itemArcaneInscriber;
    private final IItemDefinition itemDiffusionCore;
    private final IItemDefinition itemCoalescenceCore;
    private final IItemDefinition itemEssentiaComponent1k;
    private final IItemDefinition itemEssentiaComponent4k;
    private final IItemDefinition itemEssentiaComponent16k;
    private final IItemDefinition itemEssentiaComponent64k;
    private final IItemDefinition itemEssentiaComponent256k;
    private final IItemDefinition itemEssentiaComponent1m;
    private final IItemDefinition itemEssentiaComponent4m;
    private final IItemDefinition itemEssentiaComponent16m;
    private final IItemDefinition itemEssentiaComponent64m;
    private final IItemDefinition itemEssentiaComponent256m;
    private final IItemDefinition itemEssentiaComponent1g;
    private final IItemDefinition itemEssentiaComponent2g;
    private final IItemDefinition itemUpgradeArcane;
    private final IItemDefinition itemKnowledgeCore;
    private final IItemDefinition itemBlankKnowledgeCore;
    private final IItemDefinition itemDummyAspect;

    public ThEItems() {
        this.itemEssentiaCell1k = ThEItems.createItem(new ItemEssentiaCell("1k", 1024, 12));
        this.itemEssentiaCell4k = ThEItems.createItem(new ItemEssentiaCell("4k", 1024 * 4, 12));
        this.itemEssentiaCell16k = ThEItems.createItem(new ItemEssentiaCell("16k", 1024 * 16, 12));
        this.itemEssentiaCell64k = ThEItems.createItem(new ItemEssentiaCell("64k", 1024 * 64, 12));
    // Extended tiers (types fixed at 12). Bytes follow AE pattern; 2g capped below Integer.MAX_VALUE and aligned to 1024.
    this.itemEssentiaCell256k = ThEItems.createItem(new ItemEssentiaCell("256k", 1024 * 256, 12));
    this.itemEssentiaCell1m   = ThEItems.createItem(new ItemEssentiaCell("1m",   1024 * 1024, 12));
    this.itemEssentiaCell4m   = ThEItems.createItem(new ItemEssentiaCell("4m",   1024 * 1024 * 4, 12));
    this.itemEssentiaCell16m  = ThEItems.createItem(new ItemEssentiaCell("16m",  1024 * 1024 * 16, 12));
    this.itemEssentiaCell64m  = ThEItems.createItem(new ItemEssentiaCell("64m",  1024 * 1024 * 64, 12));
    this.itemEssentiaCell256m = ThEItems.createItem(new ItemEssentiaCell("256m", 1024 * 1024 * 256, 12));
    this.itemEssentiaCell1g   = ThEItems.createItem(new ItemEssentiaCell("1g",   1073741824, 12)); // 1 GiB
    this.itemEssentiaCell2g   = ThEItems.createItem(new ItemEssentiaCell("2g",   2147482624, 12)); // max 1024-multiple under int max
        this.itemEssentiaCellCreative = ThEItems.createItem(new ItemCreativeEssentiaCell());
        this.itemEssentiaImportBus = ThEItems.createItem(new ItemEssentiaImportBus("essentia_import"));
        this.itemEssentiaExportBus = ThEItems.createItem(new ItemEssentiaExportBus("essentia_export"));
        this.itemEssentiaStorageBus = ThEItems.createItem(new ItemEssentiaStorageBus("essentia_storage"));
        this.itemEssentiaTerminal = ThEItems.createItem(new ItemEssentiaTerminal("essentia_terminal"));
        this.itemArcaneTerminal = ThEItems.createItem(new ItemArcaneTerminal("arcane_terminal"));
        this.itemArcaneInscriber = ThEItems.createItem(new ItemArcaneInscriber("arcane_inscriber"));
        this.itemDiffusionCore = ThEItems.createItem(new ItemMaterial("diffusion_core"));
        this.itemCoalescenceCore = ThEItems.createItem(new ItemMaterial("coalescence_core"));
        this.itemEssentiaComponent1k = ThEItems.createItem(new ItemMaterial("essentia_component_1k"));
        this.itemEssentiaComponent4k = ThEItems.createItem(new ItemMaterial("essentia_component_4k"));
        this.itemEssentiaComponent16k = ThEItems.createItem(new ItemMaterial("essentia_component_16k"));
    this.itemEssentiaComponent64k  = ThEItems.createItem(new ItemMaterial("essentia_component_64k"));
    // Extended components
    this.itemEssentiaComponent256k = ThEItems.createItem(new ItemMaterial("essentia_component_256k"));
    this.itemEssentiaComponent1m   = ThEItems.createItem(new ItemMaterial("essentia_component_1m"));
    this.itemEssentiaComponent4m   = ThEItems.createItem(new ItemMaterial("essentia_component_4m"));
    this.itemEssentiaComponent16m  = ThEItems.createItem(new ItemMaterial("essentia_component_16m"));
    this.itemEssentiaComponent64m  = ThEItems.createItem(new ItemMaterial("essentia_component_64m"));
    this.itemEssentiaComponent256m = ThEItems.createItem(new ItemMaterial("essentia_component_256m"));
    this.itemEssentiaComponent1g   = ThEItems.createItem(new ItemMaterial("essentia_component_1g"));
    this.itemEssentiaComponent2g   = ThEItems.createItem(new ItemMaterial("essentia_component_2g"));
        this.itemUpgradeArcane = ThEItems.createItem(new ItemMaterial("upgrade_arcane"));
        this.itemKnowledgeCore = ThEItems.createItem(new ItemKnowledgeCore("knowledge_core", false));
        this.itemBlankKnowledgeCore = ThEItems.createItem(new ItemKnowledgeCore("blank_knowledge_core", true));
        this.itemDummyAspect = ThEItems.createItem(new ItemDummyAspect());
    }

    @Override
    public IItemDefinition essentiaCell1k() {
        return this.itemEssentiaCell1k;
    }

    @Override
    public IItemDefinition essentiaCell4k() {
        return this.itemEssentiaCell4k;
    }

    @Override
    public IItemDefinition essentiaCell16k() {
        return this.itemEssentiaCell16k;
    }

    @Override
    public IItemDefinition essentiaCell64k() {
        return this.itemEssentiaCell64k;
    }

    public IItemDefinition essentiaCell256k() { return this.itemEssentiaCell256k; }
    public IItemDefinition essentiaCell1m()   { return this.itemEssentiaCell1m; }
    public IItemDefinition essentiaCell4m()   { return this.itemEssentiaCell4m; }
    public IItemDefinition essentiaCell16m()  { return this.itemEssentiaCell16m; }
    public IItemDefinition essentiaCell64m()  { return this.itemEssentiaCell64m; }
    public IItemDefinition essentiaCell256m() { return this.itemEssentiaCell256m; }
    public IItemDefinition essentiaCell1g()   { return this.itemEssentiaCell1g; }
    public IItemDefinition essentiaCell2g()   { return this.itemEssentiaCell2g; }

    @Override
    public IItemDefinition essentiaCellCreative() {
        return this.itemEssentiaCellCreative;
    }

    @Override
    public IItemDefinition essentiaImportBus() {
        return this.itemEssentiaImportBus;
    }

    @Override
    public IItemDefinition essentiaExportBus() {
        return this.itemEssentiaExportBus;
    }

    @Override
    public IItemDefinition essentiaStorageBus() {
        return this.itemEssentiaStorageBus;
    }

    @Override
    public IItemDefinition essentiaTerminal() {
        return this.itemEssentiaTerminal;
    }

    @Override
    public IItemDefinition arcaneTerminal() {
        return this.itemArcaneTerminal;
    }

    @Override
    public IItemDefinition arcaneInscriber() {
        return this.itemArcaneInscriber;
    }

    @Override
    public IItemDefinition diffusionCore() {
        return this.itemDiffusionCore;
    }

    @Override
    public IItemDefinition coalescenceCore() {
        return this.itemCoalescenceCore;
    }

    @Override
    public IItemDefinition essentiaComponent1k() {
        return this.itemEssentiaComponent1k;
    }

    @Override
    public IItemDefinition essentiaComponent4k() {
        return this.itemEssentiaComponent4k;
    }

    @Override
    public IItemDefinition essentiaComponent16k() {
        return this.itemEssentiaComponent16k;
    }

    @Override
    public IItemDefinition essentiaComponent64k() {
        return this.itemEssentiaComponent64k;
    }

    public IItemDefinition essentiaComponent256k() { return this.itemEssentiaComponent256k; }
    public IItemDefinition essentiaComponent1m()   { return this.itemEssentiaComponent1m; }
    public IItemDefinition essentiaComponent4m()   { return this.itemEssentiaComponent4m; }
    public IItemDefinition essentiaComponent16m()  { return this.itemEssentiaComponent16m; }
    public IItemDefinition essentiaComponent64m()  { return this.itemEssentiaComponent64m; }
    public IItemDefinition essentiaComponent256m() { return this.itemEssentiaComponent256m; }
    public IItemDefinition essentiaComponent1g()   { return this.itemEssentiaComponent1g; }
    public IItemDefinition essentiaComponent2g()   { return this.itemEssentiaComponent2g; }

    @Override
    public IItemDefinition upgradeArcane() {
        return this.itemUpgradeArcane;
    }

    @Override
    public IItemDefinition knowledgeCore() {
        return this.itemKnowledgeCore;
    }

    @Override
    public IItemDefinition blankKnowledgeCore() {
        return this.itemBlankKnowledgeCore;
    }

    @Override
    public IItemDefinition dummyAspect() {
        return this.itemDummyAspect;
    }
}
