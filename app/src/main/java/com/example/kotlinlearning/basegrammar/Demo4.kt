package com.example.kotlinlearning.basegrammar

/**
 * @Author:         Jack Ou
 * @CreateDate:     2020/8/2 21:16
 * @UpdateUser:     更新者
 * @UpdateDate:     2020/8/2 21:16
 * @UpdateRemark:   区间
 */
fun main() {

    // in 修饰区间
    for (i: Int in 1..10) {
        //println(i)
    }

    //这种情况不会运行
    for (i: Int in 10..1) {
        //println(i)
    }

    // 从大到小
    for (i: Int in 10 downTo 1) {
        //println(i)
    }

    //用作判断
    val value = 80
    if (value in 1..100) {
        //println("在区间内！")
    }

    // 步长判断
    for (i: Int in 1..20 step 2) {
        //println(i)
    }

    // 排除until
    for (i: Int in 1 until 10) {
        println(i)
    }
}