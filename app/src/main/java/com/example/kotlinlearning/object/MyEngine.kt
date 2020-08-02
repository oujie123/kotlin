package com.example.kotlinlearning.`object`

/**
 * @Author:         Jack Ou
 * @CreateDate:     2020/8/3 0:59
 * @UpdateUser:     更新者
 * @UpdateDate:     2020/8/3 0:59
 * @UpdateRemark:   更新说明
 */
//使用object是会实例化一次,文件图标是黄色的，是线程安全的
object MyEngine {

    fun m() {
        println("测试object关键字生成单例")
    }
}
//class MyEngine {
//
//    fun m() {
//        println("测试object关键字生成单例")
//    }
//}