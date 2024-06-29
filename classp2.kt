abstract class Shape {
    abstract fun area(): Double
}
class Rectangle( val w: Double ,  val h: Double) : Shape() {
    
    override fun area(): Double {
        return w * h
    }
   
    fun perimeter(): Double {
        return 2 * (w + h)
    }
}
class Circle( val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
    
    fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

fun main() {
    val shape1: Shape = Rectangle(4.0, 2.0)
    val shape2: Shape = Circle(2.0)
    println("Area of Rectangle: ${shape1.area()}")
    if (shape1 is Rectangle) {
        println("Perimeter of Rectangle: ${shape1.perimeter()}")
    }
    
    println("Area of Circle: ${shape2.area()}")
    if (shape2 is Circle) {
        println("Perimeter of Circle: ${shape2.perimeter()}")
    }
}
