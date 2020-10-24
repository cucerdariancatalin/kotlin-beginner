# 気になったgitのエラー

> contains emphasized items

# 注意点

VisualStudioCodeで文字化けするときは  
Run In Termnal にチェックを入れてターミナルで実行できるように  
設定を変更すること  
[参考にさせていただいたサイト](https://ymdevx3.hatenablog.com/entry/2019/08/26/012020)

.gitignore は UTF-8で保存すること。
> ! hello.kt とするとhello.ktを管理対象とする。  
> アスタリスクで該当するファイル全てを管理対象からはずす。

# はじめに

## ざっくりと

kotlinって何ですかと聞かれたときに答えるひとこと  

「JetBrains社の人が開発したJVM上*で動く静的型付けのオブジェクト指向プログラミング言語」    
※JVM : Java Virtual Machine の略  
Javaを基に開発されJavaよりも安全に利用でき、そして速い。  

## kotlin
kotlin、チュンチュン!!
読み方は「コトリン」

## Androidとの関係

Googleが公式に開発言語として認定  
現在、2020年における開発言語はkotlinが主流とのこと
また、Android Studioがサポートしている。

kotlinはJavaよりも優秀と言われていますが  
結局のところ、Androidという同じ土俵で戦うことになるので  
Android特有のアクティビティサイクルの管理から逃げることができない。  

本当にアクティビティ管理から逃げようと思ったらFlutterにやるしかない！！  

# はじめの一歩

## 準備

用意するモノは単純
Javaのランタイム環境とkotlin本体

- Kotlin version 1.4.10-release-411 (JRE 15+36-1562)
- openjdk version "15" 2020-09-15

> OpenJDK Runtime Environment (build 15+36-1562)  
> OpenJDK 64-Bit Server VM (build 15+36-1562, mixed mode, sharing)

## 関数の書き方

関数は「fun」から書き始める。  
これは「function」という英語から由来しているモノ  

他の言語の書き方を見ても一目瞭然ですが  
kotlinの関数宣言はとてもシンプル

``` kotlin

// chap1/hello.kt
fun main(){
  println("はじめてのKotlin ,(ﾟ∀ﾟ)ｷﾀｺﾚ!!")
}

```

## 変数宣言

変更不可と変更可に分かれる。  
変化する数値(変数)と定まった数値(定数)が存在する。  

変数宣言時は「var」を  
定数宣言時は「val」を使う。  
※つづりが似ているので注意  

``` kotlin

fun main(args:Array<String>){

  val name= "お山"
  val number = 2

  println(name+"が"+number+"つ")

}
```

## 型の宣言

変数名の横にコロンを書いてデータ型を記載  
代入まで行う場合は代入演算を続けて書く  

``` kotlin

// chap2/moutain2.kt

fun main(args:Array<String>){

  val name:String
  val number :Int = 2

  // 型宣言をしたvalは一度だけ代入できる。
  name = "お山"

  println(name+"が"+number+"つ")

}

```

## 文字列に変数を組み込む

この機能にはなんか名前があった希ガス

``` kotlin

// chap2/mt_fuji.kt

fun main(){
  val mt_name= "富士山"
  val number=1
  println("${mt_name}が${number}")
}

```

JavaScriptと書き方はほぼ同じに見える。  
ただ、あっちは確かバッククウォートだったか  

## ループと条件分岐

``` kotlin

// chap2/number_loop.kt

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

```

条件式の書き方はC言語やJavaにそっくり  
演算子もそのまま使える。  
number_loop.kt はほぼ感覚で書けました。  

## 集合体

リストデータってやつ
imutable list
mutable list

  listOfでリストを作成すると  
  変更不可のリストになる。  
  (varで宣言しても変更不可のリストになる。)   

  point としては変更不可と変更可能なリストを作成するときは  
  listofとmutablelistを使い分ける。  

``` kotlin
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

```


## いろいろな反復構文

## クラス

## インターフェイス
