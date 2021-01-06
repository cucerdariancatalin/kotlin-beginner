
// kotlinのラムダ式はいくつか種類がある

fun main() {

    println("--- fun (a:Int,b:Int):Int{return a+b} ---")
    var add = fun (a:Int,b:Int):Int{return a+b}
    println(add(1,2))

    println("--- {a:Int ,b:Int -> a+b} ---")
    add = {a:Int ,b:Int -> a+b}
    println(add(1,2))

    println("--- val multi:(Int,Int)->Int={a,b->a*b} ---")
    val multi:(Int,Int)->Int={a,b->a*b}
    println(multi(1,2))

}