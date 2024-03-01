package com.hugo.actividad5

import android.graphics.Typeface
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2_layaout)

        val textView = findViewById<TextView>(R.id.textView)
        val typeface = Typeface.createFromAsset(assets, "fonts/comic.ttf")
        textView.typeface = typeface
    }
}