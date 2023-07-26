package pt.malainho.appkotlin1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variaveisNumerosInteiros()
        variaveisNumerosFracionarios()
        variaveisCarateres()
        variaveisBoleanas()

        constantes()

        cadeiasCarateres()
    } // Fim do onCreate

    private fun variaveisNumerosInteiros() {
        // Variável para inteiros
        // Byte, Short, Int, Long
        var b : Byte = 127
        var ba : Byte = 96 // 8 bits ou 1 byte
        b = 126

        var s : Short = 320
        var sa : Short; var sb : Short

        var idade = 50
        var n1 : Int?

        var l : Long = 9000000
        var la : Long

        // Constantes para obter a capacidade minima e maxima de um tipo de dados
        println(Byte.MIN_VALUE)
        println(Byte.MAX_VALUE)

        println(Short.MIN_VALUE)
        println(Short.MAX_VALUE)

        println(Int.MIN_VALUE)
        println(Int.MAX_VALUE)

        println(Long.MIN_VALUE)
        println(Long.MAX_VALUE)
    }

    private fun variaveisNumerosFracionarios() {
        // Variável para numeros fracionários
        // Float, Double
        var f = 1f
        var fa : Float?

        var d = 1.50E+308
        var da : Double?

        // Constantes para saber a capacidade minima e máxima de um tipo de dados
        println(Float.MIN_VALUE)
        println(Float.MAX_VALUE)

        println(Double.MIN_VALUE)
        println(Double.MAX_VALUE)
    }

    private fun variaveisCarateres() {
        // Variável para conter apenas um caracter
        var letra = 'E'
        var sexo = 0.toChar()
        var nomePorta : Char?

        // Constantes para obter a capacidade minima e máxima de um tipo de dados
        println(Char.MIN_VALUE)
        println(Char.MAX_VALUE)
    }

    private fun variaveisBoleanas() {
        // Variável para booleanos
        // Boolean
        var casado = true
        var x = false
        var y : Boolean = false
        var z : Boolean?
    }

    private fun constantes() {
        // Constantes
        val PI = 3.14
        val SEXO_MASCULINO = 'M'
        val SEXO_FEMININO = 'F'
    }

    private fun cadeiasCarateres() {
        var curso = "Aprenda Android do básico ao profissional"
        var texto : String = """
           Bem-vendo ao\n 
                curso de Kotlin da\n 
           Mmobile.pt
        """.trimIndent()
        var s : String?
    }
}