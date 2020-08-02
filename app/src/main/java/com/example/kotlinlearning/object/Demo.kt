package com.example.kotlinlearning.`object`

/**
 * @Author:         Jack Ou
 * @CreateDate:     2020/8/3 0:27
 * @UpdateUser:     更新者
 * @UpdateDate:     2020/8/3 0:27
 * @UpdateRemark:   更新说明
 */
fun main() {
    val person = Person(1) //主构造函数
    val person1 = Person() //次构造

    val user = User(11,"JackOu",'M')
    val(myId,myName,mySexy) = user.copy()
    println("id:$myId, name:$myName, sexy:$mySexy")

    // _符号用于拒收值
    val(_,myName2,_) = user.copy()
    println("name:$myName2")

    //使用 Object只会实例化一次，相当于单例
//    MyEngine().m()
//    MyEngine().m()
//    MyEngine().m()
    MyEngine.m()
    MyEngine.m()
    MyEngine.m()

    //使用饿汉单例
    NetManager.getInstance().m()

    //使用懒汉模式单例 使用了!!不需要客户端判断是否为空
    //NetManager2.getInstance().m("JackOu")

    //使用懒汉模式单例 使用了?需要服务端返回空，需要客户端判断.
    //客户端使用？如果返回空不执行后面的m
    NetManager2.getInstance()?.m("JackOu")
}