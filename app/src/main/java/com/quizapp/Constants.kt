package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1=Question(1, "Ek Quater Mein kitna Hota hai:",
            R.drawable.question1,"30 ml",
            "25 ml",
            "0.25 ml",

            "Information is Insufficient",
            4

        )

        questionsList.add(que1)

        // 2
        val que2=Question(2, "Why did his sadness ended:",
            R.drawable.question2,"Shadi hogai Katrina Se",
            "Selmon bhoi ne phenyl pi li ",
            "Abh katrina Flims ka jugard kar degi",

            "Abh akele HOW'S THE JOSH nhi chillayenge",
            2)

        questionsList.add(que2)

        // 3
        val que3=Question(3, "Who is the person in the given Figure:",
            R.drawable.question3,"Yogi Adityanath",
            "Nawazuddin Siddique",
            "Ali Fazal",

            "Guddu Pandit",
            4)

        questionsList.add(que3)

        // 4
        val que4=Question(4, "The iconic scene showed below is from which movie:",
        R.drawable.question4,"Race Gurram",
        "Ae Raja Line Par Aa Jaa",
        "Tambu Mein Dhum Dham",

        "Mission Omicron",
        1)

        questionsList.add(que4)

        // 5
        val que5=Question(5, "What is this vehicle famous for:",
            R.drawable.question5,"Ambulance",
            "Apharan",
            "Amateur School Bus",

            "Zomato/Swiggy",
            2)

        questionsList.add(que5)

        return questionsList
    }
}