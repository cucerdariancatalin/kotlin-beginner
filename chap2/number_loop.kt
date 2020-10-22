
fun main(){
  
  var number :Int = 1

  println("1～9までを表示")
  while(number < 10){
    println(number)
    number++
  }

  number = 1

  println("1～9までの偶数を表示")

  while(number < 10){
    if (number % 2 == 0){
      println(number)
    }
    number++
  }


}
