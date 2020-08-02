package com.example.kotlinlearning.`object`

/**
 * @Author:         Jack Ou
 * @CreateDate:     2020/8/3 1:29
 * @UpdateUser:     更新者
 * @UpdateDate:     2020/8/3 1:29
 * @UpdateRemark:   更新说明
 */
class Test {

    val i = "AAAA"

    //这个是嵌套类，拿不到外面类的i
    //嵌套类不会与外界交互。
    //嵌套类和嵌套方法目前来看没有什么实用价值
    class Sub {
        fun show(){
           // println(I)
        }
    }

    //inner 修饰一个内部类
    inner class Sub2 {
        fun show(){
            println(i)
        }
    }
}