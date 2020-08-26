package com.github.trepicoder.adventurecraft.utility;

import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class VoxelShapeHelper {
    @Deprecated
    /**
     * Deprecated, as the changes within Fabric make this method no longer work. Please use rotateShape instead
     */
    public static VoxelShape createRotatedShape(Direction direction, double x1, double y1, double z1, double x2, double y2, double z2) {
        switch (direction) {
            case NORTH:
            default:
                return VoxelShapes.cuboid(x1, y1, z1, x2, y2, z2);
            case WEST:
                return VoxelShapes.cuboid(z1, y1, 16d - x2, z2, y2, 16d - x1);
            case SOUTH:
                return VoxelShapes.cuboid(16d - x2, y1, 16d - z2, 16d - x1, y2, 16d - z1);
            case EAST:
                return VoxelShapes.cuboid(16d - z2, y1, x1, 16d - z1, y2, x2);
            case DOWN:
                return VoxelShapes.cuboid(16d - x2, z1, 16d - y2, 16d - x1, z2, 16d - y1);
            case UP:
                return VoxelShapes.cuboid(x1, 16d - z2, y1, x2, 16d - z1, y2);
        }
    }

    public static VoxelShape rotateShape(Direction from, Direction to, VoxelShape shape) {
        VoxelShape[] buffer = new VoxelShape[]{ shape, VoxelShapes.empty() };

        int times = (to.getHorizontal() - from.getHorizontal() + 4) % 4;
        for (int i = 0; i < times; i++) {
            buffer[0].forEachBox((minX, minY, minZ, maxX, maxY, maxZ) -> buffer[1] = VoxelShapes.union(buffer[1], VoxelShapes.cuboid(1-maxZ, minY, minX, 1-minZ, maxY, maxX)));
            buffer[0] = buffer[1];
            buffer[1] = VoxelShapes.empty();
        }

        return buffer[0];
    }
}
