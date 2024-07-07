interface Drawable {
    fun drawInfo()
}
class Square( val side: Double) : Drawable {
    
    override fun drawInfo() {
        println("Square with side $side")
    }
}


class Triangle(val base: Double, val height: Double) : Drawable {
    
    override fun drawInfo() {
        println("Triangle with base $base and height $height")
    }
}

fun main() {
    val square = Square(3.0)
    val triangle = Triangle(3.0, 2.0)
    
    square.drawInfo()
    triangle.drawInfo()
}
