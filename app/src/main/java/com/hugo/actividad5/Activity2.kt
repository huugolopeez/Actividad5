package com.hugo.actividad5

import android.graphics.Typeface
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2_layaout)

        val typeface = Typeface.createFromAsset(assets, "fonts/comic.ttf")
        val message = intent.getStringExtra("message")

        val textView = findViewById<TextView>(R.id.textView)
        val textViewMessage = findViewById<TextView>(R.id.textViewMessage)

        textViewMessage.text = message
        textView.typeface = typeface
        textViewMessage.typeface = typeface
    }
}