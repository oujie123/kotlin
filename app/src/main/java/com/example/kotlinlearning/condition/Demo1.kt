package com.example.kotlinlearning.condition

/**
 * @Author:         Jack Ou
 * @CreateDate:     2020/8/2 22:02
 * @UpdateUser:     更新者
 * @UpdateDate:     2020/8/2 22:02
 * @UpdateRemark:   条件与控制
 */
fun main() {

    val num1 = 100
    val num2 = 199

    // if待返回值的，可以自动推导返回类型
    val max = if (num1 > num2) num1 else num2
    //println(max)

    // 可以执行一些操作
    val maxNum = if (num1 > num2) {
        println("num1是最大的")
        num1
    } else {
        println("num2是最大的")
        num2
    }
    println(maxNum)

    //多个区间判断
    val x = 102
    val y = 80
    if (x in 1..101 && y in 1..99) {
        println("在区间内")
    } else {
        println("不在区间内")
    }

    // when相当于switch
//    val number = 60
//    when(number){
//        1 -> println("1")
//        2 -> println("2")
//        3 -> println("3")
//        4 -> println("4")
//        5 -> println("5")
//        else -> println("其他")
//    }

    //区间判断
    val number = 201
    when (number) {
        in 100..200 -> println("100 - 200")
        in 200..400 -> println("200 - 400")
        else -> println("其他")
    }

    val num = 8
    var i = 10
    var j = 10
    val result = when(num){
        1,10,8 -> {
            println("此处可以做很多逻辑")
            println(i + j)
            "星期一"
        }
        2 -> {
            println("此处可以做很多逻辑")
            "星期二"
        }
        3 -> {
            println("此处可以做很多逻辑")
            "星期三"
        }
        else -> "其他"
    }
    println(result)

}