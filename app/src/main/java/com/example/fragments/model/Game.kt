package com.example.fragments.model

import android.graphics.drawable.Drawable

data class Game(

    var gameId: Long,
    var gameName: String,
    var gameImage: Drawable,
    var gameDescription: String,
    var gameRate: Double,
    listOf: List<Console>

)