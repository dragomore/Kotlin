package org.example

class BasicTypes {
    var color: String = "red"
    var furnitureType: String = "table"
    var width: Int = 140
    var height: Int = 80
    var price: Float = 4354.88F
    var inStock: Boolean = true

    fun printInfo(){
        println("Furniture is: $furnitureType. Color: $color. Width: $width. Height: $height. Price: $price UAH. In stock: $inStock")
    }
}