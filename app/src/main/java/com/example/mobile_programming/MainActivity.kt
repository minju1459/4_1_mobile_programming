package com.example.mobile_programming

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd = findViewById<Button>(R.id.BtnAdd)
        val btnSub = findViewById<Button>(R.id.BtnSub)
        val btnMul = findViewById<Button>(R.id.BtnMul)
        val btnDiv = findViewById<Button>(R.id.BtnDiv)
        val btnRem = findViewById<Button>(R.id.BtnRem)
        val num1 = findViewById<EditText>(R.id.Edit1)
        val num2 = findViewById<EditText>(R.id.Edit2)
        val result = findViewById<TextView>(R.id.TextResult)

        btnAdd.setOnClickListener {
            if (num1.text.isEmpty() || num2.text.isEmpty()) {
                Toast.makeText(applicationContext, "값을 입력해주세요", Toast.LENGTH_SHORT).show()
            } else {
                result.text =
                    "계산 결과: ${num1.text.toString().toFloat() + num2.text.toString().toFloat()}"
            }
        }
        btnSub.setOnClickListener {
            if (num1.text.isEmpty() || num2.text.isEmpty()) {
                Toast.makeText(applicationContext, "값을 입력해주세요", Toast.LENGTH_SHORT).show()
            } else {
                result.text =
                    "계산 결과: ${num1.text.toString().toFloat() - num2.text.toString().toFloat()}"
            }
        }
        btnMul.setOnClickListener {
            if (num1.text.isEmpty() || num2.text.isEmpty()) {
                Toast.makeText(applicationContext, "값을 입력해주세요", Toast.LENGTH_SHORT).show()
            } else {
                result.text =
                    "계산 결과: ${num1.text.toString().toFloat() * num2.text.toString().toFloat()}"
            }
        }
        btnDiv.setOnClickListener {
            if (num1.text.isEmpty() || num2.text.isEmpty()) {
                Toast.makeText(applicationContext, "값을 입력해주세요", Toast.LENGTH_SHORT).show()
            } else if (num2.text.toString().toFloat() == 0.0f) {
                Toast.makeText(applicationContext, "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show()
            } else {
                result.text =
                    "계산 결과: ${num1.text.toString().toFloat() / num2.text.toString().toFloat()}"
            }
        }

        btnRem.setOnClickListener {
            if (num1.text.isEmpty() || num2.text.isEmpty()) {
                Toast.makeText(applicationContext, "값을 입력해주세요", Toast.LENGTH_SHORT).show()
            } else if (num2.text.toString().toFloat() == 0.0f) {
                Toast.makeText(applicationContext, "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show()
            } else {
                result.text =
                    "계산 결과: ${num1.text.toString().toFloat() % num2.text.toString().toFloat()}"
            }
        }
    }
}
