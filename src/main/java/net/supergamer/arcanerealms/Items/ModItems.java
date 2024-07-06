package net.supergamer.arcanerealms.Items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.datafixer.schema.IdentifierNormalizingSchema;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.supergamer.arcanerealms.ArcaneRealms;
import net.minecraft.util.Identifier;

public class ModItems {

    public  static final Item WAND_SHARD = registerItem("wand_shard", new Item(new Item.Settings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(WAND_SHARD);
    }

    private  static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ArcaneRealms.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ArcaneRealms.LOGGER.info("Registering Mod Items for" + ArcaneRealms.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
