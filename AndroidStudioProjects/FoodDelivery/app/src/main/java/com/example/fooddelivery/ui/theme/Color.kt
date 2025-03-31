package com.example.fooddelivery.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Pink = Color(0xFFF28482)
val Green = Color(0xFF84A59D)
val Yellow = Color(0xFFF7EDE2)
val YellowLight = Color(0xFFFFFFF2)
val Dark = Color(0xFF3D405B)

@Immutable
data class AppColors(
        val background: Color,
        val onBackground: Color,
        val surface: Color,
        val onSurface: Color,
        val secondarySurface: Color, // Add this property
        val onSecondarySurface: Color,
        val regularSurface: Color,
        val onRegularSurface: Color, // Note: inconsistent capitalization
        val actionSurface: Color,
        val onActionSurface: Color,
        val highlightSurface: Color,
        val onHighlightSurface: Color,
)

val LocalAppColors = staticCompositionLocalOf{
        AppColors(
                background = Color.Unspecified,
                onBackground = Color.Unspecified,
                surface = Color.Unspecified,
                onSurface = Color.Unspecified,
                secondarySurface = Color.Unspecified, // Add this property
                onSecondarySurface = Color.Unspecified,
                regularSurface = Color.Unspecified,
                onRegularSurface = Color.Unspecified,
                actionSurface = Color.Unspecified,
                onActionSurface = Color.Unspecified,
                highlightSurface = Color.Unspecified,
                onHighlightSurface = Color.Unspecified,
        )
}

val extendedColors =
        AppColors(
                background = Color.White,
                onBackground = Dark,
                surface = Color.White,
                onSurface = Dark,
                secondarySurface = Pink,
                onSecondarySurface = Color.White,
                regularSurface = YellowLight,
                onRegularSurface = Dark, // Should match case with data class (OnRegularSurface)
                actionSurface = Yellow,
                onActionSurface = Pink,
                highlightSurface = Green,
                onHighlightSurface = Color.White,
        )