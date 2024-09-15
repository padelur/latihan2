package com.mobile.latihan2

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListView : AppCompatActivity() {
    private lateinit var lvData: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)

        lvData = findViewById(R.id.lv_data)

        // List array
        val namaHewan = listOf(
            "Gajah",
            "Kuda",
            "Beruang",
            "Panda",
            "Ular",
            "Kucing",
            "Sapi",
            "Kerbau",
            "Ikan"
        )


        lvData.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, namaHewan)

        // click
        lvData.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Anda Memilih : ${namaHewan[position]}", Toast.LENGTH_SHORT).show()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
