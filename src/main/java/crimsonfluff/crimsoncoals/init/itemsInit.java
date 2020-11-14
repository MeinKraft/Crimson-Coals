package crimsonfluff.crimsoncoals.init;

import crimsonfluff.crimsoncoals.CrimsonCoals;
import crimsonfluff.crimsoncoals.items.ItemTinyCoal;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

// Basically add all items(RegistryObjects) onto the ITEMS Register and call from MyFirstMod.java (Main Class)

public class itemsInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CrimsonCoals.MOD_ID);

    // Items
    public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tiny_coal", ItemTinyCoal::new);
    public static final RegistryObject<Item> TINY_CHARCOAL = ITEMS.register("tiny_charcoal", ItemTinyCoal::new);

    // Block Items
    public static final RegistryObject<Item> CHARCOAL_BLOCK = ITEMS.register("charcoal_block",
    () -> new BlockItem(blocksInit.CHARCOAL_BLOCK.get(), new Item.Properties().group(CrimsonCoals.TAB)) {
        @Override
        public int getBurnTime(ItemStack itemStack) { return 14400; };

        @OnlyIn(Dist.CLIENT)
        @Override
        public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
            tooltip.add((new TranslationTextComponent("tip."+CrimsonCoals.MOD_ID+".blockburntime")));

            super.addInformation(stack, worldIn, tooltip, flagIn);
        }
    });
}
