package com.swiggy.dsl.library

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle

@Immutable
class Typography(
    val h1: TextStyle = TextStyle(),
    val h2: TextStyle = TextStyle(),
    val body1Regular: TextStyle = TextStyle(),
    val body2Regular: TextStyle = TextStyle()
)

internal val LocalTypography = staticCompositionLocalOf { Typography() }
