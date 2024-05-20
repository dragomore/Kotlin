package org.example

fun main() {
    println("Lesson 1: BasicTypes")
    val basicTypes = BasicTypes()
    basicTypes.printInfo()

    basicTypes.furnitureType = "shelf"
    basicTypes.color = "gray"
    basicTypes.width = 40
    basicTypes.height = 245
    basicTypes.price = 2354F
    basicTypes.inStock = false

    basicTypes.printInfo()

    println("----------")
}