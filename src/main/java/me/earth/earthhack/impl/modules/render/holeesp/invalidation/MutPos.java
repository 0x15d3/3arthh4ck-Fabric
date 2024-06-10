package me.earth.earthhack.impl.modules.render.holeesp.invalidation;

import net.minecraft.util.math.BlockPos;

public class MutPos extends BlockPos.Mutable {
    public void setCustomX(int x) {
        this.x = x;
    }

    public void setCustomZ(int z) {
        this.z = z;
    }

    public BlockPos.Mutable setPos(int x,int y,int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        return this;
    }

    public void incrementX(int by) {
        this.x += by;
    }

    public void incrementY(int by) {
        this.y += by;
    }

    public void incrementZ(int by) {
        this.z += by;
    }

}