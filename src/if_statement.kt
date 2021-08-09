import java.lang.NumberFormatException

fun main(args:Array<String>) {



   //var q:Quest?=null
    var q = Quest()
    // we can set the q to be of type question

    // to make it null we add a question mark at the end of it

    // but its going to trigger an error in the places we used q

    // hence we need to add a question mark at the end of those instances so as
    // to make the variable usable even when its null
    
    //if we make q equal to null, then it will return a null value, saying
    // that q is null already dont perform the operation.


    //if (q.Awnser!=null){}
    
    //q.Awnser=null

    q?.Awnser="Four"

    var message=
        //Kotlin doesnt come with a switch statement, it instead uses when.
        //WE can replace the if with when.
        //when statement is similar to switch
        if (q?.Awnser==q?.correctAwnser){
        "you were right"
    }else{
        "try again"
    }
//in kotlin an if statement can be a declared as a variable
    println(message)

    q?.print_result()
    //to extract an integer, we use:

    //it will succeed if we can parse the string value to an integer
    //it will throw exception if we cant

    val number:Int?= try{
        Integer.parseInt(q.Awnser)
    }catch (e:NumberFormatException){
        null
    }
    println(number)

}
class Quest {
    var Awnser:String?=null

    //if we add the question mark at the end of the type then the, then we are suggesting
    // that the variable could be null
    // hence we can initialize the answer to be null

    val correctAwnser="42"
    fun print_result (){

        when (Awnser) {
            correctAwnser -> println("you were right")
            else -> println("try again")
        }
    }

}