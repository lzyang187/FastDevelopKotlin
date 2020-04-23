package com.lzy.libutils.url

import android.text.TextUtils

/**
 * url帮助类
 * @author: cyli8
 * @date: 2019/2/1 09:15
 */
object UrlHelper {
    fun isUrlValid(url: String): Boolean {
        val trimUrl = url.trim()
        if (TextUtils.isEmpty(trimUrl)) {
            return false
        }
        return trimUrl.startsWith("http://") || trimUrl.startsWith("https://")
    }

}