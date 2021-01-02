
/*
  年始一発目のプログラム
  コラッツの問題を実現する
    コラッツの問題 / コラッツの予想とは

    偶数のときは2で割り、奇数の時は3倍して+1するという動作を繰り返すと
    いずれ、1に収束するという数学の問題

*/


fun main(){

  var n :Int = 2021
  var tmp:Int
  var cnt :Int =0
  var num :Int

  num = n

  while(n > 1){
    cnt++
    if (n % 2 == 0){
      tmp = n
      n = n /2
      println("%-4d: %-4d / %-5d = ${n}".format(cnt,tmp,2))
    }else{
      tmp = n
      n = 3*n + 1
      println("%-4d: %-4d * %-1d + 1 = ${n}".format(cnt,tmp,3))
    }
  }

  // わかりやすいように演算結果を出力に出す
  println("${num}は${cnt}回の計算で1に収束する。")
}