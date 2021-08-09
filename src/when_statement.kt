import java.util.*
import javax.swing.tree.TreeNode

fun main(args:Array<String>) {

//do{} while(true)

//in kotlin, for loops, you have to write a range in values e.g.
    var myValues = 1..10
    for (i in 1..10) {
        println(i)
    }

    //we can also use a step function 
    for(x in 1..10 step 3){
        println(x)
    }

    //we can also go backward in the range using downTo
    for (y in 10 downTo 1){
        print(y)
    }

    //the range is inclusive/ close range
    //it includes both the opening and closing value
    //in kotlin we use until rather than less than
    for(i in 1 until 5){
        println(i)
    }

    //we can print lists using for loop

    var number= listOf(1,2,3,4,5)

    for (i in number){
        println(i)
    }

    //we can also use the for loops over maps
    var ages=TreeMap<String, Int>()
    ages["kevin"]=55
    ages["Sheila"]=22
    ages["faith"]=20
    ages["pam"]=20

    for ((name,age)in ages){
        println("$name is $age" )
    }

    //we can extract the index of a value in a collection, we can  use the for end loop to do this

    var y = listOf(1,2,3,4,5,6)
    for ((index,element) in y.withIndex()){
        println("$element at $index")
    }
// we can also do a range of letters

    var range= 'a'..'z'
    for(i in range step 2){
        println(i)
    }

}