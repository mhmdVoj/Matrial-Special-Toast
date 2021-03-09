package com.mhmd.voj.lib.materiatoastlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.mhmd.voj.lib.materialspecialtoast.MaterialSpecialToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val show_simple_toast : Button = findViewById(R.id.show_simple_toast)
        show_simple_toast.setOnClickListener {
            MaterialSpecialToast.normal(
                this,
                "This is a normal",
                Toast.LENGTH_SHORT
            ).show()

        }

        val show_alert_toast : Button = findViewById(R.id.show_alert_toast)
        show_alert_toast.setOnClickListener {
            MaterialSpecialToast.error(
                this,
                "This is a Error!",
                Toast.LENGTH_SHORT
            ).show()

        }

        val show_info_toast : Button = findViewById(R.id.show_info_toast)
        show_info_toast.setOnClickListener {
            MaterialSpecialToast.info(
                this,
                "This is a information",
                Toast.LENGTH_SHORT
            ).show()

        }

        val show_warning_toast : Button = findViewById(R.id.show_warning_toast)
        show_warning_toast.setOnClickListener {
            MaterialSpecialToast.warning(
                this,
                "This is a warning",
                Toast.LENGTH_SHORT
            ).show()
        }

        val show_custom_toast : Button = findViewById(R.id.show_custom_toast)
        show_custom_toast.setOnClickListener {
            MaterialSpecialToast.custom(
                this,
            "Happy Birth Day !",
            R.drawable.ic_baseline_cake_24,
            R.drawable.my_layot_toast,
            Toast.LENGTH_SHORT
            ).show()
        }

        val show_success_toast : Button = findViewById(R.id.show_success_toast)
        show_success_toast.setOnClickListener {
            MaterialSpecialToast.success(
                this,
                "This is a Success",
                Toast.LENGTH_SHORT
            ).show()
        }



//        MaterialSpecialToast.custom(
//            this,
//            "Salam salam",
//            null,
//            R.drawable.my_layot_toast,
//            Toast.LENGTH_SHORT
//        ).show()
    }
}