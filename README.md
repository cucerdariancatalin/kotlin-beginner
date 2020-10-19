# 注意点

VisualStudioCodeで文字化けするときは  
Run In Termnal にチェックを入れてターミナルで実行できるように  
設定を変更すること  
[参考にさせていただいたサイト](https://ymdevx3.hatenablog.com/entry/2019/08/26/012020)

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

本当にアクティビティ管理から逃げようと思ったらFlutterに逃げるしかない！！  

# はじめの一歩

## 準備
用意するモノは単純
Javaのランタイム環境とkotlin本体

- Kotlin version 1.4.10-release-411 (JRE 15+36-1562)
- openjdk version "15" 2020-09-15

> OpenJDK Runtime Environment (build 15+36-1562)  
> OpenJDK 64-Bit Server VM (build 15+36-1562, mixed mode, sharing)



