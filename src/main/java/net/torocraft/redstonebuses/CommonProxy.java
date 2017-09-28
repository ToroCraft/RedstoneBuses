package net.torocraft.redstonebuses;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.torocraft.redstonebuses.blocks.TileEntityRedstoneBus;
import net.torocraft.redstonebuses.gui.MinecoprocessorGuiHandler;
import net.torocraft.redstonebuses.network.MessageBookCodeData;
import net.torocraft.redstonebuses.network.MessageEnableGuiUpdates;
import net.torocraft.redstonebuses.network.MessageProcessorAction;
import net.torocraft.redstonebuses.network.MessageProcessorUpdate;
import org.apache.logging.log4j.Logger;

public class CommonProxy {

  public Logger logger;

  public String i18nFormat(String key, Object... parameters) {
    return key;
  }

  public void handleUnexpectedException(Exception e) {
    e.printStackTrace();
  }

  public void preInit(FMLPreInitializationEvent e) {
    logger = e.getModLog();
    int packetId = 0;
    MessageEnableGuiUpdates.init(packetId++);
    MessageProcessorUpdate.init(packetId++);
    MessageProcessorAction.init(packetId++);
    MessageBookCodeData.init(packetId++);
    TileEntityRedstoneBus.init();
    MinecoprocessorGuiHandler.init();
  }

  public void init(@SuppressWarnings("unused") FMLInitializationEvent e) {

  }
}
