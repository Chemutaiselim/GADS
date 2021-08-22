/*
Infix functions is either a member function or an extension function
It has a single parameter
We mark this function with the infix key word
 */
fun main(args:Array<String>){
    val h1=Header("H1")
    val h2=Header("H2")

    val h3=h1.plus(h2)
    println(h3.Name)

}

class Header(var Name:String){

}

fun Header.plus(other:Header):Header{
    /*
    this is an extension function used to add two functions together
    and return a new header
     */
    return Header(this.Name+other.Name)
}