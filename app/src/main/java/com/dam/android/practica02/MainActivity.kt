package com.dam.android.practica02

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var boton:Button
    private lateinit var usuario:EditText
    private lateinit var contra:EditText
    private lateinit var error:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton = findViewById(R.id.button)
        usuario = findViewById(R.id.editTextText)
        contra = findViewById(R.id.editTextPassword)
        error = findViewById(R.id.textViewError)

        boton.setOnClickListener {
            Log.i("boton", "Pulsado")

            val usuarioCorrecto = "alejandrohernandez@gmail.com"
            val contraCorrecta = "12345"

            if (usuario.text.toString() == usuarioCorrecto && contra.text.toString() == contraCorrecta) {
                val intent = Intent(this, LoginApp::class.java)
                intent.putExtra("clave", "valor")
                startActivity(intent)

                error.visibility = View.GONE
            } else {
                error.visibility = View.VISIBLE
            }
        }
    }
}