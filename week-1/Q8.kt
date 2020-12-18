//to calculate and print the sum of factorials of a given number
fun main() 
{
    val x: Int = 4
    var fact: Int
    var sum: Int = 0
    for(i in x downTo 1)
    {
        fact=1
        for(j in i downTo 1)
        {
            fact*=j
        }
        sum=sum+fact
    }    
    println("Sum of Factorials of $x = $sum")     
}
