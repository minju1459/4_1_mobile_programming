package com.example.mobile_programming

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById(R.id.btnNate)
        button2 = findViewById(R.id.btn911)
        button3 = findViewById(R.id.btnGal)
        button4 = findViewById(R.id.btnEnd)

        button1.setOnClickListener {
            Toast.makeText(applicationContext, "버튼을 눌렀어요!", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.nate.com"))
            startActivity(mIntent)
        }

        button2.setOnClickListener {
            Toast.makeText(applicationContext, "버튼을 눌렀어요!", Toast.LENGTH_SHORT).show()
            val mIntent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"))
            startActivity(mIntent)
        }

        button3.setOnClickListener {
            Toast.makeText(applicationContext, "버튼을 눌렀어요!", Toast.LENGTH_SHORT).show()
            val mIntent =
                Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"))
            startActivity(mIntent)
        }

        button4.setOnClickListener {
            Toast.makeText(applicationContext, "버튼을 눌렀어요!", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
