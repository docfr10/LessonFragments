package com.example.lesson_fragments

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.frameLayout, BlankFragment()).commit()

        val list = listOf(
            "A",
            "B",
            "C",
            "A",
            "B",
            "C",
            "A",
            "B",
            "C",
            "A",
            "B",
            "C",
            "A",
            "B",
            "C",
            "A",
            "B",
            "C",
            "A",
            "B",
            "C",
            "A",
            "B",
            "C",
            "A",
            "B",
            "C",
            "A",
            "B",
            "C",
            "A",
            "B",
            "C",
            "A",
            "B",
            "C"
        )
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)
        val listView: ListView = findViewById(R.id.listView)

        listView.adapter = adapter
    }
}