package programming_with_types

open class Final_by_default {
    var firstName:String=""
    var lastName:String=""

    open fun getName() :String ="$firstName $lastName"
}
class student:Final_by_default(){
    //The compiler complains because the final by default class is final meaning,it cant be inherted from
    //we use the 'open' key word to allow student to derive from person
    //we also need to use the open key word on the function in order to override it.
    override fun getName():String{return ""}

}