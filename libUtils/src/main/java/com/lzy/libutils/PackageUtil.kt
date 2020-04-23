package com.lzy.libutils

import android.content.Context
import android.content.pm.PackageInfo
import android.content.pm.PackageManager

/**
 * 包相关的工具类
 * @author: cyli8
 * @date: 2019/1/30 09:22
 */
object PackageUtil {

    const val QQ_PACKAGE_NAME = "com.tencent.mobileqq"
    const val WEIXIN_PACKAGE_NAME = "com.tencent.mm"
    const val WEIBO_PACKAGE_NAME = "com.sina.weibo"

    fun isInstalled(context: Context, pkgName: String): Boolean {
        val packageInfo: PackageInfo? = try {
            context.packageManager.getPackageInfo(pkgName, 0)
        } catch (e: PackageManager.NameNotFoundException) {
            null
        }
        return packageInfo != null
    }

    fun isQQInstalled(context: Context): Boolean {
        return isInstalled(context, QQ_PACKAGE_NAME)
    }

    fun isWeiXinInstalled(context: Context): Boolean {
        return isInstalled(context, WEIXIN_PACKAGE_NAME)
    }

    fun isWeiBoInstalled(context: Context): Boolean {
        return isInstalled(context, WEIBO_PACKAGE_NAME)
    }

}