package com.lzy.libutils

import android.content.Context

/**
 * dp、px、sp之间的转化类
 * @author: cyli8
 * @date: 2019/2/1 09:22
 */
object DisplayUtil {
    fun dp2px(context: Context, dpValue: Float): Int {
        val density = context.resources.displayMetrics.density
        return (dpValue * density + 0.5f).toInt()
    }

    fun px2dp(context: Context, pxValue: Float): Int {
        val density = context.resources.displayMetrics.density
        return (pxValue / density + 0.5f).toInt()
    }

    fun sp2px(context: Context, spValue: Float): Int {
        val scaledDensity = context.resources.displayMetrics.scaledDensity
        return (spValue * scaledDensity + 0.5f).toInt()
    }

    fun px2sp(context: Context, pxValue: Float): Int {
        val scaledDensity = context.resources.displayMetrics.scaledDensity
        return (pxValue / scaledDensity + 0.5f).toInt()
    }
}