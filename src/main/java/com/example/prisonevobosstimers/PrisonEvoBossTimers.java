package com.example.prisonevobosstimers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.options.KeyBinding;
import net.fabricmc.api.ModInitializer;
import org.lwjgl.glfw.GLFW;

public class PrisonEvoBossTimers implements ModInitializer {

    public static final String MOD_ID = "prisonevobosstimers";
    public static KeyBinding keyBinding;

    @Override
    public void onInitialize() {
        // Initialize the boss timers
        initializeBossTimers();

        // Register the control keybinding
        keyBinding = new KeyBinding("key.prisonevobosstimers.control", GLFW.GLFW_KEY_B, "key.categories.prisonevobosstimers");
        ClientRegistry.registerKeyBinding(keyBinding);
    }

    private void initializeBossTimers() {
        // Logic to initialize and manage boss timers
    }
}