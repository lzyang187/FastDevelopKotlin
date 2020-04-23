package com.lzy.libutils.file

import android.os.Environment
import java.io.File

/**
 * 文件操作工具类
 * @author: cyli8
 * @date: 2019/1/30 17:15
 */
object FileUtil {
    fun isExternalStorageAvailable() = Environment.MEDIA_MOUNTED == Environment.getExternalStorageState()

    /**
     * 删除指定文件路径下的所有子文件
     */
    fun delAllSubFile(path: String): Boolean {
        var result = false
        val file = File(path)
        if (!file.exists() || !file.isDirectory) {
            return result
        }
        val subFilelist = file.list()
        if (subFilelist == null || subFilelist.isEmpty()) {
            result = true
            return result
        }
        var temp: File
        for (i in subFilelist.indices) {
            temp = if (path.endsWith(File.separator)) {
                File(path + subFilelist[i])
            } else {
                File(path + File.separator + subFilelist[i])
            }
            if (temp.isFile) {
                temp.delete()
            } else if (temp.isDirectory) {
                delFolder(temp.absolutePath)
            }
            result = true
        }
        return result
    }

    /**
     * 删除指定文件夹及其子文件
     */
    fun delFolder(folderPath: String) {
        delAllSubFile(folderPath)
        File(folderPath).delete()
    }

    fun delFile(filePath: String): Boolean {
        val file = File(filePath)
        if (file.exists()) {
            return file.delete()
        }
        return false
    }

    /**
     * 确保指定目录存在，不存在则创建
     */
    fun ensureDirExist(folderPath: String): Boolean {
        val file = File(folderPath)
        if (file.exists()) {
            if (file.isDirectory) {
                return true
            } else {
                file.delete()
            }
        }
        return file.mkdirs()
    }

    /**
     * 获取文件或目录下文件大小
     */
    fun getDirSize(file: File): Long {
        if (file.exists()) {
            return if (file.isDirectory) {
                val listFiles = file.listFiles()
                var size: Long = 0
                for (subFile in listFiles) {
                    size += getDirSize(subFile)
                }
                size
            } else {
                file.length()
            }
        }
        return 0
    }

}