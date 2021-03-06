package com.tosiv.wildwasteland.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class LeadBlock extends Block {

    public LeadBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(5f,6f)
                .sound(SoundType.METAL)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
        );
    }
}
