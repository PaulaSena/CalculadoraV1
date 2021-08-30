package com.example.calculadorav1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular = btnCalcular
        val resultado = resultado

        btnCalcular.setOnClickListener{
            val n1: Int = Integer.parseInt(n1.text.toString())
            val n2: Int = Integer.parseInt(n2.text.toString())
            val total: Int = (n1 + n2)
            val media: Int = total / 2
            val falta: Int = Integer.parseInt(falta.text.toString())

            if (media >= 6 && falta <= 10) {
                resultado.setText("Parabéns foi aprovado!!\n Nota Final: $total\n Média: $media\n Faltas: $falta")
                resultado.setTextColor(Color.GREEN)

            }else{
                resultado.setText("Precisa estudar mais esta reprovado!! \n Nota Final: $total \n Media: $media\n Faltas: $falta")
                resultado.setTextColor(Color.RED)
            }

        }
    }
}
