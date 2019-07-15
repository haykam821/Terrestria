package net.coderbot.terrestria.feature.trees.components;

import net.minecraft.block.TallSeagrassBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MutableIntBoundingBox;
import net.minecraft.world.ModifiableTestableWorld;
import net.minecraft.world.gen.feature.AbstractTreeFeature;

import java.util.Random;
import java.util.Set;

public interface Roots {
	void growRoots(Set<BlockPos> blocks, ModifiableTestableWorld world, BlockPos.Mutable pos, int baseTrunkHeight, Random rand, MutableIntBoundingBox boundingBox);
	void tryGrowRoot(Set<BlockPos> blocks, ModifiableTestableWorld world, BlockPos.Mutable bottom, int baseTrunkHeight, Random rand, MutableIntBoundingBox boundingBox);
}
