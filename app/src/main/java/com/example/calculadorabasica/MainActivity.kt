package com.example.calculadorabasica

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val valor1 = findViewById<EditText>(R.id.valor1)
        val valor2 = findViewById<EditText>(R.id.valor2)
        val resultado = findViewById<TextView>(R.id.resultado)
        val somar = findViewById<TextView>(R.id.somar)
        val subtrair = findViewById<TextView>(R.id.subtrair)
        val multiplicar = findViewById<TextView>(R.id.multiplicar)
        val dividir = findViewById<TextView>(R.id.dividir)
        val apagar = findViewById<TextView>(R.id.apagar)

        somar.setOnClickListener {
            if(valor1.text.isNotEmpty() && valor2.text.isNotEmpty()) {
                resultado.text = somar(valor1.text.toString().toInt(), valor2.text.toString().toInt()).toString()
            } else {
                resultado.text = "Preencha os dois campos"
            }
        }

        subtrair.setOnClickListener {
            if(valor1.text.isNotEmpty() && valor2.text.isNotEmpty()) {
                resultado.text = subtrair(valor1.text.toString().toInt(), valor2.text.toString().toInt()).toString()
            } else {
                resultado.text = "Preencha os dois campos"
            }
        }

        multiplicar.setOnClickListener {
            if(valor1.text.isNotEmpty() && valor2.text.isNotEmpty()) {
                resultado.text = multiplicar(valor1.text.toString().toInt(), valor2.text.toString().toInt()).toString()
            } else {
                resultado.text = "Preencha os dois campos"
            }
        }

        dividir.setOnClickListener {
            if(valor1.text.isNotEmpty() && valor2.text.isNotEmpty()) {
                resultado.text = dividir(valor1.text.toString().toInt(), valor2.text.toString().toInt()).toString()
            } else {
                resultado.text = "Preencha os dois campos"
            }
        }

        apagar.setOnClickListener {
            valor1.text.clear()
            valor2.text.clear()
            resultado.text = "Resultado"
        }
    }

    fun somar(valor1: Int, valor2: Int): Int {
        return valor1 + valor2
    }

    fun subtrair(valor1: Int, valor2: Int): Int {
        return valor1 - valor2
    }

    fun multiplicar(valor1: Int, valor2: Int): Int {
        return valor1 * valor2
    }

    fun dividir(valor1: Int, valor2: Int): Int {
        return valor1 / valor2
    }
}