package com.example.kotlinlearning.`object`

/**
 * @Author:         Jack Ou
 * @CreateDate:     2020/8/3 0:23
 * @UpdateUser:     更新者
 * @UpdateDate:     2020/8/3 0:23
 * @UpdateRemark:   更新说明
 */
//()为主构造函数   增加open就可以被继承了
open class Person(id: Int) {

    //次构造
    constructor(id: Int, name: String) : this(id) {

    }

    //次构造
    constructor(id: Int, name: String, sex: Char) : this(id, name) {

    }

    //次构造
    constructor() : this(123){

    }
}