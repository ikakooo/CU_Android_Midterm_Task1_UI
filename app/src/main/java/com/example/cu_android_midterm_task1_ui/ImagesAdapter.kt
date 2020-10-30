package com.example.cu_android_midterm_task1_ui

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.list_img_layout.view.*

class ImagesAdapter(
    private val list: MutableList<String>,
) :
    RecyclerView.Adapter<ImagesAdapter.ViewHolder>() {

    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.list_img_layout, parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.onBind()

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private lateinit var model: String

        fun onBind() {
            model = list[adapterPosition]
            Glide.with(itemView.context).load(model)
                .into(itemView.RecyclerView_imageView_ID)
        }
    }

}