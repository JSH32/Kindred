package com.github.jsh32.kindred

import net.fabricmc.api.ModInitializer

@Suppress("UNUSED")
object Kindred: ModInitializer {
    private const val MOD_ID = "kindred"

    override fun onInitialize() {
        println("Kindred has been initialized.")
    }
}