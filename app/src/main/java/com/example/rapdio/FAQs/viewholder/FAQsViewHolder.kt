package com.example.rapdio.FAQs.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rapdio.model.FAQsModel
import kotlinx.android.synthetic.main.faqs_item_layout.view.*

class FAQsViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
    fun setData(faq: FAQsModel) {
        itemView.apply {
            Glide.with(this).load(faq.icon).into(ivIcon)
            tvTitle.text = faq.title.toString()
        }
    }

}