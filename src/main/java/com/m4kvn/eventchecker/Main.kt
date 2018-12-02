package com.m4kvn.eventchecker

import org.spongepowered.api.Sponge
import org.spongepowered.api.event.Event
import org.spongepowered.api.event.Listener
import org.spongepowered.api.event.block.TickBlockEvent
import org.spongepowered.api.event.entity.*
import org.spongepowered.api.event.entity.ai.AITaskEvent
import org.spongepowered.api.event.item.inventory.DropItemEvent
import org.spongepowered.api.event.statistic.ChangeStatisticEvent
import org.spongepowered.api.event.world.ChangeWorldWeatherEvent
import org.spongepowered.api.event.world.SaveWorldEvent
import org.spongepowered.api.event.world.chunk.LoadChunkEvent
import org.spongepowered.api.event.world.chunk.UnloadChunkEvent
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
            is ConstructEntityEvent,
            is ChangeStatisticEvent.TargetPlayer,
            is TickBlockEvent.Random,
            is DropItemEvent.Destruct,
            is ChangeWorldWeatherEvent,
            is DestructEntityEvent.Death,
            is SaveWorldEvent,
            is DamageEntityEvent,
            is SpawnEntityEvent.ChunkLoad,
            is AITaskEvent.Add,
            is LoadChunkEvent,
            is UnloadChunkEvent,
            is CollideEntityEvent,
            is MoveEntityEvent
            -> return
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