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

    println("Lesson 2: Collections")
    val collectionsLesson = CollectionsLesson()

    println("Lists:")
    println("Computer accessories is: ${collectionsLesson.computerAccessories}")
    println("Computer hardware is: ${collectionsLesson.computerHardware}")
    val hardwares = arrayOf("processor", "power supply", "motherboard", "RAM", "SSD")
    for ( hardware in hardwares ){
        collectionsLesson.computerHardware.add( hardware )
    }
    // new collection after modify
    println("Computer hardware is: ${collectionsLesson.computerHardware}")

    println("Sets:")
    println("Visited cities is: ${collectionsLesson.visitedCities}")
    println("Visited countries is: ${collectionsLesson.visitedCountries}")
    val newCountries = arrayOf("Germany", "Great Britain", "Austria", "Austria")
    newCountries.forEach { country -> collectionsLesson.visitedCountries.add( country ) }
    // new set after modify
    println("Visited countries is: ${collectionsLesson.visitedCountries}")

    println("Maps:")
    println("Prices:")
    val monitorKeys = collectionsLesson.monitorPrice.keys
    for( monitor in monitorKeys ){
        println( "$monitor price is ${collectionsLesson.monitorPrice[monitor]}$" )
    }
    val monitorFreqKeys = collectionsLesson.monitorFreq.keys
    println("Frequencies:")
    collectionsLesson.monitorFreq["LG"] = 75
    collectionsLesson.monitorFreq["MSI"] = 165
    collectionsLesson.monitorFreq["DELL"] = 90
    // new map after modify
    for( monitor in monitorFreqKeys ){
        println( "$monitor has ${collectionsLesson.monitorFreq[monitor]}hz" )
    }
    println("----------")

    println("Lesson 3: Control Flow")

    val controlFlowLesson = ControlFlowLesson(5,3,3)

    controlFlowLesson.compareTwoValues()
    controlFlowLesson.getPlate("truck")
    controlFlowLesson.getPlate("myType")
    controlFlowLesson.getMonth()
    controlFlowLesson.printRangeTask()
    controlFlowLesson.fizzBuzzGame()
    controlFlowLesson.certainWord()
}