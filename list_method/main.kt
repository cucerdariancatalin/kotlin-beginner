
// リストのメソッドをいくつか試す


fun main() {
    
    var number_list = mutableListOf(5,4,3,2,1)

    // 合計値は専用のメソッドが存在する
    println("--- リストの合計値を表示する ---")
    println(number_list.sum())

    //要素を渡すとその要素を削除する
    println("--- リストから4を削除して合計値を表示する ---")
    println(number_list)
    number_list.remove(4)
    println(number_list)
    println(number_list.sum())

    // 指定した要素をリストに加える
    println("--- リストに要素を加える ---")
    println(number_list)
    number_list.add(4)
    println(number_list)

    // リストをそのままコピーするとメモリアドレスを共有する
    var number_list_tmp = number_list

    println("--- リストに要素を追加して表示 ---")
    number_list_tmp.add(6)
    println(number_list)
    println(number_list_tmp)

    number_list.remove(4)
    println("--- 片方のリストから要素を削除して再表示 ---")
    println(number_list)
    println(number_list_tmp)    

}