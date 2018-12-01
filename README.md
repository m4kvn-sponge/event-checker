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

# Plugin Lifecycle

Spongeのプラグインローダーは、プラグインを使用可能な状態にする前に、すべてのプラグインに対して依存関係が存在するかどうか確認を行い、依存関係の順序にそってソートを行います。その後、ソートされた順番にライフサイクルイベントが発生します。

### 注意

Spongeの `Server` オブジェクトは常に使用可能ではないため、`Sponge.isServerAvailable()` や `Game.isServerAvailable()` で使用可能か確認します。

## State Events

State Eventsは以下のカテゴリーに分類される。

1. **Initialization**: ゲームが始まる前に1度だけ行われ、Spongeとプラグインがロードされている状態です。
1. **Riunning**: ゲームとワールドが実行されている状態で複数回実行される可能性があります。
1. **Stopping**: ゲームが終了する前に1度だけ行われ、ゲームの停止が行われている状態です。

### Initialization States

#### CONSTRUCTION

#### PRE_INITIALIZATION

#### INITIALIZATION

#### POST_INITIALIZATION

#### LOAD_COMPLETE

### Running States

#### SERVER_STARTING

#### SERVER_STARTED

#### SERVER_STOPPING

#### SERVER_STOPPED

### Stopping States

停止状態は、１回の実行中に複数回発生することはありません。ゲームが正常に終了したときに発生します。(サーバーの場合は `/stop` コマンドが実行されたとき、クライアントの場合は「閉じる」ボタンまたは「ゲームを終了」ボタンをクリックしたときに発生します)

#### GAME_STOPPING

`GameStoppingEvent` がトリガーされます。この状態は、**GAME_STOPPED**の直前に発生します。APIを提供するプラグインはこの時点ではまだ処理を受けることができます。

#### GAME_STOPPED

`GameStoppedEvent` がトリガーされます。このイベントの実行が終了すると、Minecraftはシャットダウンします。この時点でゲームやその他のプラグインとのやりやりは
できません。
