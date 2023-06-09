package com.satyender.quizwiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_new_quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_new_quiz = findViewById(R.id.btn_new_quiz);

        button_new_quiz.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, QuizActivity.class);
            startActivity(i);
        });
    }
}