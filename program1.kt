fun main() 
{
    fun maximum(a: Int, b: Int): Int {
        return if (a > b) 
        {
            a
        }
        else 
        {
            b
        }
    }

    val number1 = 95
    val number2 = 73
    val largerNumber = maximum(number1, number2)
    println("The larger number is: $largerNumber")
}
