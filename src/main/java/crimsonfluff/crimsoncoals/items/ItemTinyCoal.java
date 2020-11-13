package crimsonfluff.crimsoncoals.items;

import crimsonfluff.crimsoncoals.CrimsonCoals;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

public class ItemTinyCoal extends Item {
    public ItemTinyCoal() { super(new Item.Properties().group(CrimsonCoals.TAB)); }

    @Override
    public int getBurnTime(ItemStack itemStack) { return 200; }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add((new TranslationTextComponent("tip."+CrimsonCoals.MOD_ID+".burntime")));

        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}