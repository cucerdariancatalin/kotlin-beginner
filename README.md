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

fun main(args:Array<String>){

    val name:String
    val number :Int = 2

    // 型宣言をしたvalは一度だけ代入できる。
    name = "お山"

    println(name+"が"+number+"つ")
}

```

