package com.example.kotlinlearning.`object`

/**
 * @Author:         Jack Ou
 * @CreateDate:     2020/8/3 1:13
 * @UpdateUser:     更新者
 * @UpdateDate:     2020/8/3 1:13
 * @UpdateRemark:   更新说明
 */
//懒汉模式
class NetManager2 {

    companion object {
        private var instance: NetManager2? = null

        fun getInstance(): NetManager2?{
            if (instance == null) {
                instance = NetManager2()
            }
            //使用！！告诉编译器我来负责保证不为空
            //return instance!!
            //如果在NetManager2？，return就可以不加!!,表示允许返回空，但是客户端就需要判断为空了
            return instance
        }
    }

    fun m(name: String) {
        println("name:$name")
    }
}