//to check if a given number is an armstrong number or not
fun main() 
{
    val x: Int = 153
    var sum: Int = 0
    var temp: Int = x
    var remainder: Int
    while(temp!=0)
    {        
        remainder=temp%10;
        sum=sum+(remainder*remainder*remainder);
        temp=temp/10
    }      
    if(sum==x)
    println("$x is an armstrong number")
    else
    println("$x is not an armstrong number") 
}
