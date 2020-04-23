package com.lzy.libutils.system

import android.content.Context
import android.graphics.Point
import android.view.WindowManager

/**
 * 手机屏幕尺寸工具类
 * @author: cyli8
 * @date: 2019/1/31 17:12
 */
object ScreenUtil {

    /**
     * 获取屏幕的宽度（单位：px）
     */
    fun getScreenWidth(context: Context): Int {
        val manager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val point = Point()
        manager.defaultDisplay.getRealSize(point)
        return point.x
    }

    /**
     * 获取屏幕的高度（单位：px）
     */
    fun getScreenHeight(context: Context): Int {
        val manager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val point = Point()
        manager.defaultDisplay.getRealSize(point)
        return point.x
    }
}