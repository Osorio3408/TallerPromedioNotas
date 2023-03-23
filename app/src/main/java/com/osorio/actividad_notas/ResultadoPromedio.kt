package com.osorio.actividad_notas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoPromedio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_promedio)

        val Name_Student = findViewById<TextView>(R.id.Result_Name)
        val Subject_Student = findViewById<TextView>(R.id.Result_Subject)
        val Note1_Student = findViewById<TextView>(R.id.Result_Note1)
        val Note2_Student = findViewById<TextView>(R.id.Result_Note2)
        val Note3_Student = findViewById<TextView>(R.id.Result_Note3)
        val Promedio_Student = findViewById<TextView>(R.id.Result_Promedio)

        var miBundle:Bundle? = this.intent.extras

        if(miBundle != null){
            Name_Student.text="${miBundle.getString("NameStudent")}"
            Subject_Student.text="${miBundle.getString("Subject")}"
            val Note1:Double = miBundle.getDouble("Note1")
            val Note2:Double = miBundle.getDouble("Note2")
            val Note3:Double = miBundle.getDouble("Note3")
            val NameStundent:String? = miBundle.getString("NameStudent")
            Note1_Student.text="${miBundle.getDouble("Note1")}"
            Note2_Student.text="${miBundle.getDouble("Note2")}"
            Note3_Student.text="${miBundle.getDouble("Note3")}"

            var resultPromedio:Double = (Note1 + Note2 + Note3)/3;

            val result = if (resultPromedio>=3.5){
                Promedio_Student.setTextColor(resources.getColor(R.color.green))
                "El estudiante ${NameStundent} Aprobó"
            }  else {
                Promedio_Student.setTextColor(resources.getColor(R.color.red))
                "El estudiante ${NameStundent} Reaprobó"
            }

            Promedio_Student.text="El resultado es: ${resultPromedio} y ${result}"


        }

        val btnSalir:Button = findViewById(R.id.Exit)
        btnSalir.setOnClickListener { onClick() }


    }

    private fun onClick() {
        finish()
    }
}