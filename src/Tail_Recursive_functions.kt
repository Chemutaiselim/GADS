import java.math.BigInteger

/*
recursive function call each other
The function can call itself so many times it blows up,
to prevent this, we use tail recursive functions
they have to be the correct form
 */

fun main(args:Array<String>){
    println(fib(10, BigInteger("1"), BigInteger("0")))
}

fun fib(n:Int,a:BigInteger,b:BigInteger):BigInteger{
    return if (n==0)b else fib(n -1,a+b, a)
}
/*
function will add the last two integers to get the next value i.e.
1,1,2,3,5,8.13
the function is recursive
 */