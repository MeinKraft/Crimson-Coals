package crimsonfluff.crimsoncoals;

import crimsonfluff.crimsoncoals.init.blocksInit;
import crimsonfluff.crimsoncoals.init.itemsInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("crimsoncoals")
public class CrimsonCoals
{
    public static final String MOD_ID = "crimsoncoals";
    //public static final Logger LOGGER = LogManager.getLogger("crimsoncoals");
    final IEventBus MOD_EVENTBUS = FMLJavaModLoadingContext.get().getModEventBus();

/*     TODO: only 8x Tiny Coal/Charcoal are made. Should be 9 ?
             1 block is 9 coal, so 1 coal should be 9 tiny coal ?*/

    public CrimsonCoals() {
        blocksInit.BLOCKS.register(MOD_EVENTBUS);
        itemsInit.ITEMS.register(MOD_EVENTBUS);

        MinecraftForge.EVENT_BUS.register(this);
    }

    public static final ItemGroup TAB = new ItemGroup("crimsoncoals") {
        @OnlyIn(Dist.CLIENT)
        @Override
        public ItemStack createIcon() { return new ItemStack(itemsInit.TINY_COAL.get()); }
    };
}