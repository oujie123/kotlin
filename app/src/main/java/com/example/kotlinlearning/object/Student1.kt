package com.example.kotlinlearning.`object`

/**
 * @Author:         Jack Ou
 * @CreateDate:     2020/8/3 0:42
 * @UpdateUser:     更新者
 * @UpdateDate:     2020/8/3 0:42
 * @UpdateRemark:   更新说明
 */
class Student1:Person1() {
    override fun getLayoutId(): Int = 999

    override fun initView() {}

    override fun callback(): Boolean = false
}