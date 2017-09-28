package net.torocraft.redstonebuses;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

@Mod(modid = RedstoneBuses.MODID, version = RedstoneBuses.VERSION, name = RedstoneBuses.MODNAME)
public class RedstoneBuses {

  public static final String MODID = "minecoprocessors";
  public static final String VERSION = "1.12.1-3";
  public static final String MODNAME = "RedstoneBuses";

  @Mod.Instance(MODID)
  public static RedstoneBuses INSTANCE;

  public static SimpleNetworkWrapper NETWORK = NetworkRegistry.INSTANCE
      .newSimpleChannel(RedstoneBuses.MODID);

  @SidedProxy(clientSide = "net.torocraft.minecoprocessors.ClientProxy", serverSide = "net.torocraft.minecoprocessors.CommonProxy")
  public static CommonProxy proxy;

  @EventHandler
  public void preInit(FMLPreInitializationEvent e) {
    proxy.preInit(e);
  }

  @EventHandler
  public void init(FMLInitializationEvent e) {
    proxy.init(e);
  }

}
