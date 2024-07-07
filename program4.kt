fun main() {
    fun fact(n: Int): Int {
        return if (n <= 1) {
            1
        } else {
            n * fact(n - 1)
        }
    }

    val num = 5
    val res = fact(num)
    println("The factorial of $num is: $res")
}
