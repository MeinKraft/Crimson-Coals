package crimsonfluff.crimsoncoals;

import crimsonfluff.crimsoncoals.init.itemsInit;
import crimsonfluff.crimsoncoals.init.blocksInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("crimsoncoals")
public class CrimsonCoals
{
    public static final String MOD_ID = "crimsoncoals";
    //public static final Logger LOGGER = LogManager.getLogger("crimsoncoals");
    final IEventBus MOD_EVENTBUS = FMLJavaModLoadingContext.get().getModEventBus();

    public CrimsonCoals() {
        MOD_EVENTBUS.addListener(this::setup);
        MOD_EVENTBUS.addListener(this::doClientStuff);

        blocksInit.BLOCKS.register(MOD_EVENTBUS);
        itemsInit.ITEMS.register(MOD_EVENTBUS);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLClientSetupEvent event) {}
    private void doClientStuff(final FMLClientSetupEvent event) {}

    public static final ItemGroup TAB = new ItemGroup("crimsoncoals") {
        @OnlyIn(Dist.CLIENT)
        @Override
        public ItemStack createIcon() { return new ItemStack(itemsInit.TINY_COAL.get()); }

    // removed SearchBar, it was only for testing and is since become annoying
        //@OnlyIn(Dist.CLIENT)
        //public boolean hasSearchBar() { return true; }

        //setBackgroundImageName("item_search.png") searches for ....
        //"minecraft:textures/gui/container/creative_inventory/tab_item_search.png"
        // the "tab_" is added automatically to the filename
        //
    };
    //.setBackgroundImageName("item_search.png");
}