package net.chauvedev.woodencog.utils;

import net.dries007.tfc.util.Metal;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.Fluid;

public class FluidAccess {

    public static Fluid copper        = get(Metal.COPPER);
    public static Fluid bismuth       = get(Metal.BISMUTH);
    public static Fluid zinc          = get(Metal.ZINC);
    public static Fluid bismuthBronze = get(Metal.BISMUTH_BRONZE);
    public static Fluid silver        = get(Metal.SILVER);
    public static Fluid gold          = get(Metal.GOLD);
    public static Fluid blackBronze   = get(Metal.BLACK_BRONZE);
    public static Fluid brass         = get(Metal.BRASS);
    public static Fluid tin           = get(Metal.TIN);
    public static Fluid bronze        = get(Metal.BRONZE);
    public static Fluid roseGold      = get(Metal.ROSE_GOLD);
    public static Fluid sterlingSilver = get(Metal.STERLING_SILVER);
    public static Fluid blackSteel    = get(Metal.BLACK_STEEL);
    public static Fluid steel         = get(Metal.STEEL);
    public static Fluid weakBlueSteel = get(Metal.WEAK_BLUE_STEEL);
    public static Fluid weakRedSteel  = get(Metal.WEAK_RED_STEEL);
    public static Fluid nickel        = get(Metal.NICKEL);
    public static Fluid weakSteel     = get(Metal.WEAK_STEEL);

    private static Fluid get(Metal metal) {
        return CogUtil.findNotNullFluid(ResourceLocation.tryBuild("tfc", "metal/" + metal.getSerializedName()));
    }
}
