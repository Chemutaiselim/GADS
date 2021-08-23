/*
Infix functions is either a member function or an extension function
It has a single parameter
We mark this function with the infix key word
 */
fun main(args:Array<String>){
    val h1=Header("H1")
    val h2=Header("H2")

    val h3=h1.plus(h2)

    val h4=h1 plus2 h2
    /*
  we dont need to use dot and brackets after using the infix lable
   */

    //val h5=h1 + h2

    println(h3.Name)
    println(h4.Name)

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

infix fun Header.plus2(other:Header):Header{
    return Header(this.Name+other.Name)
}
 infix fun Header.plus3(other:Header):Header{

    return Header(this.Name+other.Name)
}