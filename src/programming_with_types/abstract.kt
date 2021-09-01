package programming_with_types

abstract class abstract {
    var firstName:String=""
    var secondName:String=""
    abstract fun getAdress():String
    open fun getName():String="$firstName $secondName"
}
class secondClass:abstract(){
    override fun getAdress(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return ""
    }

    override fun getName():String {
        return ""}
}