package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState!=null){
            scoreA = savedInstanceState.getInt("scoreA");
            scoreB = savedInstanceState.getInt("scoreB");
            showScoreA(scoreA);
            showScoreB(scoreB);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scoreA",scoreA);
        outState.putInt("scoreB",scoreB);
    }

    /*@Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreA = savedInstanceState.getInt("scoreA");
        scoreB = savedInstanceState.getInt("scoreB");
        showScoreA(scoreA);
        showScoreB(scoreB);
    } */

    int scoreA = 0;
    int scoreB = 0;

    public void add_3_pointA(View v) {
        int point = 3;
        scoreA = scoreA + point;
        showScoreA(scoreA);
    }

    public void add_2_pointA(View v) {
        int point = 2;
        scoreA = scoreA + point;
        showScoreA(scoreA);
    }

    public void add_1_pointA(View v) {
        int point = 1;
        scoreA = scoreA + point;
        showScoreA(scoreA);
    }

    public void showScoreA(int score) {
        TextView scoreATextView = (TextView) findViewById(R.id.scoreA);
        scoreATextView.setText(String.valueOf(score));
    }

    public void add_3_pointB(View v) {
        int point = 3;
        scoreB = scoreB + point;
        showScoreB(scoreB);
    }

    public void add_2_pointB(View v) {
        int point = 2;
        scoreB = scoreB + point;
        showScoreB(scoreB);
    }

    public void add_1_pointB(View v) {
        int point = 1;
        scoreB = scoreB + point;
        showScoreB(scoreB);
    }

    public void showScoreB(int score) {
        TextView scoreBTextView = (TextView) findViewById(R.id.scoreB);
        scoreBTextView.setText(String.valueOf(score));
    }

    public void resetScore(View v) {
        scoreA = 0;
        scoreB = 0;
        showScoreA(scoreA);
        showScoreB(scoreB);
    }
}
