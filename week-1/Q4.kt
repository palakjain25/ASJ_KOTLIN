//to check if a number is divisible by 5 or 11
fun main() 
{
    val x: Int = 61
    Check(x)
}

fun Check(y: Int): Unit
{
    if(y%5==0)
    {
        if(y%11==0)
        println("Number is divisible by both 5 & 11")
        else
        println("Number is divisible by 5 only")
    }
    else if(y%11==0)
    println("Number is divisible by 11 only")
    
    else
    println("Number is not divisible by 5 or 11")   
}
