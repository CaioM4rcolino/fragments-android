package com.example.fragments.data.dao

import android.content.Context
import com.example.fragments.R
import com.example.fragments.model.Console
import com.example.fragments.model.Game

class ConsoleDataSource {

        companion object{

            fun getConsoles(context: Context): ArrayList<Console>{
                var consoles = ArrayList<Console>()

                consoles.add(
                    Console(
                        1,
                        "Playstation 2",
                        "Sony",
                        "03/12/1994",
                        context.getDrawable(R.drawable.playstation)!!,
                        "A PlayStation 2 (PS2) é o segundo console de videogame produzido pela Sony Computer Entertainment, após a PlayStation original. Foi inicialmente lançada no dia 4 de março de 2000 no Japão, no dia 26 de outubro na América do Norte, e posteriormente, no dia 24 de Novembro na Europa. A PlayStation 2 possui hoje o título da consola de videogame mais vendida na história: foram mais de 150 milhões de unidades comercializadas no mundo."
                        )

                )
                consoles.add(
                    Console(
                        2,
                        "Xbox",
                        "Microsoft",
                        "03/12/2001",
                        context.getDrawable(R.drawable.xbox)!!,
                        "O Xbox é um console de vídeo game produzido pela Microsoft. Foi lançado em 15 de novembro de 2001 na América do Norte, 22 de fevereiro de 2002 no Japão, e 14 de Março de 2002 na Austrália e Europa. Foi a primeira incursão da Microsoft no mercado de vídeo games. Como parte da sexta-geração de jogos, o Xbox competiu com Sony PlayStation 2, Sega Dreamcast (que parou as vendas americanas antes que o Xbox fosse colocado à venda) e o Nintendo GameCube."
                    )

                )
                consoles.add(
                    Console(
                        3,
                        "Xbox One",
                        "Microsoft",
                        "22/11/2013",
                        context.getDrawable(R.drawable.xboxone)!!,
                        "Xbox One é um console de videojogos, da oitava geração, produzida pela empresa Microsoft, lançado em 2013, como a terceira edição da série Xbox e, sucessor do Xbox 360. Competindo diretamente com os consoles PlayStation 4 e Nintendo Switch. Introduzido no mercado oito anos após o lançamento do Xbox 360. O Xbox One apresenta jogos com gráficos de alta definição superiores aos vistos no seu antecessor. Foi anunciado no dia 21 de maio de 2013, apresentado ao público pelo presidente de negócios de entretenimento interativo da Microsoft, Don Mattrick, no evento especial Xbox Reveal, como o sucessor do Xbox 360. Seu lançamento oficial foi feito em novembro de 2013 custando US$ 499,00 (€ 499,00 ou R$ 2.299,00). O codinome de desenvolvimento do Xbox One foi denominado de Durango e foi anunciado oficialmente no dia 21 de maio de 2013."

                    )
                )
              return consoles
            }
        }
}