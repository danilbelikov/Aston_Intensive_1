package com.example.aston_1

sealed class Shape {
    object None: Shape()
    data class Rectangle (val width: Float, val height: Float): Shape()
    data class Circle (val radius: Float): Shape()

}
