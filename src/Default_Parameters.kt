//Kotlin supports default parameters
fun main(){
    log("my man",99)
    //We can set the parameter to be default
    //Even though there's a default value we can still override it.
}

//Java doesnt support default parameters ,
//instead well have to use @JvmOverloads in the kotlin code
// in order to successfully pass the function

@JvmOverloads

fun log(message:String,logLevel:Int=1){

println(message)
}
