package com.cronocode.materialloginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PatientActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient)
    }

    @Suppress("UNUSED_PARAMETER")
    fun findDoctor(view: View) {
        val intent = Intent(this, FindDoctorActivity::class.java)
        startActivity(intent)
    }
}
