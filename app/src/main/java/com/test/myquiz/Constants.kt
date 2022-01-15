package com.test.myquiz

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions() : ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            optionOne = "Argentina",
            optionTwo = "Australia",
            optionThree = "Japan",
            optionFour = "Ireland",
            correctAnswer = 1
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            optionOne = "Argentina",
            optionTwo = "Australia",
            optionThree = "Mongolia",
            optionFour = "Peru",
            correctAnswer = 2
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            optionOne = "China",
            optionTwo = "Australia",
            optionThree = "France",
            optionFour = "Belgium",
            correctAnswer = 4
        )
        questionsList.add(que3)

        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            optionOne = "Turkey",
            optionTwo = "Brazil",
            optionThree = "Japan",
            optionFour = "Portugal",
            correctAnswer = 2
        )
        questionsList.add(que4)

        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            optionOne = "Poland",
            optionTwo = "Finland",
            optionThree = "Denmark",
            optionFour = "Ireland",
            correctAnswer = 3
        )
        questionsList.add(que5)

        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            optionOne = "Fiji",
            optionTwo = "Romania",
            optionThree = "Japan",
            optionFour = "Greece",
            correctAnswer = 1
        )
        questionsList.add(que6)

        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            optionOne = "Norway",
            optionTwo = "Belgium",
            optionThree = "Sweden",
            optionFour = "Germany",
            correctAnswer = 4
        )
        questionsList.add(que7)

        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            optionOne = "Argentina",
            optionTwo = "India",
            optionThree = "Nepal",
            optionFour = "Ireland",
            correctAnswer = 2
        )
        questionsList.add(que8)

        val que9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            optionOne = "Kuwait",
            optionTwo = "Austria",
            optionThree = "Australia",
            optionFour = "Ireland",
            correctAnswer = 1
        )
        questionsList.add(que9)

        val que10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            optionOne = "Mexico",
            optionTwo = "Romania",
            optionThree = "New Zealand",
            optionFour = "Finland",
            correctAnswer = 3
        )
        questionsList.add(que10)

        return questionsList
    }
}