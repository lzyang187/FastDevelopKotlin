package com.lzy.libutils

/**
 * List列表工具类
 * @author: cyli8
 * @date: 2019/1/24 10:34
 */
object ListUtil {

    fun <T> isIndexValid(list: List<T>, index: Int): Boolean {
        return index >= 0 && index < list.size
    }

}