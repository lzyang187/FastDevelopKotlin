package com.lzy.libutils

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager

/**
 * Intent相关工具类
 * @author: cyli8
 * @date: 2019/2/1 09:29
 */
object IntentUtil {
    /**
     * 判断当前activity是否可跳转
     */
    fun isActivityCanJump(context: Context, intent: Intent): Boolean {
        val resolveInfo = context.packageManager.resolveActivity(intent, PackageManager.MATCH_DEFAULT_ONLY)
        if (resolveInfo?.activityInfo != null) {
            return resolveInfo.activityInfo.exported
        }
        return false
    }

}