package com.tosiv.wildwasteland.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class RubyOre extends OreBlock {
    public RubyOre() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(3f, 3f)
                .sound(SoundType.STONE)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
        );
    }
        @Override
        public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch){
            return 1;
        }
}
