package com.swiggy.dsl.library

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
class ColorScheme(
    val primary: Color,
    val primarySub: Color,
    val positive: Color,
    val negative: Color,
    val backgroundPrimary: Color,
    val backgroundSecondary: Color,
    val textHighestEmphasis: Color,
    val textHighEmphasis: Color,
    val textMedEmphasis: Color,
    val textLowEmphasis: Color
)

val orange1 = Color(0xFFF15700)
val orange2 = Color(0xFFFFEEE5)
val orange3 = Color(0xFF52231A)

val lavender1 = Color(0xFFAD70FF)
val lavender2 = Color(0xFFEFE3FF)
val lavender3 = Color(0xFF6B2AC2)

val green1 = Color(0xFF1BA672)
val red1 = Color(0xFFE53554)

val slate00 = Color.White
val slate05 = Color(0xFFF0F0F5)

val slateAlpha92 = Color(0xEB02060C)
val slateAlpha75 = Color(0xBF02060C)
val slateAlpha60 = Color(0x9902060C)
val slateAlpha45 = Color(0x7302060C)

val chalk00 = Color(0xFF02060C)
val chalk05 = Color(0xFF1B1E24)

val chalkAlpha92 = Color(0xEBFFFFFF)
val chalkAlpha75 = Color(0xBFFFFFFF)
val chalkAlpha60 = Color(0x99FFFFFF)
val chalkAlpha45 = Color(0x73FFFFFF)

fun storeFrontColorScheme(isInDarkMode: Boolean = false) = if (isInDarkMode) {
    storeFrontDarkColors()
} else {
    storeFrontLightColors()
}

private fun storeFrontLightColors() = ColorScheme(
    primary = orange1,
    primarySub = orange2,
    positive = green1,
    negative = red1,
    backgroundPrimary = slate00,
    backgroundSecondary = slate05,
    textHighestEmphasis = slateAlpha92,
    textHighEmphasis = slateAlpha75,
    textMedEmphasis = slateAlpha60,
    textLowEmphasis = slateAlpha45
)

private fun storeFrontDarkColors() = ColorScheme(
    primary = orange1,
    primarySub = orange3,
    positive = green1,
    negative = red1,
    backgroundPrimary = chalk00,
    backgroundSecondary = chalk05,
    textHighestEmphasis = chalkAlpha92,
    textHighEmphasis = chalkAlpha75,
    textMedEmphasis = chalkAlpha60,
    textLowEmphasis = chalkAlpha45
)

fun gourmetColorScheme(isInDarkMode: Boolean = false) = if (isInDarkMode) {
    gourmetDarkColors()
} else {
    gourmetLightColors()
}

private fun gourmetLightColors() = ColorScheme(
    primary = lavender1,
    primarySub = lavender2,
    positive = green1,
    negative = red1,
    backgroundPrimary = slate00,
    backgroundSecondary = slate05,
    textHighestEmphasis = slateAlpha92,
    textHighEmphasis = slateAlpha75,
    textMedEmphasis = slateAlpha60,
    textLowEmphasis = slateAlpha45
)

private fun gourmetDarkColors() = ColorScheme(
    primary = lavender1,
    primarySub = lavender3,
    positive = green1,
    negative = red1,
    backgroundPrimary = chalk00,
    backgroundSecondary = chalk05,
    textHighestEmphasis = chalkAlpha92,
    textHighEmphasis = chalkAlpha75,
    textMedEmphasis = chalkAlpha60,
    textLowEmphasis = chalkAlpha45
)

/**
 * CompositionLocal used to pass [ColorScheme] down the tree.
 */
internal val LocalColorScheme = staticCompositionLocalOf { storeFrontLightColors() }
