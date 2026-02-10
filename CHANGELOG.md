# Changelog

## [0.0.1] - 2026-02-10

Initial release of Gruvbox Themes for JetBrains IDEs.

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

### Fixed
- **IDE Compatibility**: 
    - Fixed version compatibility issues by removing upper build limit in `build.gradle.kts`.
    - Plugin now supports IntelliJ IDEA 2023.2+ (build 232+) without upper version restriction.
    - Resolved "requires build 251.* or older" error by setting `untilBuild` to empty string.
    - Updated both `build.gradle.kts` (`patchPluginXml` task) and `gradle.properties` to ensure consistent version configuration.

- **Visual Guides Optimization**:
    - **Improved Differentiation Between Guide Types**:
        - Visual guides (80/120 columns) and hard wrap line (100 column) now use distinct but harmonious colors for better visual distinction.
        - Light themes: Hard wrap line is noticeably darker than visual guides for clear identification.
        - Dark themes: Hard wrap line is slightly brighter than visual guides for subtle contrast.
    - **Light Themes**: 
        - Fixed overly prominent visual guide lines (80, 120 columns) and hard wrap line (100 column).
        - `VISUAL_INDENT_GUIDE` (80/120): `#d5c4a1` for Light/Light Hard, `#bdae93` for Light Soft.
        - `RIGHT_MARGIN_COLOR` (100): `#bdae93` for Light/Light Hard, `#928374` for Light Soft.
        - Changed `TEARLINE_COLOR` from dark gray (`#665c54`) to soft beige.
        - Added missing `VISUAL_INDENT_GUIDE` property to ensure proper rendering.
    - **Dark Themes**: 
        - Fixed overly bright (white) visual guide lines.
        - `VISUAL_INDENT_GUIDE` (80/120): `#3c3836` for Dark/Dark Soft, `#282828` for Dark Hard.
        - `RIGHT_MARGIN_COLOR` (100): `#504945` for Dark/Dark Soft, `#32302f` for Dark Hard.
        - Changed `TEARLINE_COLOR` from medium gray (`#665c54`) to softer grays.
        - Updated `SELECTED_TEARLINE_COLOR` from bright green (`#8ec07c`) to muted gray (`#504945`).
    - Result: All guide lines are harmonious, non-distracting, and clearly distinguishable across all 6 theme variants.

- **Light Theme Readability**:
    - Optimized indent guide (code alignment) line colors from dark gray (`#665c54`) to softer beige (`#d5c4a1`) to reduce visual prominence.
    - Updated selected indent guide color to `#bdae93` for better harmony with light backgrounds.
    - Adjusted `CARET_ROW_COLOR` from dark gray to light beige (`#ebdbb2`/`#d5c4a1`) to prevent "black stripe" effect.
    - Adjusted `SELECTION_BACKGROUND` to a lighter beige (`#d5c4a1`/`#BDAE93`) for better contrast.
    - Fixed "Identifier Under Caret" and "Write Identifier" backgrounds to be lighter (`#E6DCA5` / `#D5C4A1`) to distinguish them from the selection background.
    - Fixed dark backgrounds for search results, folded text, and inline hints in Light themes.
