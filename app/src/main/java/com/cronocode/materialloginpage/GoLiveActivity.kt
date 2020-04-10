package com.cronocode.materialloginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GoLiveActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go_live)

        recyclerView = findViewById<RecyclerView>(R.id.patientList).apply {
//            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@GoLiveActivity)
            adapter = MyAdapter(arrayOf("Abu","Praveen","Sathya","Yogesh","Ram"))
        }
    }
}
