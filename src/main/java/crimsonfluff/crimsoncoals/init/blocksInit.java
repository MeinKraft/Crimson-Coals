package crimsonfluff.crimsoncoals.init;

import crimsonfluff.crimsoncoals.CrimsonCoals;
import crimsonfluff.crimsoncoals.blocks.BlockCharcoal;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class blocksInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CrimsonCoals.MOD_ID);

    public static final RegistryObject<Block> CHARCOAL_BLOCK = BLOCKS.register("charcoal_block",BlockCharcoal::new);
}
