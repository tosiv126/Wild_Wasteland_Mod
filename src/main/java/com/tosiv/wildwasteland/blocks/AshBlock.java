package com.tosiv.wildwasteland.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class AshBlock extends Block {

    public AshBlock() {
        super(Block.Properties.create(Material.SAND)
            .hardnessAndResistance(0.5f,0.5f)
                .sound(SoundType.SAND)
                .harvestLevel(0)
                .harvestTool(ToolType.SHOVEL)

        );
    }
}
