package com.osorio.actividad_notas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSend:Button = findViewById(R.id.IdSend)
        btnSend.setOnClickListener { calculate() }
    }

    private fun calculate() {
        val inputStudentName:EditText=findViewById(R.id.student_name)
        val studentName:String = inputStudentName.text.toString()

        val inputSubject:EditText=findViewById(R.id.subject)
        val Subject:String = inputSubject.text.toString()

        val inputNote1:EditText=findViewById(R.id.note_1)
        val note1:Double = inputNote1.text.toString().toDouble()

        val inputNote2:EditText=findViewById(R.id.note_2)
        val note2:Double = inputNote2.text.toString().toDouble()

        val inputNote3:EditText=findViewById(R.id.note_3)
        val note3:Double = inputNote3.text.toString().toDouble()

        var Result:Double = (note1 + note2 + note3)/3;



        Toast.makeText(this, "Bienvenido a $studentName", Toast.LENGTH_SHORT).show()

    }


}