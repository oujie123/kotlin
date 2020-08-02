package com.example.kotlinlearning.loop

/**
 * @Author:         Jack Ou
 * @CreateDate:     2020/8/2 22:29
 * @UpdateUser:     更新者
 * @UpdateDate:     2020/8/2 22:29
 * @UpdateRemark:   循环&标签
 */
fun main () {

    //标签
    ou@for (i in 1..10){
        for (j in 1..10){
            println("i:$i,j:$j")
            if (i == 5){
                break@ou
            }
        }
    }

    // 循环
    var items = listOf("张三","李四","王五")
    for (item in items) {
        println(item)
    }

    items.forEach {
        println(it)
    }

    //打印下表
    for (index in items.indices) {
        println("index:$index = ${items[index]}")
    }
}

class Jack{
    val i = "ou"

    fun show() {
        println(i)
        println(this.i)
        println(this@Jack.i)
    }
}