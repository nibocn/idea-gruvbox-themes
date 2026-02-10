# Gruvbox Themes for JetBrains IDEs

![Version](https://img.shields.io/jetbrains/plugin/v/gruvbox-themes.svg)
![Downloads](https://img.shields.io/jetbrains/plugin/d/gruvbox-themes.svg)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

A retro groove color scheme for JetBrains IDEs (IntelliJ IDEA, PyCharm, WebStorm, etc.). Based on the original [Gruvbox](https://github.com/morhetz/gruvbox) by Pavel Pertsev, this plugin provides a set of warm, pastel-colored themes designed to be easy on the eyes.

## Features

- **6 Theme Variants**: Complete set of Dark and Light themes with different contrast levels.
- **Optimized Readability**: Carefully tuned syntax highlighting for long coding sessions.
- **Consistent UI**: Fully themed IDE interface matching the editor colors.

## Included Themes

### Dark Series
1. **Gruvbox Dark** (Medium) - The classic, balanced dark theme.
2. **Gruvbox Dark Hard** - Higher contrast background for sharper text.
3. **Gruvbox Dark Soft** - Lower contrast background for a smoother look.

### Light Series
4. **Gruvbox Light** (Medium) - The classic, balanced light theme.
5. **Gruvbox Light Hard** - Higher contrast background.
6. **Gruvbox Light Soft** - Lower contrast background.

## Installation

### From JetBrains Marketplace (Recommended)
1. Open your IDE **Settings/Preferences** (`Ctrl+Alt+S` / `Cmd+,`)
2. Navigate to **Plugins** > **Marketplace**
3. Search for **"Gruvbox Themes"**
4. Click **Install** and restart the IDE

### Manual Installation
1. Download the latest `.zip` file from the [Releases](https://github.com/nibocn/idea-gruvbox-themes/releases) page.
2. Open IDE **Settings/Preferences** > **Plugins**
3. Click the ⚙️ gear icon > **Install Plugin from Disk...**
4. Select the downloaded `.zip` file.

## Usage

After installation, go to **Settings/Preferences** > **Appearance & Behavior** > **Appearance**.
Select one of the Gruvbox themes from the **Theme** dropdown menu.

## Screenshots

### Gruvbox Dark
*(Add screenshot here)*

### Gruvbox Light
*(Add screenshot here)*

## Development

### Prerequisites
- JDK 17
- Gradle

### Building the Plugin
Clone the repository and run the build command:

```bash
git clone https://github.com/nibocn/idea-gruvbox-themes.git
cd idea-gruvbox-themes
./gradlew buildPlugin
```

The plugin archive will be generated in `build/distributions/gruvbox-themes-x.x.x.zip`.

### Running in Development IDE
To test the themes in a sandboxed IDE instance:

```bash
./gradlew runIde
```

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Credits

- Original Gruvbox by [morhetz](https://github.com/morhetz/gruvbox)
