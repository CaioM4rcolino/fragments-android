package com.example.fragments.fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragments.R
import com.example.fragments.adapter.ConsoleAdapter
import com.example.fragments.data.dao.ConsoleDataSource
import com.example.fragments.data.dao.GameDataSource
import com.example.fragments.model.Console


class ConsoleFragment : Fragment() {

    private lateinit var recyclerConsoles: RecyclerView
    private val consoleAdapter = ConsoleAdapter()
    private var consoleList = listOf<Console>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        setHasOptionsMenu(true)

        val view =  inflater.inflate(R.layout.fragment_console, container, false)

        //Instanciar a RecyclerView
        recyclerConsoles = view.findViewById(R.id.recycler_view_consoles)
//
//        //Determinar a orientação da recyclerview
        recyclerConsoles.layoutManager = LinearLayoutManager(view.context)
//
//        //informar para a recyclerview quem é o adapter que ela vai usar
        recyclerConsoles.adapter = consoleAdapter
//
//        //dizer ao adapter qual é a fonte de dados
        consoleList = ConsoleDataSource.getConsoles(view.context)
//
//
//        //atualizar a lista de jogos do adapter
        consoleAdapter.updateConsoleList(consoleList)
//
        return view
    }

}