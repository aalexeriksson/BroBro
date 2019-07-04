package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Just nu ingen generel quiz sida där man kan välja och söka vilken quiz man vill
        //Kanske härifrån bara göra en quiz sökmotor som tar quizar från SQL för att sedan laddas in i generel quiz mall.

        val buttonQuiz = findViewById<Button>(R.id.button_quiz);
        val buttonHelp = findViewById<Button>(R.id.button_help);
        val buttonAbout = findViewById<Button>(R.id.button_about);


        buttonQuiz.setOnClickListener {
            val quizIntent = Intent(this,MathQuiz::class.java);
            startActivity(quizIntent);

        }
        buttonHelp.setOnClickListener {
            val helpIntent = Intent(this, Help::class.java);
            startActivity(helpIntent);
        }
        buttonAbout.setOnClickListener {
            val aboutIntent = Intent(this, About::class.java);
            startActivity(aboutIntent);
        }


    }




    }