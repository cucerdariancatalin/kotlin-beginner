
// フィボナッチ数列を実現する

fun main(){

  var f0:Int = 0
  var f1:Int = 1
  var f2 :Int = 0

  while (f1 < 15){

    println(f1)
    f2 = f1 + f0
    f0 = f1
    f1 = f2
  }

}