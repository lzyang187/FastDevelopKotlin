package com.lzy.libutils

import android.content.Context
import android.net.ConnectivityManager

/**
 * 网络状态工具类
 * @author: cyli8
 * @date: 2019/1/30 14:18
 */
object NetWorkUtil {
    const val WORKTYPE_MOBILE = 0
    const val WORKTYPE_WIFI = 1
    const val WORKTYPE_NONE = -1

    fun isNetWorkConnected(context: Context): Boolean {
        return getNetWorkType(context) != WORKTYPE_NONE
    }

    fun getNetWorkType(context: Context): Int {
        val manager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        var netWorkInfo = manager.getNetworkInfo(ConnectivityManager.TYPE_WIFI)
        if (netWorkInfo.isConnected) {
            return WORKTYPE_WIFI
        }
        netWorkInfo = manager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE)
        if (netWorkInfo.isConnected) {
            return WORKTYPE_MOBILE
        }
        return WORKTYPE_NONE
    }

}