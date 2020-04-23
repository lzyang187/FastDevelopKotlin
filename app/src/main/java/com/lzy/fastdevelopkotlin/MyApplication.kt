package com.lzy.fastdevelopkotlin

import android.app.Application
import com.lzy.corebiz.AppConfig

/**
 *
 * @author: cyli8
 * @date: 2019/2/12 15:25
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AppConfig.init(
            this,
            BuildConfig.DEBUG,
            BuildConfig.VERSION_CODE,
            BuildConfig.VERSION_NAME,
            getString(R.string.app_name),
            BuildConfig.APPLICATION_ID
        )
    }
}