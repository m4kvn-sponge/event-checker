# event-checker

## Events

### sponge

| Name | Description |
| :--- | :---------- |
| CollideEntityEvent |  |
| MoveEntityEvent |  |
| SendCommandEvent | コンソールやプレイヤーからコマンドが送られた |
| Pre | ワールドのチャンクセーブの前処理が開始した (個別に発生) |
| Post | ワールドのチャンクセーブの処理が開始した (個別に発生) |
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
- Pre
- Post
- UnloadWorldEvent
- FMLServerStoppedEvent
- GameStoppingEvent
- GameStoppedEvent
