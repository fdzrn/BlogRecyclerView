package com.blog.recyclerview.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.blog.recyclerview.R
import com.blog.recyclerview.adapter.MangaAdapter
import com.blog.recyclerview.data.MangaData
import com.blog.recyclerview.model.Manga
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var list: ArrayList<Manga> = arrayListOf()
    private lateinit var mangaAdapter: MangaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showRecyclerView()
    }
    private fun showRecyclerView() {
        list.addAll(MangaData.listData)
        mangaAdapter = MangaAdapter(list)
        recyclerview_manga.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = mangaAdapter
            setHasFixedSize(true)
        }
    }
}