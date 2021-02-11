package com.example.fragments.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragments.R
import com.example.fragments.model.Console


class ConsoleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val textConsoleName = itemView.findViewById<TextView>(R.id.console_name)
    val textConsoleMaker = itemView.findViewById<TextView>(R.id.console_maker)
    val textConsoleReleaseDate = itemView.findViewById<TextView>(R.id.console_release_date)
    val textConsoleDescription = itemView.findViewById<TextView>(R.id.console_description)
    val imageConsole = itemView.findViewById<ImageView>(R.id.console_image)

    fun bind(console: Console){

        textConsoleName.text = console.consoleName
        textConsoleMaker.text = console.consoleMaker
        textConsoleReleaseDate.text = console.consoleReleaseDate
        textConsoleDescription.text = console.consoleDescription
        imageConsole.setImageDrawable(console.consoleImage)

    }
}