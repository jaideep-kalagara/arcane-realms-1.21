package net.supergamer.arcanerealms.Items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.supergamer.arcanerealms.ArcaneRealms;

public class ModItemGroups {
    public static final ItemGroup MAGIC_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ArcaneRealms.MOD_ID, "magic"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.magic"))
                    .icon(() -> new ItemStack(ModItems.ARCANE_WAND))
                    .entries((displayContext, entries) -> {
                    entries.add(ModItems.ARCANE_WAND);
                    entries.add(ModItems.WAND_SHARD);
            }).build());


    public static void registerItemGroups() {
        ArcaneRealms.LOGGER.info("Registering Item Groups For Arcane Realms");
    }
}
