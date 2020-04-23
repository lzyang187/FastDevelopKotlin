package com.lzy.corebiz

import android.app.Application
import com.lzy.libutils.system.DeviceUtil
import com.lzy.libutils.system.ScreenUtil

/**
 * 全局配置信息
 * @author: cyli8
 * @date: 2019/2/12 15:06
 */
object AppConfig {
    lateinit var APPLICATION: Application
    var DEBUG: Boolean = false
    var VERSION_CODE: Int = 0
    lateinit var VERSION_NAME: String
    lateinit var APP_NAME: String
    lateinit var PACKAGE_NAME: String

    var MAC: String? = ""
    lateinit var IMEI: String
    lateinit var ANDROID_ID: String
    var SCREEN_WIDTH: Int = 0
    var SCREEN_HEIGHT: Int = 0

    fun init(application: Application, debug: Boolean, versionCode: Int, versionName: String, appName: String, packageName: String) {
        APPLICATION = application
        DEBUG = debug
        VERSION_CODE = versionCode
        VERSION_NAME = versionName
        APP_NAME = appName
        PACKAGE_NAME = packageName
        MAC = DeviceUtil.getMacAddress(application)
        IMEI = DeviceUtil.getIMEI(application)
        ANDROID_ID = DeviceUtil.getAndroidID(application)
        SCREEN_WIDTH = ScreenUtil.getScreenWidth(application)
        SCREEN_HEIGHT = ScreenUtil.getScreenHeight(application)
    }
}