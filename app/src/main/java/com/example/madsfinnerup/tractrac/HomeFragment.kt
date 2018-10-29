package com.example.madsfinnerup.tractrac

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.*
import java.util.ArrayList

class HomeFragment : Fragment() {

    private lateinit var listView : ListView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        listView = view.findViewById<ListView>(R.id.news_list_view)

        val data = getData()
        val adapter = NewsAdapter(context, data)

        listView.adapter = adapter

        return view

    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun getData(): ArrayList<String> {

        val news_list : ArrayList<String> = arrayListOf()
        news_list.add("Big win for Denmark")
        news_list.add("Americas Cup: Oracle joins")
        news_list.add("Big win for Denmark")
        news_list.add("Americas Cup: Oracle joins")
        news_list.add("Big win for Denmark")
        news_list.add("Americas Cup: Oracle joins")
        news_list.add("Big win for Denmark")
        news_list.add("Americas Cup: Oracle joins")


        return news_list
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onDetach() {
        super.onDetach()
    }


}
