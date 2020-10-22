
/*
引数の指定は main(args:Array<String>)
使っていない変数があるとwarnningでnever used を出す
*/

/*
文字コードを出力する。
ひらがなの場合はUnicode
半角英数の場合はASCIIで出力

文字列をtoInt()すると変換できずにエラーになる。

 */
fun main(){
  
  println('Y'.toInt())
  println('A'.toInt())
  println('M'.toInt())
  println('A'.toInt())
  println('D'.toInt())
  println('A'.toInt())

}