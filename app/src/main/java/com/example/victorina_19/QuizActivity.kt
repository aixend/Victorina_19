package com.example.victorina_19

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.victorina_19.databinding.ActivityQuizBinding
@Suppress("DEPRECATION")
class QuizActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuizBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val getCorrectAnswers: Int = intent.getIntExtra("correct",0)
        val getInCorrectAnswers: Int = intent.getIntExtra("incorrect",0)
        binding.correctAnswer.text = "Правильные ответы - $getCorrectAnswers"
        binding.incorrectAnswer.text = "Неправильные ответы - $getInCorrectAnswers"
        binding.btnAgain.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this,MainActivity::class.java))
        finish()
    }

}