# Prison Evo Boss Timers

A Fabric mod for Minecraft 1.21.4 that adds customizable boss spawn timers with a GUI.

## Features

- **Boss Timer Display**: Shows all configured bosses with remaining time on the right side of the screen
- **Right Control Key**: Press right control (configurable) to open the timer settings GUI
- **Restart Timers**: Easily restart individual boss timers from the settings screen
- **Add/Remove Bosses**: Dynamically add new bosses to track
- **Persistent Configuration**: Timers are maintained across gameplay sessions

## Installation

1. Install [Fabric Loader](https://fabricmc.net/) for Minecraft 1.21.4
2. Download the latest `.jar` from [Releases](https://github.com/ndj64224-lab/prison-evo-boss-timers/releases)
3. Place the JAR in your `mods/` folder
4. Launch Minecraft

## Usage

- Press **Right Control** to open the Boss Timer Settings GUI
- Click **Restart [BossName]** to restart a specific boss timer
- Click **Add Boss** to add a new boss to track
- Click **Close** to exit the GUI
- Timer display appears in the top-right corner of the screen

## Building from Source

```bash
./gradlew build
```

The compiled mod will be in `build/libs/`

## License

MIT License - See LICENSE file for details