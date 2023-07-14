package com.example.victorina_19

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.victorina_19.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var questionLists: List<QuestionList>

    private var currentQuestionPosition = 0
    private var selectedOptionByUser = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initBank()
        binding.option1.setOnClickListener {
            if (selectedOptionByUser.isEmpty()){
                selectedOptionByUser = binding.option1.text.toString()
                binding.option1.setBackgroundColor(Color.RED)
                binding.option1.setTextColor(Color.WHITE)
                revealAnswer()
                questionLists[currentQuestionPosition].userSelectedAnswer = selectedOptionByUser
            }
        }
        binding.option2.setOnClickListener {
            if (selectedOptionByUser.isEmpty()){
                selectedOptionByUser = binding.option2.text.toString()
                binding.option2.setBackgroundColor(Color.RED)
                binding.option2.setTextColor(Color.WHITE)
                revealAnswer()
                questionLists[currentQuestionPosition].userSelectedAnswer = selectedOptionByUser
            }
        }
        binding.option3.setOnClickListener {
            if (selectedOptionByUser.isEmpty()){
                selectedOptionByUser = binding.option3.text.toString()
                binding.option3.setBackgroundColor(Color.RED)
                binding.option3.setTextColor(Color.WHITE)
                revealAnswer()
                questionLists[currentQuestionPosition].userSelectedAnswer = selectedOptionByUser
            }
        }
        binding.option4.setOnClickListener {
            if (selectedOptionByUser.isEmpty()){
                selectedOptionByUser = binding.option4.text.toString()
                binding.option4.setBackgroundColor(Color.RED)
                binding.option4.setTextColor(Color.WHITE)
                revealAnswer()
                questionLists[currentQuestionPosition].userSelectedAnswer = selectedOptionByUser
            }
        }
        binding.nextBtn.setOnClickListener {
            if (selectedOptionByUser.isEmpty()){
                Toast.makeText(this,"Пожалуйста выберите ответ",Toast.LENGTH_SHORT).show()
            }else{
                changeNextQuestions()
            }
        }
    }
    private fun getCorrectAnswer(): Int{
        var correctAnswers = 0
        for (i in questionLists.indices){
            val getUserSelectedAnswer: String = questionLists[i].userSelectedAnswer
            val getAnswer: String = questionLists[i].answer
            if (getUserSelectedAnswer == getAnswer){
                correctAnswers++
            }
        }
        return correctAnswers
    }
    private fun getInCorrectAnswer(): Int{
        var correctInAnswers = 0
        for (i in questionLists.indices){
            val getUserSelectedAnswer: String = questionLists[i].userSelectedAnswer
            val getAnswer: String = questionLists[i].answer
            if (getUserSelectedAnswer != getAnswer){
                correctInAnswers++
            }
        }
        return correctInAnswers
    }


@SuppressLint("SetTextI18n")
    private fun changeNextQuestions() {
        currentQuestionPosition++
    if (currentQuestionPosition + 1 == questionLists.size){
        binding.nextBtn.text = "DONE"
    }
    if (currentQuestionPosition < questionLists.size){
        selectedOptionByUser = ""
        binding.option1.setBackgroundResource(R.drawable.round_white_stroke)
        binding.option1.setTextColor(Color.parseColor("#1F6BB8"))
        binding.option2.setBackgroundResource(R.drawable.round_white_stroke)
        binding.option2.setTextColor(Color.parseColor("#1F6BB8"))
        binding.option3.setBackgroundResource(R.drawable.round_white_stroke)
        binding.option3.setTextColor(Color.parseColor("#1F6BB8"))
        binding.option4.setBackgroundResource(R.drawable.round_white_stroke)
        binding.option4.setTextColor(Color.parseColor("#1F6BB8"))
            binding.questions.text = (currentQuestionPosition + 1).toString() + "/" + questionLists.size
        binding.question.text = questionLists[currentQuestionPosition].question
        binding.option1.text = questionLists[currentQuestionPosition].option1
        binding.option2.text = questionLists[currentQuestionPosition].option2
        binding.option3.text = questionLists[currentQuestionPosition].option3
        binding.option4.text = questionLists[currentQuestionPosition].option4
    }
    else{
        getMove()
    }


    }

    private fun getMove() {
        val intent = Intent(this,QuizActivity::class.java)
        intent.putExtra("correct", getCorrectAnswer())
        intent.putExtra("incorrect", getInCorrectAnswer())
        this.startActivity(intent)
        finish()


    }
@SuppressLint("SetTextI18n")
    private fun initBank() {
        val questionBank = QuestionBank()
        questionLists = questionBank.getQuestions
        binding.questions.text = (currentQuestionPosition + 1).toString() + "/" + questionLists.size
        binding.question.text = questionLists[0].question
        binding.option1.text = questionLists[0].option1
        binding.option2.text = questionLists[0].option2
        binding.option3.text = questionLists[0].option3
        binding.option4.text = questionLists[0].option4
    }

    @Deprecated("Deprecated in Java", ReplaceWith("finish()"))
    override fun onBackPressed() {
        finish()
    }

    private fun revealAnswer(){
        when(questionLists[currentQuestionPosition].answer){
            binding.option1.text.toString() -> {
                binding.option1.setBackgroundColor(Color.GREEN)
                binding.option1.setTextColor(Color.WHITE)
            }
            binding.option2.text.toString() -> {
                binding.option2.setBackgroundColor(Color.GREEN)
                binding.option2.setTextColor(Color.WHITE)
            }
            binding.option3.text.toString() -> {
                binding.option3.setBackgroundColor(Color.GREEN)
                binding.option3.setTextColor(Color.WHITE)
            }
            binding.option4.text.toString() -> {
                binding.option4.setBackgroundColor(Color.GREEN)
                binding.option4.setTextColor(Color.WHITE)
            }
        }
    }
}
