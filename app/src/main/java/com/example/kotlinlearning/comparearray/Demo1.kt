package com.example.kotlinlearning.comparearray

/**
 * @Author:         Jack Ou
 * @CreateDate:     2020/8/2 21:31
 * @UpdateUser:     更新者
 * @UpdateDate:     2020/8/2 21:31
 * @UpdateRemark:   更新说明
 */
fun main(){
    val name1: String = "jackou"
    val name2 : String = "jackou"

    // ==比较对象值本身
    //println(name1.equals(name2)) //不推荐这么干
    println(name1 == name2)  //==最后会调用equals比较

    // ===比较对象地址
    val num1:Int? = 10000
    val num2:Int? = 10000
    println(num1 === num2)
}