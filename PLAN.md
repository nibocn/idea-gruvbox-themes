# 📋 Gruvbox IDEA Theme Plugin Development Plan

## 1. Project Overview
Create a complete Gruvbox theme plugin for IntelliJ IDEA and JetBrains IDEs, featuring 6 variants:
- **Dark Series**: Dark (Medium), Dark Hard, Dark Soft
- **Light Series**: Light (Medium), Light Hard, Light Soft

## 2. Technical Architecture

### 2.1 File Structure
```
gruvbox-themes/
├── gruvbox-themes.iml
└── resources/
    ├── META-INF/
    │   ├── plugin.xml
    │   └── pluginIcon.svg
    ├── theme/
    │   ├── gruvbox-dark.theme.json
    │   ├── gruvbox-dark-hard.theme.json
    │   ├── gruvbox-dark-soft.theme.json
    │   ├── gruvbox-light.theme.json
    │   ├── gruvbox-light-hard.theme.json
    │   └── gruvbox-light-soft.theme.json
    └── editorScheme/
        ├── gruvbox-dark.xml
        ├── gruvbox-dark-hard.xml
        ├── gruvbox-dark-soft.xml
        ├── gruvbox-light.xml
        ├── gruvbox-light-hard.xml
        └── gruvbox-light-soft.xml
```

### 2.2 Color Schemes

#### Background Colors
*   **Dark Medium**: `#282828`
*   **Dark Hard**: `#1d2021`
*   **Dark Soft**: `#32302f`
*   **Light Medium**: `#fbf1c7`
*   **Light Hard**: `#f9f5d7`
*   **Light Soft**: `#f2e5bc`

#### Syntax Highlighting (Dark)
*   Foreground: `#ebdbb2`
*   Keywords: `#fb4934`
*   Strings: `#b8bb26`
*   Functions: `#b8bb26`
*   Classes: `#fabd2f`
*   Variables: `#83a598`
*   Numbers: `#d3869b`
*   Comments: `#928374`

## 3. Implementation Steps

### Phase 1: Setup
1.  Create `resources/editorScheme/` directory.

### Phase 2: Editor Schemes (.xml)
Create 6 XML files based on the `.icls` format.
*   `gruvbox-dark.xml`: Base Dark
*   `gruvbox-dark-hard.xml`: Dark Hard (Background #1d2021)
*   `gruvbox-dark-soft.xml`: Dark Soft (Background #32302f)
*   `gruvbox-light.xml`: Base Light
*   `gruvbox-light-hard.xml`: Light Hard (Background #f9f5d7)
*   `gruvbox-light-soft.xml`: Light Soft (Background #f2e5bc)

### Phase 3: UI Themes (.theme.json)
Create 6 JSON files defining the UI look and feel, linking to the respective editor schemes.

### Phase 4: Plugin Configuration
Update `plugin.xml` to:
*   Register all 6 `themeProvider` extensions.
*   Update description to be bilingual (English/Chinese).

## 4. Testing
*   Verify all themes load in IntelliJ.
*   Check syntax highlighting contrast.
*   Check UI component visibility (tables, trees, inputs).
