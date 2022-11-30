package com.example.quizgame

object Constants {
    const val USER_NAME: String = "user_name"
    const val CORRECT_ANSWERS: String = "correct_answers"
    const val TOTAL_QUESTIONS: String = "total_questions"

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina, "Argentina", "Peru",
            "Urugvaj", "New Zeland", 1
        )
        questionList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to?", R.drawable.ic_flag_of_brazil,
            "USA", "Serbia", "Brazil", "Monako", 3
        )
        questionList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to?", R.drawable.ic_flag_of_fiji,
            "Bosnia and Herzegovina", "Fiji", "Monako", "Alzir",
            2
        )
        questionList.add(que3)

        val que4 = Question(
            4, "What country does this flag belong to?", R.drawable.ic_flag_of_kuwait,
            "Palestina", "Israel", "Kuwait", "Qatar", 3
        )
        questionList.add(que4)

        return questionList
    }
}