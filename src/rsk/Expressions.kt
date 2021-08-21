//we can also change the name of the class
//for example
@file: JvmName("BetterExperessions")
package rsk

//we can also use function expressions
//these are functions that can be reduced to a single line of code

fun main (){
  println(max(1, 2))
    //rsk.max is a function expression
}

fun max(a:Int,b:Int):Int=if (a<b)b else a