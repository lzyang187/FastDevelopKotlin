package com.lzy.libutils.system

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context

/**
 * 粘贴板工具类
 * @author: cyli8
 * @date: 2019/1/31 16:12
 */
object ClipboardUtil {
    fun copyText(context: Context, text: String) {
        val manager = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        manager.primaryClip = ClipData.newPlainText("simple text copy", text)
    }

    fun getText(context: Context): String {
        val manager = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        if (manager.hasPrimaryClip()) {
            val clip = manager.primaryClip
            return clip?.getItemAt(0)?.text.toString()
        }
        return ""
    }
}