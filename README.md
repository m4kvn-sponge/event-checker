# event-checker

## Events

### sponge

```
SendCommandEvent
CollideEvent
└ CollideEntityEvent 
AffectEntityEvent
└ CollideEntityEvent
```

#### Event

| Name | Description |
| :--- | :---------- |
| SendCommandEvent | コンソールやプレイヤーからコマンドが送られた |

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

#### TargetWorldEvent

| Name | Description |
| :--- | :---------- |
| SaveWorldEvent.Pre | ワールドのチャンクセーブの前処理が開始した (個別に発生) |
| SaveWorldEvent.Post | ワールドのチャンクセーブの処理が開始した (個別に発生) |
| UnloadWorldEvent | ワールドのアンロードが開始した (個別に発生) |

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