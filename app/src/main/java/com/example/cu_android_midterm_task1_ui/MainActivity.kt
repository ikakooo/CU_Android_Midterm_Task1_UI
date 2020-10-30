package com.example.cu_android_midterm_task1_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val imgLinkStringList = mutableListOf( "https://i.ibb.co/DW9RY0z/1.png","https://i.ibb.co/BskQrBw/2.png", "https://i.ibb.co/mcp3NHd/3.png", "https://i.ibb.co/3sCd0B8/4.png","https://i.ibb.co/JzLK2XR/5.png","https://i.ibb.co/MgQFwyd/6.png")
    private lateinit var imgRatesAdapter: ImagesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val downloadButtonID = findViewById<TextView>(R.id.Downloads_TextView_ID)
        val ratingStarsButtonID = findViewById<TextView>(R.id.ratingStars_TextView_ID)
        val personRatedTextViewID = findViewById<TextView>(R.id.personRated_TextView_ID)
        val travelTextViewID = findViewById<TextView>(R.id.travel_TextView_ID)
        val similarTextViewID = findViewById<TextView>(R.id.similar_TextView_ID)

       ///////////////////////SnackBar-ების კლიკზე გამოჩენეა////////////////////////////////
        downloadButtonID.apply {
        setOnClickListener { view ->
            Snackbar.make(view, "$text Billion Downloads ", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }}

        ratingStarsButtonID.apply {
            setOnClickListener { view ->
                Snackbar.make(view, "$text/5 Stars from ${personRatedTextViewID.text} users ", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            }
        }
        travelTextViewID.setOnClickListener { view ->
            Snackbar.make(view, "${travelString_TextView_ID.text} ", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        similarTextViewID.setOnClickListener { view ->
            Snackbar.make(view, "Similar", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        recyclerViewSetContent()
    }

    private fun recyclerViewSetContent() {
        RecyclerView_ID.apply {
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
            imgRatesAdapter = ImagesAdapter(imgLinkStringList)
           adapter = imgRatesAdapter
            imgRatesAdapter.notifyDataSetChanged()
        }

    }
}