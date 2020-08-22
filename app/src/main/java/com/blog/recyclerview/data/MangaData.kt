package com.blog.recyclerview.data

import com.blog.recyclerview.R
import com.blog.recyclerview.model.Manga

object MangaData {
    private val image = arrayOf(
        R.drawable.manga1,
        R.drawable.manga2,
        R.drawable.manga3,
        R.drawable.manga4,
        R.drawable.manga5,
        R.drawable.manga6,
        R.drawable.manga7,
        R.drawable.manga8,
        R.drawable.manga9,
        R.drawable.manga10
    )
    private val title = arrayOf(
        "Domestic na Kanojo",
        "Kanojo, Okarishimasu",
        "Real Girl",
        "The Promise Neverland",
        "One Piece",
        "Yahari Ore no Seishun Love Come wa Machigatteiru",
        "Uzaki-chan Wants to Hang Out!",
        "Rascal Does Not Dream of Bunny Girl Senpai",
        "Kakushigoto",
        "Sing Yesterday for Me"
    )
    private val author = arrayOf(
        "Kei Sasuga",
        "Reiji Miyajima",
        "Mao Nanami",
        "Kaiu Shirai",
        "Eiichiro Oda",
        "Wataru Watari",
        "Take",
        "Hajime Kamoshida",
        "Kōji Kumeta",
        "Kei Toume"
    )
    private val genre = arrayOf(
        "Romance",
        "Romantic comedy",
        "Romantic comedy",
        "Science fiction",
        "Adventure",
        "Slice of Life",
        "Comedy",
        "Supernatural",
        "Slice of Life",
        "Coming of Age"
    )

    val listData: ArrayList<Manga>
    get() {
        val list = arrayListOf<Manga>()
        for (i in image.indices) {
            val manga = Manga() // variabel manga adalah object dari data class Manga()
            manga.coverImage = image[i] // mengisi property pada data class berdasarkan index
            manga.title = title[i] // mengisi property pada data class berdasarkan index
            manga.author = author[i] // mengisi property pada data class berdasarkan index
            manga.genre = genre[i] // mengisi property pada data class berdasarkan index
            list.add(manga) // memasukan data yang telah di looping ke object manga
        }
        return list // mengembalikan data ke variabel list yang ada di baris 58
    }
}