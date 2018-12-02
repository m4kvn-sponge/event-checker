# event-checker

## Events

### sponge

```
ConstructEntityEvent

ClinetPingServerEvent

SendCommandEvent

ChangeStatisticEvent
└ TargetPlayer

TargetBlockEvent
└ TickBlockEvent
  ├ Scheduled
  └ Random

DropItemEvent
├ Pre
├ Destruct
├ Dispense
└ Custom

MessageEvent
└ MessageChannelEvent
  └ DestructEntityEvent
    └ Death

CollideEvent
└ CollideEntityEvent 

AffectEntityEvent
├ SpawnEntityEvent
│ ├ DropItemEvent.Destruct
│ ├ DropItemEvent.Dispense
│ ├ ChunkLoad
│ ├ Spawner
│ └ Custom
│   └ DropItemEvent.Custom
└ CollideEntityEvent

TargetEntityEvent
├ TargetLivingEvent
│ ├ TargetHumanoidEvent
│ │ └ TargetPlayerEvent
│ │   └ ChangeStatisticEvent.TargetPlayer
│ └ Death
├ DestructEntityEvent
│ └ Death
├ DamageEntityEvent
├ IgniteEntityEvent
├ InteractEntityEvent
│ └ BreedEntityEvent
│   ├ FindMeta
│   └ Breed
├ MoveEntityEvent
└ TargetLivingEvent
  └ TargetAgentEvent
    └ AITaskEvent
      ├ Add
      └ Remove

InteractEvent
└ InteractEntityEvent
  └ BreedEntityEvent

TargetChunkEvent
├ UnloadChunkEvent
└ LoadChunkEvent

TargetWorldEvent
├ ChangeWorldWeatherEvent
├ SaveWorldEvent.Pre
├ SaveWorldEvent.Post
├ LoadWorldEvent
└ UnloadWorldEvent
```

#### Event

| Name | Description |
| :--- | :---------- |
| ClientPingServerEvent | クライアントのサーバーリストに表示されたときに発生する |
| SendCommandEvent | コンソールやプレイヤーからコマンドが送られた |

#### TargetBlockEvent

| Name | Description |
| :--- | :---------- |
| TickBlockEvent.Scheduled |  |
| TickBlockEvent.Random | ブロックが更新されるときに発生する |

#### DropItemEvent

| Name | Description |
| :--- | :---------- |
| DropItem.Pre | アイテムがドロップしそうなときに発生する |
| DropItem.Destruct | エンティティの体力がなくなりアイテムがドロップするときに発生する |
| DropItem.Dispense | ディスペンサーからアイテムがドロップするときに発生する |
| DropItem.Custom | 独自の方法でアイテムがドロップするときに発生する |

#### TargetChunkEvent

| Name | Description |
| :--- | :---------- |
| UnloadChunkEvent | チャンクがアンロードされたときに発生する |
| LoadChunkEvent | チャンクが読み込まれたときに発生する |

#### AffectEntityEvent

| Name | Description |
| :--- | :---------- |
| SpawnEntityEvent.ChunkLoad | エンティティがチャンクロードによってスポーンしたときに発生する。 |
| CollideEntityEvent | エンティティが衝突したしたときに発生する。 |

#### TargetEntityEvent

| Name | Description |
| :--- | :---------- |
| DestructEntityEvent.Death | エンティティが体力がなくなったときに発生する |
| DamageEntityEvent | エンティティがダメージを受けるときに発生する |
| IgniteEntityEvent | エンティティに火がつくときに発生する |
| MoveEntityEvent | エンティティが動くときに発生する |
| AITaskEvent.Add | エージェントの目的にAIタスクが追加されるときに発生する |
| AITaskEvent.Remove | エージェントの目的からAIタスクが除去されるときに発生する |

#### TargetWorldEvent

| Name | Description |
| :--- | :---------- |
| ChangeWorldWeatherEvent | ワールドの天候が変化するときに発生する (個別に発生) |
| SaveWorldEvent.Pre | ワールドのチャンクセーブの前処理が開始した (個別に発生) |
| SaveWorldEvent.Post | ワールドのチャンクセーブの処理が開始した (個別に発生) |
| LoadWorldEvent | ワールドが読み込まれた (個別に発生) |
| UnloadWorldEvent | ワールドがアンロードされた (個別に発生) |

#### GameStateEvent

| Name | Description |
| :--- | :---------- |
| GameStoppingEvent | Spongeサーバーの停止処理が開始した |
| GameStoppedEvent | Spongeサーバーが停止した |

### net.minecraftforge.fml.common.event

| Name | Description |
| :--- | :---------- |
| FMLServerStoppingEvent | Forgeサーバーの定義が開始した |
| FMLServerStoppedEvent | Forgeサーバーが停止した |

## Lifecycle

Lifecycleについての基本情報は [公式ドキュメント](https://docs.spongepowered.org/stable/ja/plugin/lifecycle.html) を確認してください。

// <- `stop command`
- FMLServerStoppingEvent
- SaveWorldEvent.Pre
- SaveWorldEvent.Post
- UnloadWorldEvent
- FMLServerStoppedEvent
- GameStoppingEvent
- GameStoppedEvent

## [WIP] Events

AdvancementEvent, 
AdvancementEvent.Grant, 
AdvancementEvent.Revoke, 
AdvancementTreeEvent, 
AdvancementTreeEvent.GenerateLayout, 
AffectEntityEvent, 
AffectItemStackEvent,
AffectSlotEvent, 
AITaskEvent,
AITaskEvent.Add, 
AITaskEvent.Remove, 
AnimateHandEvent, 
AttackEntityEvent, 
BanIpEvent, 
BanUserEvent, 
BanUserEvent.TargetPlayer, 
BreedEntityEvent, 
BreedEntityEvent.Breed, 
BreedEntityEvent.FindMate, 
BreedEntityEvent.ReadyToMate, 
BrewingEvent, 
BrewingEvent.Finish, 
BrewingEvent.Interrupt, 
BrewingEvent.Start, 
BrewingEvent.Tick, 
ChangeBlockEvent, 
ChangeBlockEvent.Break, 
ChangeBlockEvent.Decay,
ChangeBlockEvent.Grow, 
ChangeBlockEvent.Modify, 
ChangeBlockEvent.Place, 
ChangeBlockEvent.Post, 
ChangeBlockEvent.Pre, 
ChangeDataHolderEvent, 
ChangeDataHolderEvent.ValueChange, 
ChangeEntityEquipmentEvent, 
ChangeEntityEquipmentEvent.TargetHumanoid, 
ChangeEntityEquipmentEvent.TargetLiving, 
ChangeEntityEquipmentEvent.TargetPlayer, 
ChangeEntityExperienceEvent, 
ChangeEntityPotionEffectEvent, 
ChangeEntityPotionEffectEvent.Expire, 
ChangeEntityPotionEffectEvent.Gain, 
ChangeEntityPotionEffectEvent.Remove, 
ChangeGameModeEvent, 
ChangeGameModeEvent.TargetPlayer, 
ChangeInventoryEvent, 
ChangeInventoryEvent.Equipment, 
ChangeInventoryEvent.Held, 
ChangeInventoryEvent.Pickup, 
ChangeInventoryEvent.Pickup.Pre, 
ChangeInventoryEvent.SwapHand, 
ChangeInventoryEvent.Transfer, 
ChangeInventoryEvent.Transfer.Post, 
ChangeInventoryEvent.Transfer.Pre, 
ChangeLevelEvent, 
ChangeLevelEvent.TargetPlayer, 
ChangeServiceProviderEvent, 
ChangeSignEvent, 
ChangeStatisticEvent, 
ChangeStatisticEvent.TargetPlayer, 
ChangeWorldBorderEvent, 
ChangeWorldBorderEvent.TargetPlayer, 
ChangeWorldBorderEvent.TargetWorld, 
ChangeWorldGameRuleEvent, 
ChangeWorldWeatherEvent, 
ChannelRegistrationEvent, 
ChannelRegistrationEvent.Register, 
ChannelRegistrationEvent.Unregister, 
ChunkPreGenerationEvent,
ChunkPreGenerationEvent.Cancelled, 
ChunkPreGenerationEvent.Complete, 
ChunkPreGenerationEvent.Post, 
ChunkPreGenerationEvent.Pre, 
ClickInventoryEvent,
ClickInventoryEvent.Creative, 
ClickInventoryEvent.Double, 
ClickInventoryEvent.Drag, 
ClickInventoryEvent.Drag.Middle, 
ClickInventoryEvent.Drag.Primary, 
ClickInventoryEvent.Drag.Secondary, 
ClickInventoryEvent.Drop, 
ClickInventoryEvent.Drop.Full, 
ClickInventoryEvent.Drop.Outside,
ClickInventoryEvent.Drop.Outside.Primary, 
ClickInventoryEvent.Drop.Outside.Secondary,
ClickInventoryEvent.Drop.Single, 
ClickInventoryEvent.Middle, 
ClickInventoryEvent.NumberPress, 
ClickInventoryEvent.Primary, 
ClickInventoryEvent.Recipe, 
ClickInventoryEvent.Recipe.All, 
ClickInventoryEvent.Recipe.Single, 
ClickInventoryEvent.Secondary, 
ClickInventoryEvent.Shift, 
ClickInventoryEvent.Shift.Primary, 
ClickInventoryEvent.Shift.Secondary, 
ClientConnectionEvent, 
ClientConnectionEvent.Auth, 
ClientConnectionEvent.Disconnect, 
ClientConnectionEvent.Join, 
ClientConnectionEvent.Login, 
ClientPingServerEvent, 
CollideBlockEvent, 
CollideBlockEvent.Impact, 
CollideEntityEvent, 
CollideEntityEvent.Impact, 
CollideEvent, 
CollideEvent.Impact, 
ConstructEntityEvent, 
ConstructEntityEvent.Post, 
ConstructEntityEvent.Pre, 
ConstructPortalEvent, 
ConstructWorldPropertiesEvent, 
CooldownEvent, 
CooldownEvent.End, 
CooldownEvent.Set, 
CraftItemEvent, 
CraftItemEvent.Craft, 
CraftItemEvent.Preview, 
CriterionEvent, 
CriterionEvent.Grant, 
CriterionEvent.Revoke, 
CriterionEvent.Score, 
CriterionEvent.Score.Change, 
CriterionEvent.Score.Grant, 
CriterionEvent.Score.Revoke, 
CriterionEvent.Trigger<C>, 
DamageEntityEvent, 
DefuseExplosiveEvent, 
DefuseExplosiveEvent.Post, 
DefuseExplosiveEvent.Pre, 
DestructEntityEvent, 
DestructEntityEvent.Death, 
DetonateExplosiveEvent, 
DropItemEvent, 
DropItemEvent.Custom, 
DropItemEvent.Destruct, 
DropItemEvent.Dispense, 
DropItemEvent.Pre, 
EconomyTransactionEvent, 
ExpireEntityEvent, 
ExpireEntityEvent.TargetItem, 
ExplosionEvent, 
ExplosionEvent.Detonate, 
ExplosionEvent.Post, 
ExplosionEvent.Pre, 
FishingEvent, 
FishingEvent.HookEntity, 
FishingEvent.Start, 
FishingEvent.Stop, 
ForcedChunkEvent, 
GameAboutToStartServerEvent, 
GameConstructionEvent, 
GameInitializationEvent, 
GameLoadCompleteEvent, 
GamePostInitializationEvent, 
GamePreInitializationEvent, 
GameRegistryEvent, 
GameRegistryEvent.Register<T>, 
GameReloadEvent, 
GameStartedServerEvent, 
GameStartingServerEvent, 
GameStateEvent, 
GameStoppedEvent, 
GameStoppedServerEvent, 
GameStoppingEvent, 
GameStoppingServerEvent, 
GenerateChunkEvent, 
GenerateChunkEvent.Post, 
GenerateChunkEvent.Pre, 
GenericEvent<T>, 
HandInteractEvent, 
HarvestEntityEvent, 
HarvestEntityEvent.TargetHumanoid, 
HarvestEntityEvent.TargetLiving, 
HarvestEntityEvent.TargetPlayer, 
HealEntityEvent, 
IgniteEntityEvent, 
InteractBlockEvent, 
InteractBlockEvent.Primary, 
InteractBlockEvent.Primary.MainHand, 
InteractBlockEvent.Primary.OffHand, 
InteractBlockEvent.Secondary, 
InteractBlockEvent.Secondary.MainHand, 
InteractBlockEvent.Secondary.OffHand, 
InteractEntityEvent, 
InteractEntityEvent.Primary, 
InteractEntityEvent.Primary.MainHand, 
InteractEntityEvent.Primary.OffHand, 
InteractEntityEvent.Secondary, 
InteractEntityEvent.Secondary.MainHand, 
InteractEntityEvent.Secondary.OffHand, 
InteractEvent, 
InteractInventoryEvent, 
InteractInventoryEvent.Close, 
InteractInventoryEvent.Open, 
InteractItemEvent, 
InteractItemEvent.Primary, 
InteractItemEvent.Primary.MainHand, 
InteractItemEvent.Primary.OffHand, 
InteractItemEvent.Secondary, 
InteractItemEvent.Secondary.MainHand, 
InteractItemEvent.Secondary.OffHand, 
ItemMergeItemEvent, 
KickPlayerEvent, 
LaunchProjectileEvent, 
LeashEntityEvent, 
LightningEvent, 
LightningEvent.Post, 
LightningEvent.Pre, 
LightningEvent.Strike, 
LoadChunkEvent, 
LoadWorldEvent, 
MessageChannelEvent, 
MessageChannelEvent.Chat, 
MessageEvent, 
MoveEntityEvent, 
MoveEntityEvent.Teleport, 
MoveEntityEvent.Teleport.Portal, 
NotifyNeighborBlockEvent, 
PardonIpEvent, 
PardonUserEvent, 
PardonUserEvent.TargetPlayer, 
PlayerChangeClientSettingsEvent, 
PopulateChunkEvent, 
PopulateChunkEvent.Populate, 
PopulateChunkEvent.Post, 
PopulateChunkEvent.Pre, 
PrimeExplosiveEvent, 
PrimeExplosiveEvent.Post, 
PrimeExplosiveEvent.Pre, 
QueryServerEvent, 
QueryServerEvent.Basic, 
QueryServerEvent.Full,
RconConnectionEvent, 
RconConnectionEvent.Connect, 
RconConnectionEvent.Disconnect, 
RconConnectionEvent.Login, 
ResourcePackStatusEvent, 
RespawnPlayerEvent, 
RideEntityEvent, 
RideEntityEvent.Dismount, 
RideEntityEvent.Mount, 
SaveWorldEvent, 
SaveWorldEvent.Post, 
SaveWorldEvent.Pre, 
SendCommandEvent, 
SetAITargetEvent, 
SleepingEvent, 
SleepingEvent.Finish, 
SleepingEvent.Post, 
SleepingEvent.Pre, 
SleepingEvent.Tick, 
SmeltEvent, 
SmeltEvent.ConsumeFuel, 
SmeltEvent.Finish, 
SmeltEvent.Interrupt, 
SmeltEvent.Start, 
SmeltEvent.Tick, 
SpawnEntityEvent, 
SpawnEntityEvent.ChunkLoad, 
SpawnEntityEvent.Custom, 
SpawnEntityEvent.Spawner, 
TabCompleteEvent, 
TabCompleteEvent.Chat, 
TabCompleteEvent.Command, 
TameEntityEvent, 
TargetAgentEvent, 
TargetBlockEvent, 
TargetChunkEvent, 
TargetContainerEvent, 
TargetEntityEvent, 
TargetExplosiveEvent,
TargetFusedExplosiveEvent, 
TargetHumanoidEvent, 
TargetInventoryEvent, 
TargetItemEvent, 
TargetLivingEvent, 
TargetPlayerEvent, 
TargetProjectileEvent, 
TargetTileEntityEvent, 
TargetUserEvent, 
TargetWorldEvent,
TickBlockEvent, 
TickBlockEvent.Random, 
TickBlockEvent.Scheduled, 
UnforcedChunkEvent, 
UnleashEntityEvent, 
UnloadChunkEvent, 
UnloadWorldEvent, 
UseItemStackEvent,
UseItemStackEvent.Finish, 
UseItemStackEvent.Replace, 
UseItemStackEvent.Reset, 
UseItemStackEvent.Start, 
UseItemStackEvent.Stop, 
UseItemStackEvent.Tick