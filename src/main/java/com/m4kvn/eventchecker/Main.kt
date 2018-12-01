package com.m4kvn.eventchecker

import org.spongepowered.api.Sponge
import org.spongepowered.api.event.Event
import org.spongepowered.api.event.Listener
import org.spongepowered.api.plugin.Plugin
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.format.TextColors

@Plugin(
    name = "EventChecker",
    id = "event-checker",
    version = "1.0"
)
class Main {

    @Listener
    fun onEvent(event: Event) {
        val text = Text.builder("[EventChecker] $event")
            .color(TextColors.GOLD)
            .build()
        Sponge.getServer().console.sendMessage(text)
    }
}