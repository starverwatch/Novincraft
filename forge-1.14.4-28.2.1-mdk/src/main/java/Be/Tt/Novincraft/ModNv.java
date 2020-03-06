package Be.Tt.Novincraft;

import Be.Tt.Novincraft.Init.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.logging.Logger;

@Mod(ModNv.MODID)
public class ModNv
{
public static final String MODID = "novincraft";

public static final Logger logger = Logger.getLogger(MODID);

public ModNv()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(ModItems.INSTANCE);
    }
    private void setup(final FMLCommonSetupEvent e)
        {
            logger.info("Mod Setup Loading");
        }

     private void clientSetup(final FMLClientSetupEvent e)
        {
            logger.info("ModClient Setup Loading ");
        }
}
