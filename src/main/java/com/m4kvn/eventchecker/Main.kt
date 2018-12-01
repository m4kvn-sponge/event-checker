package com.m4kvn.eventchecker

import org.spongepowered.api.Sponge
import org.spongepowered.api.event.Event
import org.spongepowered.api.event.Listener
import org.spongepowered.api.event.entity.CollideEntityEvent
import org.spongepowered.api.event.entity.MoveEntityEvent
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
        when (event) {
            is CollideEntityEvent,
            is MoveEntityEvent -> return
        }
        val className = event::class.simpleName ?: return
        val text = Text.builder("[EventChecker] ")
            .append(
                Text.builder(className)
                    .color(TextColors.GOLD)
                    .build()
            )
            .build()
        Sponge.getServer().console.sendMessage(text)
    }
}