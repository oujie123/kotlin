package com.example.kotlinlearning.basegrammar

/**
 * @Author:         Jack Ou
 * @CreateDate:     2020/8/2 16:57
 * @UpdateUser:     更新者
 * @UpdateDate:     2020/8/2 16:57
 * @UpdateRemark:   更新说明
 */

fun main(){

    //var 变量  有get set方法
    var name : String = "Jack Ou"
    name = "duanxiaoyi"
    System.out.println(name)

    //val 不可以修改 只有get方法
    val age : Int = 100
    System.out.println(age)

    //可以类型推到
    //String 类型
    var info1 = "abcd"
    //Char 类型 不引用推导有问题
    var info2 : Char = 'a'
    System.out.println(info2)
    //Int类型
    var info3 = 123
    System.out.println(info3)

}

class Test{
    var name : String = "111"
    val name2 : String = "222"
}