package com.example.cu_android_midterm_task1_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val imgLinkStringList = mutableListOf( "https://i.ibb.co/DW9RY0z/1.png","https://i.ibb.co/BskQrBw/2.png", "https://i.ibb.co/mcp3NHd/3.png", "https://i.ibb.co/3sCd0B8/4.png","https://i.ibb.co/JzLK2XR/5.png","https://i.ibb.co/MgQFwyd/6.png")
    private lateinit var imgRatesAdapter: ImagesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        RecyclerView_ID.apply {
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
            imgRatesAdapter = ImagesAdapter(imgLinkStringList)
           adapter = imgRatesAdapter
            imgRatesAdapter.notifyDataSetChanged()
        }

    }
}