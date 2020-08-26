package com.github.trepicoder.adventurecraft.blocks;

import com.github.trepicoder.adventurecraft.lists.ACProperties;
import com.github.trepicoder.adventurecraft.utility.VoxelShapeHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class ACCampfire extends HorizontalFacingBlock {
    public ACCampfire(Settings settings) {
        super(settings);
        setDefaultState(this.getStateManager().getDefaultState()
                .with(Properties.HORIZONTAL_FACING, Direction.NORTH)
                .with(ACProperties.ACTIVE, false));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VoxelShape body1 = VoxelShapeHelper.rotateShape(Direction.NORTH, state.get(Properties.HORIZONTAL_FACING),
                VoxelShapes.cuboid(0, 0, 0.3125, 1,0.125,0.6875));
        VoxelShape body2 = VoxelShapeHelper.rotateShape(Direction.NORTH, state.get(Properties.HORIZONTAL_FACING),
                VoxelShapes.cuboid(0.3125, 0, 0,0.6875, 0.125, 1));

        VoxelShape body3 = VoxelShapeHelper.rotateShape(Direction.NORTH, state.get(Properties.HORIZONTAL_FACING),
                VoxelShapes.cuboid(0.0625, 0, 0.25, 0.9375, 0.125, 0.75));
        VoxelShape body4 = VoxelShapeHelper.rotateShape(Direction.NORTH, state.get(Properties.HORIZONTAL_FACING),
                VoxelShapes.cuboid(0.25, 0, 0.0625, 0.75, 0.125, 0.9375));

        VoxelShape body5 = VoxelShapeHelper.rotateShape(Direction.NORTH, state.get(Properties.HORIZONTAL_FACING),
                VoxelShapes.cuboid(0.125, 0, 0.1875, 0.875, 0.125, 0.8125));
        VoxelShape body6 = VoxelShapeHelper.rotateShape(Direction.NORTH, state.get(Properties.HORIZONTAL_FACING),
                VoxelShapes.cuboid(0.1875, 0, 0.125, 0.8125, 0.125, 0.875));

        return VoxelShapes.union(body1, body2, body3, body4, body5, body6);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (state.get(ACProperties.ACTIVE)) {
            world.addImportantParticle(ParticleTypes.FLAME, true, pos.getX() + 0.5, pos.getY()+0.25, pos.getZ() + 0.5, 0, 0, 0);
            world.addImportantParticle(ParticleTypes.LARGE_SMOKE, true, pos.getX() + 0.5, pos.getY()+0.4, pos.getZ() + 0.5, 0, 0, 0);
            world.addImportantParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, true, pos.getX() + 0.5, pos.getY()+0.925, pos.getZ() + 0.5,
                    random.nextFloat() * 0.0125 * (double)(random.nextBoolean() ? 1 : -1), 0.07, random.nextFloat() * 0.0125 * (double)(random.nextBoolean() ? 1 : -1));

            world.playSound(pos.getX() + 0.5, pos.getY()+0.25, pos.getZ() + 0.5, SoundEvents.BLOCK_CAMPFIRE_CRACKLE, SoundCategory.BLOCKS,
                    0.5F + random.nextFloat(), random.nextFloat() * 0.7F + 0.6F, false);
        }
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockstate = super.getPlacementState(ctx);

        if (blockstate != null) {
            blockstate = blockstate.with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
        }

        return blockstate;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING);
        builder.add(ACProperties.ACTIVE);
    }
}
