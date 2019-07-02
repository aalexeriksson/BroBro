package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //Val är som final , var är modifier bar.
        var question = "Vad är 2+2?";
        var correctAnswer = "4";
        var curAnswer = " ";


        //Final
        val subAnswer = findViewById<Button>(R.id.buttonAnswer);
        val selQuestOne = findViewById<Button>(R.id.buttonSelectOne);
        val selQuestTwo = findViewById<Button>(R.id.buttonSelectTwo);
        val selQuestThree = findViewById<Button>(R.id.buttonSelectThree);
        val selQuestFour = findViewById<Button>(R.id.buttonSelectFour);






        selQuestOne.setOnClickListener {
            curAnswer = selQuestOne.text.toString();
        }
        selQuestTwo.setOnClickListener {
            curAnswer = selQuestTwo.text.toString();
        }
        selQuestThree.setOnClickListener {
            curAnswer = selQuestThree.text.toString();
        }
        selQuestFour.setOnClickListener {
            curAnswer = selQuestFour.text.toString();
        }

        subAnswer.setOnClickListener {
            if (curAnswer == correctAnswer){
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
