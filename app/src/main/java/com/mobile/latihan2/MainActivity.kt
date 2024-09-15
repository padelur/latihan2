package com.mobile.latihan2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var txtUsername : EditText
    private lateinit var txtPassword : EditText
    private lateinit var btnLogin : Button
    private lateinit var btnloginpage : Button
    private lateinit var btnListview : Button
    private lateinit var  btnRecycle : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnLogin = findViewById(R.id.btnLogin)
        txtUsername = findViewById(R.id.txtUsername)
        txtPassword = findViewById(R.id.txtPassword)
        btnloginpage=findViewById(R.id.btnloginpage)
        btnListview=findViewById(R.id.btnListview)
        btnRecycle = findViewById(R.id.btnRecycle)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnloginpage.setOnClickListener(){
            val intentmenu2  = Intent(this@MainActivity, LoginPageActivity::class.java)
            startActivity(intentmenu2)

        }
        btnListview.setOnClickListener(){
            val intentmenu2  = Intent(this@MainActivity, ListView::class.java)
            startActivity(intentmenu2)

        }
        btnRecycle.setOnClickListener() {
            val intentMenu2 = Intent(
                this@MainActivity,
                RecycleView::class.java
            )
            startActivity(intentMenu2)
        }
        btnLogin.setOnClickListener(){
            val userName = txtUsername.text.toString()
            val password = txtPassword.text.toString()

            if(userName == "admin" && password == "12345")
            {
                val intentmenu2  = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intentmenu2)
            }
            else
            {
                Toast.makeText(this, "Password anda salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}