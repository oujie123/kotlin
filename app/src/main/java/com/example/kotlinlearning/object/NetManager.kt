package com.example.kotlinlearning.`object`

/**
 * @Author:         Jack Ou
 * @CreateDate:     2020/8/3 1:06
 * @UpdateUser:     更新者
 * @UpdateDate:     2020/8/3 1:06
 * @UpdateRemark:   单例
 */
//饿汉模式
class NetManager {

    //使用object只有一个实例
    object Holder {
        val instance = NetManager()
    }

    //kotlin中没有static关键字，使用派生操作替代 companion object关键字内的全是相当于java静态
    companion object {
        fun getInstance(): NetManager = Holder.instance
    }

    fun m() {
        println("测试单例")
    }
}