//to calculate and print the sum of all even numbers till a given number
fun main() 
{
    val x: Int = 11
    var sum: Int = 0
    for(i in 0..x step 2)
    {        
        sum=sum+i
    }    
    println("Sum of all even numbers till $x = $sum")       
}
