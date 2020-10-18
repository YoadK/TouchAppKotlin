package com.example.touchappkotlin

import android.os.Bundle
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        val x = event.x.toInt()
        val y = event.y.toInt()

        when (event.action) {
            MotionEvent.ACTION_DOWN -> textView1!!.text = "ACTION_DOWN = X: $x Y: $y"
            MotionEvent.ACTION_MOVE -> textView1!!.text = "ACTION_MOVE = X: $x Y: $y"
            MotionEvent.ACTION_UP -> textView1!!.text = "ACTION_UP = X: $x Y: $y"
        }
        return true
    }

}
