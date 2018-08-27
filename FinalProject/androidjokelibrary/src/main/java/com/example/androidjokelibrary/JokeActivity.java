package com.example.androidjokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public static final String JOKE_KEY = "joke_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        Intent sendingIntent = getIntent();
        String joke = sendingIntent.getStringExtra(JOKE_KEY);
        TextView jokeAnswerText = findViewById(R.id.joke_answer_text);
        jokeAnswerText.setText(joke);
    }

}
