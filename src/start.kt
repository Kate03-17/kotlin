import kotlin.math.max

fun main() {

    val rav4: CarFactory = CarFactory()
    rav4.name = "toyota"
    rav4.color = "red"
    rav4.withTurbo = false
    rav4.year = 2004
    rav4.maxSpeed = 180
    rav4.coloring("red")
    rav4.printCarInfo()


    var rav1 = rav4

    val BMW = CarFactory()
    BMW.name = "BMW"
    BMW.color = "black"
    BMW.year = 2003
    BMW.maxSpeed = 210
    BMW.withTurbo = true



    val f1 = Fraction()
    f1.numerator = 4f
    f1.denominator = 16f

    val f2 = Fraction()
    f2.numerator = 2f
    f2.denominator = 5f

    f1.simplifying()
    println(f1)
    





}
class CarFactory {
    var name: String = ""
    var maxSpeed: Int = 0
    var year: Int = 0
    var withTurbo = false
    var color: String = ""
    fun printCarInfo() {
        println("$name - $year - $color")

    }
    fun coloring(color: String){
        if (color == this.color){
            println("same color")

        } else {
            println("coloring....")
            this.color = color
        }

    }

}
class Fraction {
    var numerator: Float = 0f
    var denominator: Float = 1f


    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator / denominator == other.numerator)
                return true
        }
        return false

    }

    override fun toString(): String {
        return "${numerator}/${denominator}"
    }

    fun simplifying(): Float {
        fun maxD(): Float {
            val m = max(numerator, denominator)
            var maxD = 1
            for (i in m.toInt() downTo 0) {
                if (numerator.toInt() % i == 0 && denominator.toInt() % i == 0) {
                    maxD = i
                    break
                }
            }
            return maxD.toFloat()
        }
        val max = maxD()

        numerator = numerator / max
        denominator = denominator / max
        return numerator; denominator


    }
    fun multiplication(other: Fraction): Fraction {
        val y = denominator * other.denominator
        val x = numerator * other.numerator
        val f3 = Fraction()
        f3.numerator = x
        f3.denominator = y
        return f3

    }
    fun division(other: Fraction): Fraction {
        val x = numerator * other.denominator
        val y = denominator * other.numerator
        val f3 = Fraction()
        f3.numerator = x
        f3.denominator = y
        return  f3
    }

    fun addition(other: Fraction): Fraction {
        val y = denominator * other.denominator
        val x = (numerator * other.denominator) + (other.numerator * denominator)
        val f3 = Fraction()
        f3.numerator = x
        f3.denominator = y
        return f3
    }

    fun substraction(other: Fraction): Fraction {
        val y = denominator * other.denominator
        val x = (numerator * other.denominator) - (other.numerator * denominator)
        val f3 = Fraction()
        f3.numerator = x
        f3.denominator = y
        return f3
    }




}