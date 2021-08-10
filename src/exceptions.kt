import java.io.FileReader
import java.io.IOException

fun main(args:Array<String>){
    //kotlin simplifies the use of exceptions
    var reader=FileReader("filename")

    //the read method throws an IO exception
    try {
        reader.read()
    }catch (e:IOException){

    }finally {
        //inside here we can do the final work to handle the reader or cleanup behind us
        // once weve fifnished using the reader
    }


    //kotlin uses unchecked exceptions
    //we dont need to specify that any class throws an exception,
    //and we dont have to catch exceptions in kotlin

}