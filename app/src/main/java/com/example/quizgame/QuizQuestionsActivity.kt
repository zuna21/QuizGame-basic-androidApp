package com.example.quizgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionsActivity : AppCompatActivity() {

    private var tvQuestion: TextView? = null
    private var ivImage: ImageView? = null
    private var pbProgressBar: ProgressBar? = null
    private var tvProgressBar: TextView? = null
    private var tvOptionOne: TextView? = null
    private var tvOptionTwo: TextView? = null
    private var tvOptionThree: TextView? = null
    private var tvOptionFour: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        tvQuestion = findViewById(R.id.tvQuestion)
        ivImage = findViewById(R.id.ivImage)
        pbProgressBar = findViewById(R.id.pbProgressBar)
        tvProgressBar = findViewById(R.id.tvProgressBar)
        tvOptionOne = findViewById(R.id.tvOptionOne)
        tvOptionTwo = findViewById(R.id.tvOptionTwo)
        tvOptionThree = findViewById(R.id.tvOptionThree)
        tvOptionFour = findViewById(R.id.tvOptionFour)

        val questionsList = Constants.getQuestions()

        for(i in questionsList) {
            Log.e("Question: ", i.question)
        }

        var currentPosition = 1
        var currentQuestion: Question = questionsList[currentPosition - 1]
        tvQuestion?.text = currentQuestion.question
        ivImage?.setImageResource(currentQuestion.image)
        pbProgressBar?.progress = currentPosition
        var progress: String = "$currentPosition/${questionsList.size}"
        tvProgressBar?.text = progress
        tvOptionOne?.text = currentQuestion.optionOne
        tvOptionTwo?.text = currentQuestion.optionTwo
        tvOptionThree?.text = currentQuestion.optionThree
        tvOptionFour?.text = currentQuestion.optionFour


    }
}