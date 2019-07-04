package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MathQuiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math_quiz)



        //Val är som final , var är modifier bar.

        var correctAnswer = "4";
        var curAnswer = " ";


        //Final

        //Knappar
        val subAnswer = findViewById<Button>(R.id.buttonAnswer);
        val selQuestOne = findViewById<Button>(R.id.buttonSelectOne);
        val selQuestTwo = findViewById<Button>(R.id.buttonSelectTwo);
        val selQuestThree = findViewById<Button>(R.id.buttonSelectThree);
        val selQuestFour = findViewById<Button>(R.id.buttonSelectFour);

        //Text
        var question = findViewById<TextView>(R.id.question);

        //Setting text:

        question.text = "Vad är 2+2?"

        //



        selQuestOne.setOnClickListener {

            curAnswer = selQuestOne.text.toString();
            println("selQOne klicked.");
            println("current answer = "+curAnswer.toString());
        }
        selQuestTwo.setOnClickListener {
            curAnswer = selQuestTwo.text.toString();
            println("selQTwo klicked.");
            println("current answer = "+curAnswer.toString());
        }
        selQuestThree.setOnClickListener {
            curAnswer = selQuestThree.text.toString();
            println("selQThree klicked.");
            println("current answer = "+curAnswer.toString());
        }
        selQuestFour.setOnClickListener {
            curAnswer = selQuestFour.text.toString();
            println("selQFour klicked.");
            println("current answer = "+curAnswer.toString());
        }

        subAnswer.setOnClickListener {
            println("subAnswer klicked.");
            println("current answer = "+curAnswer.toString());
            println("correct answer = "+correctAnswer.toString());
            if (curAnswer == correctAnswer){
                question.text = "next Einztein!";

            }else{
                question.text = "tu ez stupido?"
            }


        }







        //enligt video på ytube all kod här.




    }
}
