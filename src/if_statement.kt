fun main(args:Array<String>) {
   var q=Quest()
    q.Awnser="42"
    var message=if (q.Awnser==q.correctAwnser){
        "you were right"
    }else{
        "try again"
    }
//in kotlin an if statement can be a declared as a variable
    println(message)
}
class Quest {
    var Awnser=""
    val correctAwnser="42"
    fun display (){
        println("hello $correctAwnser")
    }

}