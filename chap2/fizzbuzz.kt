/*
  FizzBuzz 計算
*/
fun main(){

  var answer = listOf("Fizz","Buzz")

  for (number in 0 .. 100){

    if (number % 15 == 0){
      println("${number}:" + answer[0] + answer[1])
    }else{
      
      if(number % 3 == 0){
        println("${number}:" + answer[0])
      }else if(number % 5 == 0){
        println("${number}:" + answer[1])
      }

    }

  }
}
