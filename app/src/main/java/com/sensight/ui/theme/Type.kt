package com.sensight.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.unit.sp
import com.sensight.R

@Suppress("SpellCheckingInspection")
val inconsolataBold = FontFamily(
    Font(resId = R.font.inconsolata_bold)
)
@Suppress("SpellCheckingInspection")
val inconsolataLight = FontFamily(
    Font(resId = R.font.inconsolata_light)
)
@Suppress("SpellCheckingInspection")
val inconsolataRegular = FontFamily(
    Font(resId = R.font.inconsolata_regular)
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = inconsolataBold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    titleLarge = TextStyle(
        fontFamily = inconsolataRegular,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = inconsolataLight,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)