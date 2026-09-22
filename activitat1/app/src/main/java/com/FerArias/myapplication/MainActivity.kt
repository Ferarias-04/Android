package com.FerArias.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        exempleInferenciaTipus()
        exempleSubstitucioVariableString()
        mutabilitatVariables()
    }
    fun exempleInferenciaTipus(){
        val nom = "fer"
        println("Hola $nom")
    }
    fun exempleSubstitucioVariableString() {
        val nom = "fer"
        val edat = 22
        println("hey! el teu nom té ${nom.length} lletras i tens $edat anys")
    }
    fun mutabilitatVariables() {

    }
}