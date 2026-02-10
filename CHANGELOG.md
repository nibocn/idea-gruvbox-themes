# Changelog

## [0.0.1] - Baseline Release

### Added
- **6 Theme Variants**:
    - **Dark Series**:
        - Gruvbox Dark (Medium) - Standard balanced dark theme.
        - Gruvbox Dark Hard - High contrast dark theme (`#1d2021` background).
        - Gruvbox Dark Soft - Low contrast dark theme (`#32302f` background).
    - **Light Series**:
        - Gruvbox Light (Medium) - Standard balanced light theme.
        - Gruvbox Light Hard - High contrast light theme (`#f9f5d7` background).
        - Gruvbox Light Soft - Low contrast light theme (`#f2e5bc` background).
- **Editor Schemes**: Complete syntax highlighting, console colors, and diff colors for all 6 variants.
- **UI Themes**: Full UI customization matching the Gruvbox palette for tool windows, menus, and widgets.
- **Project Structure**: Converted to a standard Gradle-based IntelliJ Platform Plugin project (`build.gradle.kts`).
- **Plugin Icon**: Custom SVG icon featuring a 3D box with Gruvbox colors (Red, Green, Yellow) and code-flow texture, set against a soft dark background.

### Fixed (during development)
- **Light Theme Readability**:
    - Adjusted `CARET_ROW_COLOR` from dark gray to light beige (`#ebdbb2`/`#d5c4a1`) to prevent "black stripe" effect.
    - Adjusted `SELECTION_BACKGROUND` to a lighter beige (`#d5c4a1`/`#BDAE93`) for better contrast.
    - Fixed "Identifier Under Caret" and "Write Identifier" backgrounds to be lighter (`#E6DCA5` / `#D5C4A1`) to distinguish them from the selection background.
    - Fixed dark backgrounds for search results, folded text, and inline hints in Light themes.
