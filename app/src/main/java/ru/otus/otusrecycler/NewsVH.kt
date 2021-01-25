package ru.otus.otusrecycler

import android.graphics.Color
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val titleTv: TextView = itemView.findViewById(R.id.titleTv)
    val subtitleTv: TextView = itemView.findViewById(R.id.subtitleTv)
    val image: ImageView = itemView.findViewById(R.id.image)

    fun bind(item: NewsItem) {
        titleTv.text = item.title
        subtitleTv.text = item.subTitle
        image.setBackgroundColor(item.color)
    }
}