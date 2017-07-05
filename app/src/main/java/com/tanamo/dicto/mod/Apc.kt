package com.tanamo.dicto.mod

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.widget.ImageView
import android.widget.TextView
import com.tanamo.dicto.R
import com.tanamo.dicto.ui.Ques
import com.tanamo.dicto.ui.Ques2

/**
 * Created by TANDOH on 6/22/2017.
 */

open class Apc : AppCompatActivity() {
    var dia: Dialog? = null
    var ctx: Context = this@Apc

    var imag: ImageView? = null
    var imag2: ImageView? = null
    var imag3: ImageView? = null

    var title: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ap)

        shwDialog()

    }

    fun shwDialog() {

        dia = Dialog(ctx)
        dia!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dia!!.setContentView(R.layout.ap)
        dia!!.setCancelable(false)
        dia!!.setCanceledOnTouchOutside(false)

        title = dia!!.findViewById<TextView>(R.id.title)

        imag = dia!!.findViewById<ImageView>(R.id.quit)

        imag2 = dia!!.findViewById<ImageView>(R.id.replay)

        imag3 = dia!!.findViewById<ImageView>(R.id.nxt)


        imag!!.setOnClickListener({
            finish()
        })


        imag2!!.setOnClickListener {
            var intent: Intent
            intent = Intent(ctx, Ques::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }





        imag3!!.setOnClickListener {
            var intent: Intent = Intent(ctx, Ques2::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }


    }


}
