package net.torocraft.redstonebuses.blocks;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityRedstoneBus extends TileEntity {

  private static final String NAME = "minecoprocessor_tile_entity";

  public static void init() {
    GameRegistry.registerTileEntity(TileEntityRedstoneBus.class, NAME);
  }


}
