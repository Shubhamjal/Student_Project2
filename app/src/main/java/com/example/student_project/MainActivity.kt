package com.example.student_project

import android.annotation.SuppressLint
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

    var btn: Button?=null//var declaration
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show()



        btn=findViewById(R.id.button)
        btn?.setOnClickListener {  //save button Toast
            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()
        }
        btn?.setOnClickListener{
            val Intent=Intent(this,SecondActivity::class.java)
            startActivity(Intent)}

        btn=findViewById(R.id.button2)
        btn?.setOnClickListener {  //Cancel button toast
            Toast.makeText(this, "Canceled", Toast.LENGTH_SHORT).show()
        }

    }




}