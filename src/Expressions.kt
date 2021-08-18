//we can also use fuction expressions
//these are functions that can be reduced to a single line of code

fun main (args:Array<String>){
  println(  max(1,2) )
    //max is a function expression
}

fun max(a:Int,b:Int):Int=if (a<b)b else a