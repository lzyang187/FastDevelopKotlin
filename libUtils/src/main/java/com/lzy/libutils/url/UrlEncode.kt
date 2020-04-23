package com.lzy.libutils.url

import android.text.TextUtils
import java.net.URLDecoder
import java.net.URLEncoder
import java.util.regex.Pattern

/**
 * url编码工具类
 * @author: cyli8
 * @date: 2019/2/1 08:53
 */
object UrlEncode {
    fun decode(url: String): String {
        return URLDecoder.decode(url, "utf-8")
    }

    fun encode(url: String): String {
        if (TextUtils.isEmpty(url)) {
            return url
        }
        val matcher = Pattern.compile("[\\u4e00-\\u9fa5]").matcher(url)
        while (matcher.find()) {
            val group = matcher.group()
            return url.replace(group, URLEncoder.encode(group, "utf-8"))
        }
        return url
    }
}