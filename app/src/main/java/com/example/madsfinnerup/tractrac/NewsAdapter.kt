package com.example.madsfinnerup.tractrac

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class NewsAdapter(private val context: Context,
                    private val dataSource: ArrayList<String>) : BaseAdapter() {

    private val inflater: LayoutInflater
            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return dataSource.size
    }

    override fun getItem(i: Int): Any {
        return dataSource[i]
    }

    override fun getItemId(i: Int): Long {
        return i.toLong()
    }

    override fun getView(i: Int, view: View?, viewGroup: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.news_card, viewGroup, false)

        //Get title element
        val titleTextView = rowView.findViewById(R.id.news_title) as TextView

        val imageView = rowView.findViewById(R.id.news_cover) as ImageView

        val news = getItem(i) as String
        val data = news.split(",")

        titleTextView.text = data[0]
        imageView.setImageResource(data[1].toInt())

        return rowView
    }
}
