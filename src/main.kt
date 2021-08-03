fun main (args: Array<String>){
    // it has a function, main and the variable args which isi an array of string.

    var q= Question()
    //to use the question class
    println("Hello, World")

    q.Awnser="42"

    println("You said the awnser is ${q.Awnser}")
   //This string template combines a compound variable.
}

class Question{
    //In kotlin, you can create a class inside the file you had the function
    // theres no need to create a new file
     var Awnser="string"

    fun display(){
        println("You said"+ Awnser)
        // in kotlin you can use the method below to print a variable

        println("you said $Awnser")
    }

}