fun main() {
    fun sumOfList(numbers: List<Int>): Int {
        var sum = 0
        for (number in numbers) {
            sum += number
        }
        return sum
    }

    val listOfNumbers = listOf(4, 3, 3, 1, 2)
    val sum = sumOfList(listOfNumbers)
    println("The sum of the list is: $sum")
}
