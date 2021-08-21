//Kotlin Supports naming of our parameters
fun main(){
    named_parameters(message = "Hello,World",secondPar = 88)
    named_parameters(secondPar = 77,message ="Hello, World")

    //we cant mix named parameters and unnamed parameters
    //Benefits, we can change the positions of the parameters and
    // also keep track of which parameters we are using
    //we can also use default parameters here.
}
fun named_parameters(message:String,secondPar:Int=99){
    println(message + secondPar)
}
