package com.m4kvn.eventchecker

import org.spongepowered.api.Sponge
import org.spongepowered.api.event.Event
import org.spongepowered.api.event.Listener
import org.spongepowered.api.event.entity.CollideEntityEvent
import org.spongepowered.api.event.entity.MoveEntityEvent
import org.spongepowered.api.plugin.Plugin
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.format.TextColors
import kotlin.reflect.KClass

@Plugin(
    name = "EventChecker",
    id = "event-checker",
    version = "1.0"
)
class Main {

    private val filters = listOf<KClass<out Event>>(
        CollideEntityEvent::class,
        MoveEntityEvent::class
    )

    @Listener
    fun onEvent(event: Event) {
        val className = event::class.simpleName ?: return
        if (filters.any {
                "${it.simpleName}\$Impl" == className
                        || it.simpleName == className
            }) return
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