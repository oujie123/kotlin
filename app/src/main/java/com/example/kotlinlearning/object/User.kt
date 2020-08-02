package com.example.kotlinlearning.`object`

/**
 * @Author:         Jack Ou
 * @CreateDate:     2020/8/3 0:47
 * @UpdateUser:     更新者
 * @UpdateDate:     2020/8/3 0:47
 * @UpdateRemark:   数据类  相当于java的实体bean
 */
// 使用data关键字生产bean
//自动生产get set equals hashcode copy等方法
data class User(val id: Int, val name: String, val sex: Char)