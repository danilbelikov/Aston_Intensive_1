package com.example.aston_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlin.math.PI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shape = Shape.None

        val moscow = City("Moscow").apply {
            this.population = 15000000
        }

        val newString = "Just an example".run {
            lengthOfString(this)
        }

        val anotherString = with("Another beautiful string") {
            this.length
        }
        Toast.makeText(this,"${areaOf(shape)}" +
                "${lengthOfString("Test String")}" +
                "${justReturnInt(124)} " +
                " ${moscow.population} " +
                " $newString " +
                "$anotherString", Toast.LENGTH_LONG).show()
    }
    private fun areaOf(shape: Shape): Number = when (shape) {
        is Shape.None -> 0
        is Shape.Circle -> shape.radius.pow(2) * PI
        is Shape.Rectangle -> shape.height * shape.width
    }
    private fun justReturnInt(int: Int): Int{
        int.also {
            return it
        }
    }
    private fun lengthOfString(string: String): Int {
        string.let {
            return it.length
        }
    }
}