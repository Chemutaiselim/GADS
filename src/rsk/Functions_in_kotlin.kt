//we can also add these functions to be part of a package /default package
package rsk

//function dont need to be declared in a class
//they can have default parameters
//named parameters
//they can extend existing types


//fun connect(addr: URI):Boolean{}
    //the function is introduced by fun
    //it has a name eg connect
    //we have parameters followed by the type of the parameter
    // and if the function has a return type, we specify the type of the return type
    //here the function has a return type Boolean
    //if the function doesnt have a return value then we simply leave off the return type
    //there is no void return type in kotlin

//the rsk.rsk.main function
fun main (args:Array<String>){
    //this function has no return value
    //it takes a parameter, in this case its called args
    //args is a string array

    display("Hello World")
}
fun display(message:String):Boolean {
    //this function return a value boolean
    // and also takes a parameter called message of type string
    println("Hello world")
    return true
}
