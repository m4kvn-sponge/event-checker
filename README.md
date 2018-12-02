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