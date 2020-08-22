package com.blog.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blog.recyclerview.R
import com.blog.recyclerview.model.Manga
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_list_manga.view.*

class MangaAdapter(private val listManga: ArrayList<Manga> ) : RecyclerView.Adapter<MangaAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MangaAdapter.ViewHolder =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list_manga,parent,false))

    override fun onBindViewHolder(holder: MangaAdapter.ViewHolder, position: Int) = holder.bind(listManga[position])

    override fun getItemCount(): Int = listManga.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(manga : Manga) {
            Glide.with(itemView.context)
                .load(manga.coverImage) // data gambar yang di ambil
                .apply(RequestOptions().override(90, 110)) // menyesuaikan dengan ukuran yang ada di layout
                .into(itemView.image_manga) // data gambar yang di masukan ke layout
            itemView.text_title.text = manga.title
            itemView.text_author.text = manga.author
            itemView.text_genre.text = manga.genre
        }
    }
}
