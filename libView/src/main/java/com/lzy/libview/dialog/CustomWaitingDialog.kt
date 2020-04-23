package com.lzy.libview.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.view.Window
import android.view.WindowManager
import com.lzy.libview.R
import kotlinx.android.synthetic.main.lib_view_progress_dialog_layout.*

/**
 * 自定义等待框
 * @author: cyli8
 * @date: 2019/2/12 10:57
 */
class CustomWaitingDialog(context: Context) : Dialog(context) {

    private lateinit var mTips: String

    constructor(context: Context, tips: String) : this(context) {
        mTips = tips
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.lib_view_progress_dialog_layout)
        if (!this::mTips.isInitialized || TextUtils.isEmpty(mTips)) {
            tips_tv.visibility = View.GONE
        } else {
            tips_tv.text = mTips
            tips_tv.visibility = View.VISIBLE
        }
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        val layoutParams = window?.attributes
        layoutParams?.width = WindowManager.LayoutParams.MATCH_PARENT
        layoutParams?.height = WindowManager.LayoutParams.MATCH_PARENT
    }

}