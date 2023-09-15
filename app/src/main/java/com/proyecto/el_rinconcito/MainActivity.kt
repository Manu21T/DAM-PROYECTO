package com.proyecto.el_rinconcito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

//Funcion para la segunda vista//

        val button = findViewById<Button>(R.id.btn_ingreso)
        button.setOnClickListener {
            val intent = Intent(this, SegundaActivity::class.java)
            startActivity(intent)

            val button = findViewById<Button>(R.id.btn_registro)
            button.setOnClickListener {
                val intent = Intent(this, TerceraActivity::class.java)
                startActivity(intent)
            }
        }
    }
}




