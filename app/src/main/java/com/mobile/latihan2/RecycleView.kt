package com.mobile.latihan2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mobile.latihan2.adapter.BukuAdapter
import com.mobile.latihan2.model.ModelBuku


private lateinit var rev_data : RecyclerView
class RecycleView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)
        rev_data = findViewById(R.id.rv_data)

        //kita array list
        val listBuku = listOf(
            ModelBuku(judul = "Legend of Saber Roam", penulis = "Fadhlur Rahman"),
            ModelBuku(judul = "Pemrograman dasar", penulis = "Padelur"),
            ModelBuku(judul = "Buku Android 2024", penulis = "padlur"),
            ModelBuku(judul = "Kuma", penulis = "Fadhlur Rahman Amir"),
            ModelBuku(judul = "One Piece", penulis = "Eichiro oda"),
            ModelBuku(judul = "Jujutsu Kaisen", penulis = "Gege Akutami"),
            ModelBuku(judul = "Attack On Titan", penulis = "Hajime Isayama"),

            )

        //set adapter
        val nBukuAdapter = BukuAdapter(listBuku)
        rev_data.apply {
            layoutManager = LinearLayoutManager(this@RecycleView)
            adapter = nBukuAdapter
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}