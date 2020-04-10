package com.cronocode.materialloginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DoctorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor)
    }

    @Suppress("UNUSED_PARAMETER")
    fun goLive(view: View) {
        val intent = Intent(this, GoLiveActivity::class.java)
        startActivity(intent)
    }
}
