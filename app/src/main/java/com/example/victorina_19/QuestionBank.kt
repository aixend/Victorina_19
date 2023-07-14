package com.example.victorina_19

class QuestionBank {
    val getQuestions: List<QuestionList>
        get() {
           val questionLists: MutableList<QuestionList> = ArrayList<QuestionList>()
            val question1 = QuestionList("Кто президент КР?","Садыр Жапаров",
            "Дана","Атай", "Имран","Садыр Жапаров", ""
                )
            val question2 = QuestionList(
                "Which boxer did Muhammad Ali fight in ‘The Rumble in the Jungle’?",
                "Tom Holland", "Tom Cruise", "George Foreman", "Lev Tolstoy",
                "George Foreman", ""
            )
            val question3 = QuestionList(
                "Which sport takes place in a velodrome?",
                "Hockey", "Tennis", "Formula 1", "Cycling",
                "Cycling", ""
            )
            val question4 = QuestionList(
                "How many points are awarded for a touchdown in American Football?",
                "45", "15", "6", "4",
                "6", ""
            )
            val question5 = QuestionList(
                " Which country won the first ever football world cup?",
                "Argentina", "Uruguay", "Brazil", "France",
                "Uruguay", ""
            )
            val question6 = QuestionList(
                "What has Mohammed Ali’s original name?",
                "Mohammed Salah", "Cassius Clay", "Chidiegwu Chidiebele", "Ezgi Kadri",
                "Cassius Clay", ""
            )
            val question7 = QuestionList(
                "What is  world record time for the 100 metres?",
                "9.58 seconds", "9.48 seconds", "9.18 seconds", "10.58 seconds",
                "9.58 seconds", ""
            )
            val question8 = QuestionList(
                "How many gold medals has Usain Bolt won?",
                "3", "10", "9", "8",
                "8", ""
            )
            val question9 = QuestionList(
                "How long is the total distance of a marathon?",
                "45.195 km.", "10.000 km.", "42.195 km", "21.195 km.",
                "42.195 km", ""
            )
            val question10 = QuestionList(
                "How many players are there on a baseball team?",
                "9 players", "11 players", "5 players", "4 players",
                "9 players", ""
            )
            questionLists.add(question1)
            questionLists.add(question2)
            questionLists.add(question3)
            questionLists.add(question4)
            questionLists.add(question5)
            questionLists.add(question6)
            questionLists.add(question7)
            questionLists.add(question8)
            questionLists.add(question9)
            questionLists.add(question10)
            return questionLists
        }
}