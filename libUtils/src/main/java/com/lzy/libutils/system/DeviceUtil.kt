package com.lzy.libutils.system

import android.annotation.SuppressLint
import android.content.Context
import android.net.wifi.WifiManager
import android.os.Build
import android.provider.Settings
import android.telephony.TelephonyManager

/**
 * 设备信息工具类
 * @author: cyli8
 * @date: 2019/1/31 16:45
 */
object DeviceUtil {
    /**
     * 获取设备 AndroidID
     */
    @SuppressLint("HardwareIds")
    fun getAndroidID(context: Context): String {
        return Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
    }

    /**
     * 获取设备 MAC 地址
     */
    @SuppressLint("HardwareIds")
    fun getMacAddress(context: Context): String? {
        val manager = context.applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
        return manager.connectionInfo?.macAddress
    }

    /**
     * 获取 IMEI 码
     */
    @SuppressLint("MissingPermission", "HardwareIds")
    fun getIMEI(context: Context): String {
        val manager = context.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
        return manager.deviceId
    }

    /**
     * 获取设备厂商
     */
    fun getManufacturer(): String = Build.MANUFACTURER

    /**
     * 获取设备型号
     */
    fun getModel(): String {
        val model = Build.MODEL
        return model.trim().replace("\\s*", "")
    }

}