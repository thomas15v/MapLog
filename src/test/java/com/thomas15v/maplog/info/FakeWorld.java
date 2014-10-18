package com.thomas15v.maplog.info;

import org.spongepowered.api.block.Block;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.math.Vector2d;
import org.spongepowered.api.math.Vector2i;
import org.spongepowered.api.math.Vector3i;
import org.spongepowered.api.world.Chunk;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by thomas on 08/10/14.
 */
public class FakeWorld implements World {
    @Override
    public UUID getUniqueID() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Chunk getChunk(Vector2i vector2i) {
        return null;
    }

    @Override
    public Chunk loadChunk(Vector2i vector2i, boolean b) {
        return null;
    }

    @Override
    public Chunk loadChunk(Vector2i vector2i) {
        return null;
    }

    @Override
    public Location at(Vector2d vector2d) {
        return null;
    }

    @Override
    public Location at(int i, int i2, int i3) {
        return null;
    }

    Map<Vector3i, Block> blocks = new HashMap<Vector3i, Block>();
    Block air = new Block() {
        @Override
        public String getId() {
            return "minecraft:air";
        }
    };

    @Override
    public Block getBlock(Vector3i vector3i) {
        if (!blocks.containsKey(vector3i))
            return air;
        return blocks.get(vector3i);
    }

    @Override
    public boolean setBlock(Vector3i vector3i, Block block) {
        blocks.put(vector3i, block);
        return true;
    }

    @Override
    public byte getLuminance(Vector3i vector3i) {
        return 0;
    }

    @Override
    public byte getLuminanceFromSky(Vector3i vector3i) {
        return 0;
    }

    @Override
    public byte getLuminanceFromGround(Vector3i vector3i) {
        return 0;
    }

    @Override
    public Collection<Entity> getEntities() {
        return null;
    }
}
