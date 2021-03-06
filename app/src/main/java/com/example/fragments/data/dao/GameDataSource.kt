package com.example.fragments.data.dao

import android.content.Context
import com.example.fragments.R
import com.example.fragments.model.Console
import com.example.fragments.model.Game

class GameDataSource {

    companion object{

        fun getGames(context: Context): ArrayList<Game>{
            var games = ArrayList<Game>()

            games.add(Game(
                1,
                "Mortal Kombat",
                context.getDrawable(R.drawable.mortal_kombat)!!,
            "Jogo de lutinha +18 pow pul plau finish him fatality não jogar perto dos seus pais",
            4.5f,
            listOf(Console(1, "Xbox 360", "Microsoft", "2015", context.getDrawable(R.drawable.xbox)!!, ""),
                   Console(2, "Playstation 3", "Sony", "2015", context.getDrawable(R.drawable.playstation)!!, "")
            )
            ))
            games.add(Game(2,
                "Crash Bandicoot",
                context.getDrawable(R.drawable.crash_bandicoot)!!,
                "Raposa bípede de shortinho combate um mano amarelo ao lado de mascara falante indígena",
                5.0f,
                listOf(Console(3, "Playstation 4", "Sony", "2019", context.getDrawable(R.drawable.playstation)!!, ""))
            ))
            games.add(Game(3,
                "Minecraft",
                context.getDrawable(R.drawable.minecraft)!!,
                "Mendigo quadrado sobrevive q nem bear grills ou brinca de Deus no criativo ou minigames online diversão",
                5.0f,
                listOf(Console(4, "Xbox 360", "Microsoft", "2015", context.getDrawable(R.drawable.xbox)!!, ""),
                       Console(5, "PC", "Windows", "2015", context.getDrawable(R.drawable.playstation)!!, "")
                )
            ))
            return games
        }
    }

}

