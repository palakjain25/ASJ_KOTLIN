//to check if a given n digit number is an armstrong number or not
import kotlin.math.pow
fun main()
{
    val x = 8208
    var temp: Int
    var p = 0
    var remainder: Int
    var sum = 0    
    temp = x
    while (temp != 0)
    {
        temp /= 10
        ++p
    }
    temp = x
    while (temp != 0)
    {
        remainder = temp % 10
        sum += Math.pow(remainder.toDouble(), p.toDouble()).toInt()
        temp /= 10
    }
    if (sum == x)
        println("$x is an Armstrong number.")
    else
        println("$x is not an Armstrong number.")
}
