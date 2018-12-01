# event-checker

## Events

### sponge

| Name | Description |
| :--- | :---------- |
| CollideEntityEvent | エンティティが衝突した |
| MoveEntityEvent | エンティティが動いた |
| SendCommandEvent | コンソールやプレイヤーからコマンドが送られた |
| SaveWorldEvent.Pre | ワールドのチャンクセーブの前処理が開始した (個別に発生) |
| SaveWorldEvent.Post | ワールドのチャンクセーブの処理が開始した (個別に発生) |
| UnloadWorldEvent | ワールドのアンロードが開始した (個別に発生) |
| GameStoppingEvent | Spongeサーバーの停止処理が開始した |
| GameStoppedEvent | Spongeサーバーが停止した |

### net.minecraftforge.fml.common.event

| Name | Description |
| :--- | :---------- |
| FMLServerStoppingEvent | Forgeサーバーの定義が開始した |
| FMLServerStoppedEvent | Forgeサーバーが停止した |

## Lifecycle

// <- `stop command`
- FMLServerStoppingEvent
- SaveWorldEvent.Pre
- SaveWorldEvent.Post
- UnloadWorldEvent
- FMLServerStoppedEvent
- GameStoppingEvent
- GameStoppedEvent

## Plugin Lifecycle

Spongeのプラグインローダーは、プラグインを使用可能な状態にする前に、すべてのプラグインに対して依存関係が存在するかどうか確認を行い、依存関係の順序にそってソートを行う。その後、ソートされた順番にライフサイクルイベントが発生する。
