package com.likobehruz.animation

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var ins:TextView
    lateinit var teleg:TextView
    lateinit var tel:TextView
    lateinit var rasm:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        ins = findViewById(R.id.ins)
        rasm= findViewById(R.id.rasm)

        ins.setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this, R.anim.comb_anim)
            ins.startAnimation(anim)
        }

        rasm = findViewById(R.id.rasm)
        teleg = findViewById(R.id.teleg)
        teleg.setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this, R.anim.scale_anim)
            teleg.startAnimation(anim)
        }

        tel = findViewById(R.id.tel)
        rasm = findViewById(R.id.rasm)
        tel.setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this, R.anim.rotate_anim)
            tel.startAnimation(anim)
        }
        rasm=findViewById(R.id.rasm)
        rasm.setOnClickListener{
            val anim =AnimationUtils.loadAnimation(this, R.anim.translate_anim)
            rasm.startAnimation(anim)
        }



    }
}
