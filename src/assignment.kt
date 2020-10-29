import kotlin.math.max

fun main() {
    val f1: Point = Point()
    f1.x = 1f
    f1.y = 7f
    println(f1.symethry())

}
class Point {
    var x = 0f
    var y = 0f

    override fun toString(): String {
        return "x = ${x}, y = ${y}"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if (x == other.x && y == other.y ) {
                return true
            }
        }
        return false

    }
    fun symethry() {
        y = -y
        return println("symethrical towards y axis is (${x},${y})")

    }

    }






