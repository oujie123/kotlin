package com.example.kotlinlearning.basegrammar

/**
 * @Author:         Jack Ou
 * @CreateDate:     2020/8/2 17:23
 * @UpdateUser:     更新者
 * @UpdateDate:     2020/8/2 17:23
 * @UpdateRemark:   更新说明
 */
fun main() {
    println(add1(1, 1))
    println(add2(1, 1))
    println(add3(1, 1))
    lenMethod("jack", "ou", "duan", "xiao", "yi")

    //lambda方法
    val addMethod: (Int, Int) -> Int = { num1, num2 -> num1 + num2 }
    println(addMethod(10, 10))

    // $符号的使用
    var name = "Jack Ou"
    var age = 18
    var sexy = 'M'
    println("name:$name,age:$age,sexy:$sexy")

    //自动换行功能
    var infoMessage = """
        aaaaaaaaaaaaa
        bbbbbbbbbbbbbbb
        cccccccccc
        dddddddd
    """.trimIndent()  //有.trimIndent()没有空格
    println(infoMessage)

    //自动取消特定字符打印 “自动识别一个”
    var infoMessage2 = """
        |aaaaaaaaaaaa
        |aaaaaaaaab
        |bbbbbbbbbb
        |ccccccc
    """.trimMargin()
    println(infoMessage2)

    var infoMessage3 = """
        ||aaaaaaaaaaaa
        |aaaaaaaaab
        |bbbbbbbbbb
        |||ccccccc
    """.trimMargin()
    println(infoMessage3)

    println()
    //打印 $符号  打印符号
    var infoMessage4 = """
        ${'$'}9999.99
    """.trimIndent()
    println(infoMessage4)
}

//返回类型Int
fun add1(num1: Int, num2: Int): Int {
    return num1 + num2
}

//返回值类型推导为Int
fun add2(num1: Int, num2: Int) = num1 + num2

//返回值类型推导为String
fun add3(num1: Int, num2: Int) = "num:" + num1 + ",num2:" + num2

//可变参数
fun lenMethod(vararg names: String) {
    for (name in names) {
        println(name)
    }
}