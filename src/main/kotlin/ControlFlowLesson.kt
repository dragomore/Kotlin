package org.example

class ControlFlowLesson(private val a: Int, private val b: Int, private val month: Int) {

    fun compareTwoValues(){
        if ( a > b ) {
            println("$a bigger than $b")
        }
        else{
            println("$b bigger than $a")
        }
    }

    fun getPlate(carType: String) {
        when( carType ){
            "car" -> println("58DK_58")
            "truck" -> println("TRUCK99")
            "trailer" -> println("SKN2VK")
            else -> println("No type matches")
        }
    }

    fun getMonth(){
        val description = when {
            month == 1 -> "January"
            month == 2 -> "February"
            month == 3 -> "March"
            month == 4 -> "April"
            month == 5 -> "May"
            else -> "I don`t know that month, try again"
        }
        println(description)
    }

    fun printRangeTask(){
        for( number in 1..3 ){
            print("$number ; ")
        }
    }

    fun fizzBuzzGame(){
        println()
        for( k in 1..100 ){
            when{
                k % 3 == 0 -> print("fizz")
                k % 5 == 0 -> print("buzz")
                k % 15 == 0 -> print("fizzbuzz")
                else -> print("$k")
            }
        }
    }

    fun certainWord(){
        val words = listOf("dinosaur", "limousine", "magazine", "language")
        for( word in words ){
            if( word.startsWith("l")){
                println(word)
            }
        }
    }
}