package com.example.kotlinlearning.comparearray

/**
 * @Author:         Jack Ou
 * @CreateDate:     2020/8/2 21:42
 * @UpdateUser:     更新者
 * @UpdateDate:     2020/8/2 21:42
 * @UpdateRemark:   数据
 */
fun main() {
    //第一种形式  直接new数组
    val nums: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    //println(nums[2])
    for (num in nums) {
        //println(num)
    }

    // 第二种集合形式 value初始值是0，自旋一次+1
    val numbers = Array(10) { value: Int -> (value + 100) }
    for (number in numbers) {
        println(number)
    }
}