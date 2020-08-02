package com.example.kotlinlearning.basegrammar

/**
 * @Author:         Jack Ou
 * @CreateDate:     2020/8/2 18:49
 * @UpdateUser:     更新者
 * @UpdateDate:     2020/8/2 18:49
 * @UpdateRemark:   更新说明
 */
fun main() {
    // ? 可以置null  对象可能为null，使用需要注意
    var info : String? = null

    //如果？前面的变量为空，就不执行后面的.length
    println(info?.length)

    //判断info?.length 如果还未null执行：后面的操作
    println(info?.length ?:"真的不得了")

    // ！！代表我自己保证不为空，可能引发空指针异常   强制执行
    //println(info!!.length)

    //判断
    if (info != null) println(info.length) //和java一样了

    println(method("jk"))
    println(method("11"))
    println(method(null))
}

//允许函数返回null
fun method(name : String?) :Int?{
    if (name == "jk")
        return 123
    return null
}