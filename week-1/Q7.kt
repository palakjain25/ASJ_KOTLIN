//to find factorial of a given number
fun main() 
{
    val x: Int = 5
    var fact: Int = 1
    var y: Int = x
    
    while(y>0)
    {
        fact*=y;
        y=y-1;
    }    
    print("Factorial of $x = ")
    println(fact)    
}
