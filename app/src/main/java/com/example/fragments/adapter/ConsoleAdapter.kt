package com.example.fragments.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragments.R
import com.example.fragments.holder.ConsoleViewHolder
import com.example.fragments.model.Console

class ConsoleAdapter(): RecyclerView.Adapter<ConsoleViewHolder>() {

    private var consoleList = listOf<Console>()

    fun updateConsoleList(list: List<Console>) {
        consoleList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConsoleViewHolder {
        val view = LayoutInflater
                          .from(parent.context)
                          .inflate(R.layout.holder_console_layout, parent, false)
        return ConsoleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return consoleList.size
    }

    override fun onBindViewHolder(holder: ConsoleViewHolder, position: Int) {
        holder.bind(consoleList[position])
    }
}