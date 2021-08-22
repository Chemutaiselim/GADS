//Gn
//Extension functions are used when we want to
// add new functions on classes that already exists
//Functions that we add are static functions and
// they dont have access to the internals of the class we are adding it to
//Kotlin automatically generates static functions for us.
//it helps cut down the use of utility classes
//it also helps the code to be easier to read

fun main(){
    val text="With    multiple    \twhitespace"
    println(text)
    println(replaceMultipleWhiteSpace(text))
    println(text.replaceMultipleWhiteSpaceEx())
}

fun replaceMultipleWhiteSpace(value:String):String{
    //this is a utility function
    //this function is used to replace multiple whiteSpaces with a single whitespace
    var regex =Regex("\\s+")
    return regex.replace(value," ")
}

fun String.replaceMultipleWhiteSpaceEx():String{
    //in Kotlin this is an Extension function
    //We dont need parameters here
    var regex =Regex("\\s+")
    return regex.replace(this," ")
    //We use a receiver
    //That's the value in which this is being called
    //the receiver is this
    //This becomes equal to the input text that we were to print initially
}

