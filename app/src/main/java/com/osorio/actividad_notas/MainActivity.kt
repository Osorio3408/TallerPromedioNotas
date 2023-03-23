package com.osorio.actividad_notas

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSend:Button = findViewById(R.id.IdSend)
        btnSend.setOnClickListener { calculate() }
    }

    private fun calculate() {
        val inputStudentName: EditText = findViewById(R.id.student_name)


        val inputSubject: EditText = findViewById(R.id.subject)


        val inputNote1: EditText = findViewById(R.id.note_1)


        val inputNote2: EditText = findViewById(R.id.note_2)


        val inputNote3: EditText = findViewById(R.id.note_3)


     val intent = Intent(this,ResultadoPromedio::class.java)
     val miBundle:Bundle=Bundle()
        miBundle.putString("NameStudent",inputStudentName!!.text.toString())
        miBundle.putString("Subject",inputSubject.text.toString())
        miBundle.putDouble("Note1", inputNote1.text.toString().toDouble())
        miBundle.putDouble("Note2", inputNote2.text.toString().toDouble())
        miBundle.putDouble("Note3", inputNote3.text.toString().toDouble())
        intent.putExtras(miBundle)
        startActivity(intent)
    }


}