package com.example.fragments.model

import android.graphics.drawable.Drawable

data class Console(

    var consoleId: Long,
    var consoleName: String,
    var consoleMaker: String,
    var consoleReleaseDate: String,
    var consoleImage: Drawable,
    var consoleDescription: String


)