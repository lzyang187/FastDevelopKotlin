package com.lzy.libutils

import com.google.gson.Gson


/**
 * json工具类，基于gson库
 * @author: cyli8
 * @date: 2019/2/12 15:39
 */
object JsonUtil {
    /**
     * 将对象序列化成JSON字符串
     */
    fun toJSONString(obj: Any): String {
        val gson = Gson()
        return gson.toJson(obj)
    }

    /**
     * 将JSON字符串反序列化成对象
     */
    fun <T> parseObject(jsonStr: String, clazz: Class<T>): T? {
        return try {
            val gson = Gson()
            return gson.fromJson<T>(jsonStr, clazz)
        } catch (e: Exception) {
            null
        }
    }

    /**
     * 将JSON字符串反序列化成List
     */
//    fun <T> parseArray(jsonStr: String, clazz: Class<T>): List<T>? {
//        return try {
//            val gson = Gson()
//            return JSON.parseArray(jsonStr, clazz)
//        } catch (e: Exception) {
//            null
//        }
//    }
}