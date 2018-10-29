package com.example.madsfinnerup.tractrac

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class NewsAdapter(private val context: Context,
                    private val dataSource: ArrayList<String>) : BaseAdapter() {

    private val inflater: LayoutInflater
            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return dataSource.size
    }

    override fun getItem(p0: Int): Any {
        return dataSource[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.news_card, p2, false)

        //Get title element
        val titleTextView = rowView.findViewById(R.id.news_title) as TextView

        val news = getItem(p0) as String

        titleTextView.text = news

        return rowView
    }
}
