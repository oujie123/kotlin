package com.example.kotlinlearning.`object`

/**
 * @Author:         Jack Ou
 * @CreateDate:     2020/8/3 0:31
 * @UpdateUser:     更新者
 * @UpdateDate:     2020/8/3 0:31
 * @UpdateRemark:   更新说明
 */
class Student(id: Int) : Person(id) {

    //在kotlin中所有对象都没有默认值，不赋值会报错
    //lateinit懒加载，可以定义时不赋值,懒加载没有赋值就不能使用，否者报错
    lateinit var name: String
    var age: Int = 0
}