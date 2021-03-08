package com.mhmd.voj.lib.materialspecialtoast

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class MaterialSpecialToast {

    companion object {

        fun custom(
            context: Context,
            message: CharSequence,
            icon: Int?,
            backDrawable: Int,
            duration: Int
        ): Toast {
            val currentToast = Toast.makeText(context, null, duration)
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = inflater.inflate(R.layout.toast_layout, null ,false)

            val textToast: TextView = view.findViewById(R.id.txt_toast)
            val rootToast: ViewGroup = view.findViewById(R.id.layout_group_toast)
            val imgToast: ImageView = view.findViewById(R.id.img_toast)

            if (icon == null) {
                imgToast.visibility = View.GONE
            } else {
                imgToast.visibility = View.VISIBLE
                imgToast.setBackgroundResource(icon)
            }

            textToast.text = message.toString()

            rootToast.background = ContextCompat.getDrawable(context, backDrawable)

            currentToast.view = view
            return currentToast

        }

        fun normal(context: Context , msg : CharSequence , duration : Int) : Toast {
            return custom(context,msg,null,R.drawable.normal_layout,duration)
        }

        fun warning(context: Context , msg : CharSequence , duration : Int) : Toast {
            return custom(context,msg,null,R.drawable.warning_layout,duration)
        }

        fun error(context: Context , msg : CharSequence , duration : Int) : Toast {
            return custom(context,msg,null,R.drawable.error_layout,duration)
        }

        fun info(context: Context , msg : CharSequence , duration : Int) : Toast {
            return custom(context,msg,null,R.drawable.info_layout,duration)
        }


        fun success(context: Context , msg : CharSequence , duration : Int) : Toast {
            return custom(context,msg,null,R.drawable.success_layout,duration)
        }


    }


}