package com.lzy.fastdevelopkotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.lzy.corebiz.AppConfig
import com.lzy.fastdevelopkotlin.test.User
import com.lzy.libutils.JsonUtil

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(
            "cyli8",
            "${AppConfig.APPLICATION} ${AppConfig.DEBUG} ${AppConfig.VERSION_NAME} ${AppConfig.ANDROID_ID} ${AppConfig.IMEI}  ${AppConfig.SCREEN_HEIGHT}"
        )
        val user = User("a")
        val jsonString = JsonUtil.toJSONString(user)
        Log.d("cyli8", jsonString)
        var user1 = JsonUtil.parseObject(jsonString, User::class.java)
        Log.d("cyli8", user1.toString())
    }
}
