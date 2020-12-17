//to find maximum between three numbers

fun main() 
{    
  val a: Int = 5
  val b: Int = 9
  val c: Int = 3  
  var x: Int     
  x=if(a>b) a else b
  x=if(x>c) x else c
  println("MAX = $x")    
}
