package fr.firstmegagame4.wthhydtmw.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.util.math.noise.OctavePerlinNoiseSampler;
import net.minecraft.util.math.noise.PerlinNoiseSampler;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(OctavePerlinNoiseSampler.class)
public class OctavePerlinNoiseSamplerMixin {

	@WrapOperation(method = "sample(DDDDDZ)D", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/noise/PerlinNoiseSampler;sample(DDDDD)D"))
	private double heyIBrokeTheGameNamedMinecraftAndItIsReallyAFunnyAprilFool(PerlinNoiseSampler instance, double x, double y, double z, double yScale, double yMax, Operation<Double> original) {
		return new PerlinNoiseSampler(Random.create()).sample(x, y, z, yScale, yMax);
	}
}
