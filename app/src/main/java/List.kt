package com.example.homework_01

data class Person (val name: String, val surname: String, val age: Int)

fun List<Person>.sortAge() = sortedBy{it.age}

fun List<Person>.sortName() = sortedBy{it.surname}.sortedBy{it.name}

fun <T> timeExecution(action: () -> T): Long {
    val start = System.currentTimeMillis()
    action()
    return System.currentTimeMillis() - start
}

fun main () {
    var  numberList = List(100) { it }
        .filter { it % 2 == 0 } // 0, 2, 4, 6, 8, 10 ...
        .slice(10..20) // 20, 22 ... 38, 40
        .map { it + 1 } // 21, 23 ... 39, 41
        .fold (0) {accumulator, value -> accumulator + value} // 341
    println(numberList)

    val PersonList = listOf<Person>(
        Person("Andrei","Sidorov",25),
        Person ("Ivan","Ivanov",20),
        Person("Petr","Petrov",30),
        Person("Petr","Ivanov",15),
        Person("Seva","Ionov",40))

    println (PersonList)
    println (PersonList.sortAge())
    println (PersonList.sortName())
    println(timeExecution { PersonList.sortAge() })
    println(timeExecution { PersonList.sortName() })

    }







