# event-checker

## Events

### sponge

```
SendCommandEvent

CollideEvent
└ CollideEntityEvent 

AffectEntityEvent
└ CollideEntityEvent

TargetEntityEvent
├ MoveEntityEvent
└ TargetLivingEvent
  └ TargetAgentEvent
    └ AITaskEvent
      ├ Add
      └ Remove

TargetChunkEvent
└ LoadChunkEvent

TargetWorldEvent
├ SaveWorldEvent.Pre
├ SaveWorldEvent.Post
├ LoadWorldEvent
└ UnloadWorldEvent
```

#### Event

| Name | Description |
| :--- | :---------- |
| SendCommandEvent | コンソールやプレイヤーからコマンドが送られた |

### TargetChunkEvent

| Name | Description |
| :--- | :---------- |
| LoadChunkEvent | チャンクが読み込まれた |

#### AffectEntityEvent

| Name | Description |
| :--- | :---------- |
| CollideEntityEvent | エンティティが衝突した |

#### CollideEvent

| Name | Description |
| :--- | :---------- |
| CollideEntityEvent | エンティティが衝突した |

#### TargetEntityEvent

| Name | Description |
| :--- | :---------- |
| MoveEntityEvent | エンティティが動いた |
| AITaskEvent.Add | エージェントの目的にAIタスクが追加された |
| AITaskEvent.Remove | エージェントの目的からAIタスクが除去された |

#### TargetWorldEvent

| Name | Description |
| :--- | :---------- |
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