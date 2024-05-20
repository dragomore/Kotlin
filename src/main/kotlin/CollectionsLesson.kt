package org.example

class CollectionsLesson {
    /*
        Lists - ordered collections of items
        Sets - unique unordered collections of items
        Maps - Sets of key-value pairs where keys are unique

        Collections are:
        - read-only
        - mutable = can be modified
     */

    val computerAccessories = listOf("monitor", "keyboard", "mouse", "headphones", "pc")
    var computerHardware: MutableList<String> = mutableListOf("video card")

    val visitedCities = setOf("Vena", "Hamburg", "London", "Vena", "Vena", "Melbourne")
    var visitedCountries: MutableSet<String> = mutableSetOf("Austria")

    val monitorPrice = mapOf("Samsung" to 123, "LG" to 100, "MSI" to 89, "DELL" to 55)
    var monitorFreq: MutableMap<String, Int> = mutableMapOf("Samsung" to 60)
}