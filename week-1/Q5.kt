//to check if a given triangle is equilateral,isosceles or scalene
fun main()
{
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()
    val z = readLine()!!.toInt()

    if (x==y && x==z)
        println("Equilateral Triangle")
    else if (x==y || x==z || y==z)
        println("Isosceles Triangle")
    else
        println("Scalene Triangle")
}
