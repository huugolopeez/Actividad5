package com.hugo.actividad5

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layaout)

        val buttonChangeColor = findViewById<Button>(R.id.buttonChangeColor)
        val buttonSwitchActivity = findViewById<Button>(R.id.buttonSwitchActivity)

        buttonChangeColor.setOnClickListener {
            // Cambiar el color de fondo del cuerpo
            val newColor = Color.rgb(0, 0, 255)
            val container = findViewById<LinearLayout>(R.id.container)
            container.setBackgroundColor(newColor)
        }

        buttonSwitchActivity.setOnClickListener {
            // Cambiar a Activity 2
            val editTextMessage = findViewById<EditText>(R.id.editText)
            val message = editTextMessage.text.toString()

            val intent = Intent(this, Activity2::class.java).apply {
                putExtra("message", message)
            }
            startActivity(intent)
        }
    }
}