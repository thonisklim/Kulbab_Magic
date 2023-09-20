package net.kulbab.mynicemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kulbab.mynicemod.MyNiceMod;
import net.kulbab.mynicemod.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public  static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MyNiceMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.MAGIC_RUBY);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.RUBY_BLOCK);

                    }).build());

    public static void registerItemGroup() {
        MyNiceMod.LOGGER.info("Registering Item Groups for" + MyNiceMod.MOD_ID);
    }
}
