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
        botDeSeguretat()
        exempleInferenciaTipus()
        exempleSubstitucioVariableString()
        mutabilitatVariables()
        nullSafety()
        expressions()
        val nom = "fer"
        saludar(nom)
        lambda()
        coleccions()
        mapIfilter()


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
        val nom = "fer"
        var edat = 22
        edat = 23
        // nom = "jael" //això no compilará

        val llista = mutableListOf(1, 2, 3)
        llista.add(4)
        //llista = mutableListOf(5, 6) donarà error perquè no es por reasignar
    }
    fun nullSafety() {
        var titol: String? = null
        println(titol?.length)
        println(titol!!.length)
        println(titol ?: "no hi ha titol")
    }
    fun expressions() {
        val edat = 22
        val missaatge = if (edat >= 23) "Adult" else "Encara no"
        val etapes = when (edat) {
            in 0..12 -> "nen"
            in 13..16 -> "Adolescent"
            else -> "Adult"
        }
        val resultat = try {
            10 / 0
            } catch (e: Exception) {
                -1
            }
        }
    fun saludar(nom : String): Unit {
        println("Hola! $nom")
    }
    fun lambda() {
        val suma = {a: Int, b: Int -> a+b}
        println(suma(2, 7))
        val nums = listOf(1, 2, 3, 4)
        val dobles = nums.map { it *2 }
    }
    fun coleccions() {
        val fixe = listOf(2, 3, 4)
        //fixe.add(5) no existeix el mètode add en aquest cas
        val modificable = mutableListOf(7, 8, 9)
        modificable.add(10)
    }
    fun mapIfilter() {
        val nums = listOf(3, 5, 4, 7, 2, 8)
        val dobles = nums.map { it *2 }
        val par = nums.filter { it % 2 == 0 }
    }
   /* open Class Animal {
        fun so() = "..."
    }
    Class Gos : Animal() {
        fun so() = "guau"
    }

    */
    /*
    interface Volador {
        fun volar()
        fun aterrizar() {
            println("Aterrizando")
        }
    }
    class Ocell : Volador {
        override fun volar()
            println("l'ocell vola")
    }
     */
    /*
    class Persona(val nom: String, var edat: Int)

    val p = Persona("Fer", 22)
    println(p.nom)
     */
    /*
class Persona {
    String nombre;
    int edad;
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
Persona p = new Persona("Fer", 22);
     */
    /*
    data class Persona(val nom: String, val edat: Int)

    val p1 = Persona("fer", 22)
    val p2 = Persona("fer", 22)
    println(p1) aquí aplicaría toString()
    println(p1 == p2) aquí equals()
    val p3 = p1.copy(edat = 23) crea una copia canviant només edat
     */
    /*
    enum class Equips {BLAU, GROC, VERMELL, LILA, BLANC, NEGRE}

    fun esBarca(escut: Equips) = when (escut) {
        Equips.BLAU, Equips.VERMELL -> "FCB!"
        else -> "Madridista qui no boti!"
    }
     */
    /*
    sealed class Resultat
    class Exit(val dades: String) : Resultat()
    class Error(val missatge: String) : Resultat()

    fun processar(r : Resultat) = when (r) {
        is exit -> "Dades: ${r.dades}"
        is error -> "Error: ${r.missatge}"
    }
     */
   fun botDeSeguretat() {
       val p = Persona("Fer", 22, listOf("padel", "llegir", "fútbol"))
       if (!p.name.equals("Fer")) {
           println("Accés denegat")
           return
       } else {
           println("Èxit! pots continuar")
       }
       val edats = when (p.age) {
           in 0..13 -> "Sou massa petit, accés denegat"
           in 14..17 -> "Necessiteu permís parental"
           else -> "Èxit! endavant..."
       }
       println(edats)
       val llistaOrdenada = p.entreteniments.sorted()
       for (l in llistaOrdenada) {
           if (l[0].uppercaseChar() in 'A'..'L') {
               println(l)
           }
       }
   }
}
