package com.example.quizgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class QuizQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val questionsList = Constants.getQuestions()

    }
}