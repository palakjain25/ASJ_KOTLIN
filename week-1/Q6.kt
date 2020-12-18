//to check whether a characteer is alphabet or not
fun main() 
{
    val x: Char = 'a'        
    if((x in 'a'..'z') || (x in 'A'..'Z'))
    println("$x is an alphabet")     
    else
    println("$x is not an alphabet")  
}
