package com.example.android.footballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int a_score = 0, b_score = 0, a_fouls = 0, b_fouls = 0, a_corners = 0, b_corners = 0;

    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void displayFoulsForTeamA(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_a_fouls);
        foulsView.setText(String.valueOf(fouls));
    }


    public void displayFoulsForTeamB(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_b_fouls);
        foulsView.setText(String.valueOf(fouls));
    }


    public void displayCornersForTeamA(int corners) {
        TextView cornersView = (TextView) findViewById(R.id.team_a_corners);
        cornersView.setText(String.valueOf(corners));
    }


    public void displayCornersForTeamB(int corners) {
        TextView cornersView = (TextView) findViewById(R.id.team_b_corners);
        cornersView.setText(String.valueOf(corners));
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    public void increment_score_by_1(View view) {
        if (view.getTag().equals("team_a"))
            displayScoreForTeamA(++a_score);
        else
            displayScoreForTeamB(++b_score);
    }

    public void increment_fouls_by_1(View view) {
        if (view.getTag().equals("team_a"))
            displayFoulsForTeamA(++a_fouls);
        else
            displayFoulsForTeamB(++b_fouls);
    }

    public void increment_corners_by_1(View view) {
        if (view.getTag().equals("team_a"))
            displayCornersForTeamA(++a_corners);
        else
            displayCornersForTeamB(++b_corners);
    }

    public void reset_scores(View view) {
        a_score = b_score = a_fouls = b_fouls = a_corners = b_corners = 0;
        displayScoreForTeamA(a_score);
        displayScoreForTeamB(b_score);
        displayFoulsForTeamA(a_fouls);
        displayFoulsForTeamB(b_fouls);
        displayCornersForTeamA(a_corners);
        displayCornersForTeamB(b_corners);
    }
}