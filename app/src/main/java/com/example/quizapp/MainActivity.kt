package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val question = "Vad är 2+2?"

        val correctAnswer = 4
        var curAnswer = "";

        val subAnswer = findViewById<Button>(R.id.buttonAnswer);
        val selQuestOne = findViewById<Button>(R.id.buttonSelectOne);
        val selQuestTwo = findViewById<Button>(R.id.buttonSelectTwo);
        val selQuestThree = findViewById<Button>(R.id.buttonSelectThree);
        val selQuestFour = findViewById<Button>(R.id.buttonSelectFour);






        selQuestOne.setOnClickListener {
            var curAnswer = selQuestOne.text
        }
        selQuestTwo.setOnClickListener {
            var curAnswer = selQuestTwo.text
        }
        selQuestThree.setOnClickListener {
            var curAnswer = selQuestThree.text
        }
        selQuestFour.setOnClickListener {
            var curAnswer = selQuestFour.text
        }

        subAnswer.setOnClickListener {
            if (curAnswer = correctAnswer){
                //SetTextTill CORRECT NOICE!
            }else{
                //SetTextTill YOU SÖK.
            }

        }


        fun subAnswer(ans:boolean){





        }






        //enligt video på ytube all kod här.




    }
}
