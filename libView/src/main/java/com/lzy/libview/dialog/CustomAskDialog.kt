package com.lzy.libview.dialog

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.lzy.libview.R
import kotlinx.android.synthetic.main.lib_view_ask_dlg.*
import kotlinx.android.synthetic.main.lib_view_cancel_ok_btns.*

/**
 * 询问Dialog
 * @author: cyli8
 * @date: 2019/2/1 10:04
 */
class CustomAskDialog(context: Context, title: String, listener: OnAskDlgListener?) : BaseDialog(context, 0),
    View.OnClickListener {

    interface OnAskDlgListener {
        fun onClickOk()

        fun onClickCancel()
    }

    private var mListener: OnAskDlgListener?

    constructor(context: Context, title: String, content: String, listener: OnAskDlgListener?) :this(context, title, listener) {
        content_tv.text = content
    }

    init {
        setCanceledOnTouchOutside(false)
        this.mListener = listener
        val view = LayoutInflater.from(context).inflate(R.layout.lib_view_ask_dlg, null)
        setContentView(view)
        title_tv.text = title
        ok_tv.setOnClickListener(this)
        cancel_tv.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.ok_tv -> {
                mListener?.onClickOk()
                dismiss()
            }
            R.id.cancel_tv -> {
                mListener?.onClickCancel()
                dismiss()
            }
        }
    }
}