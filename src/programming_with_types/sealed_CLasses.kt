package programming_with_types

sealed class sealed_CLasses {
    /*
    Algebraic data class
    You can specify exactly the set of derived classes from an abstract class
    'ENums on steroids'
    Restricted type of derived classes
    you can use sealed classes instead of enum
     */
    class awake:sealed_CLasses()
    class asleep:sealed_CLasses()
    class eating(val food:String):sealed_CLasses()
}
fun handlePersonEvent(event:sealed_CLasses){
    when(event){
        is sealed_CLasses.awake-> println("Awake")
        is sealed_CLasses.asleep-> println("Asleep")
        is sealed_CLasses.eating-> println(event.food)
    }
}