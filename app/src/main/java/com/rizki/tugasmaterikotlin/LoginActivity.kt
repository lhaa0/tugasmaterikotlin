package com.rizki.tugasmaterikotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener {
            if (!username.text.toString().equals("")) {
                Konstanta.setJK(spinner.selectedItem.toString())
                Konstanta.username = username.text.toString()
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Username Tidak Boleh Kosong", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
