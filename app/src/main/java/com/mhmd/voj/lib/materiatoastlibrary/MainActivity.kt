package com.mhmd.voj.lib.materiatoastlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mhmd.voj.lib.materialspecialtoast.MaterialSpecialToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        MaterialSpecialToast.warning(
//            this,
//            "This is a warning!",
//            Toast.LENGTH_SHORT
//        ).show()

//        MaterialSpecialToast.error(
//            this,
//            "This is a error!",
//            Toast.LENGTH_SHORT
//        ).show()

//        MaterialSpecialToast.info(
//            this,
//            "This is a info!",
//            Toast.LENGTH_SHORT
//        ).show()

//        MaterialSpecialToast.normal(
//            this,
//            "This is a normal",
//            Toast.LENGTH_SHORT
//        ).show()

        MaterialSpecialToast.success(
            this,
            "This is a success",
            Toast.LENGTH_SHORT
        ).show()



//        MaterialSpecialToast.custom(
//            this,
//            "Salam salam",
//            null,
//            R.drawable.my_layot_toast,
//            Toast.LENGTH_SHORT
//        ).show()
    }
}