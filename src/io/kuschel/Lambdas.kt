package io.kuschel

object Lambdas {

    data class Person(val name: String, val age: Int)

    private val list: List<Person> = listOf(Person("anton", 8), Person("rasmus", 43))

    val isAdult = { p: Person -> p.age >= 18 }

    private val adults: List<Person> = list.filter(isAdult)
    private val names: List<String> = list.map { it.name }

    val onlyChildren = list.none(isAdult)
}
