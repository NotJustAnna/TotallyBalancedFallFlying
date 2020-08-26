package net.adriantodt;

import net.adriantodt.fallflyinglib.FallFlyingAbility;
import net.adriantodt.fallflyinglib.FallFlyingLib;
import net.fabricmc.api.ModInitializer;

public class TotallyBalancedFallFlying implements ModInitializer {
    private static final FallFlyingAbility instance = new FallFlyingAbility() {
        @Override
        public boolean allowFallFlying() {
            return true;
        }

        @Override
        public boolean shouldHideElytra() {
            return false;
        }
    };

    @Override
    public void onInitialize() {
        FallFlyingLib.registerAccessor((e) -> instance);
    }
}
