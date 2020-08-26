package net.notjustanna;

import net.notjustanna.fallflyinglib.FallFlyingAbility;
import net.notjustanna.fallflyinglib.FallFlyingLib;
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
