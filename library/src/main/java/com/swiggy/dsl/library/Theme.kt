package com.swiggy.dsl.library

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

/**
 * Theme with `storeFrontColorScheme`
 */
@Composable
fun StoreFrontTheme(
    isInDarkMode: Boolean = false,
    content: @Composable () -> Unit
) {
    Theme(
        colorScheme = storeFrontColorScheme(isInDarkMode),
        typography = Typography(),
        content = content
    )
}

/**
 * Theme with `gourmetColorScheme`
 */
@Composable
fun GourmetTheme(
    isInDarkMode: Boolean = false,
    content: @Composable () -> Unit
) {
    Theme(
        colorScheme = gourmetColorScheme(isInDarkMode),
        typography = Typography(),
        content = content
    )
}

/**
 * Base function to create a theme
 */
@Composable
private fun Theme(
    colorScheme: ColorScheme,
    typography: Typography,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalColorScheme provides colorScheme,
        LocalTypography provides typography
    ) {
        content()
    }
}

/**
 * Access current theme values based on the call site position in the hierarchy.
 */
object Theme {

    /**
     * Retrieves current theme [ColorScheme] at the call site's position in the hierarchy
     */
    val colorScheme: ColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalColorScheme.current

    /**
     * Retrieves current theme [Typography] at the call site's position in the hierarchy
     */
    val typography: Typography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current
}
