package com.example.kotlinlearning.`object`

/**
 * @Author:         Jack Ou
 * @CreateDate:     2020/8/3 0:40
 * @UpdateUser:     更新者
 * @UpdateDate:     2020/8/3 0:40
 * @UpdateRemark:   更新说明
 */
//abstract有open的特征
abstract class Person1 : Callback {
    abstract fun getLayoutId(): Int
    abstract fun initView() //返回空
}