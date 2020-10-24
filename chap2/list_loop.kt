/*
  listOfでリストを作成すると
  変更不可のリストになる。
  (varで宣言しても変更不可のリストになる。) 

  point としては変更不可と変更可能なリストを作成するときは
  listofとmutablelistを使い分ける。

 */
fun main(){

  var mutable_number_ary = mutableListOf(1,2,3,4)
  var number_ary = listOf(1,2,3,4)

  for(number in number_ary){
    println(number)
  }

  mutable_number_ary[0] = 0
  println("変更可能なリストの出力")
 
  for(number in mutable_number_ary){
    println(number)
  }

}
