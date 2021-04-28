package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incThreePointsForFirstTeam(View view) {
        teamAScore += 3;
        displayTeamAScore(teamAScore);
    }

    public void incTwoPointsForFirstTeam(View view) {
        teamAScore += 2;
        displayTeamAScore(teamAScore);
    }

    public void incOnePointForFirstTeam(View view) {
        teamAScore++;
        displayTeamAScore(teamAScore);
    }

    public void displayTeamAScore(int score){
        TextView teamAScoreTV = (TextView) findViewById(R.id.team_A_score);
        teamAScoreTV.setText(String.valueOf(score));
    }

    public void incThreePointsForSecondTeam(View view) {
        teamBScore += 3;
        displayTeamBScore(teamBScore);
    }

    public void incTwoPointsForSecondTeam(View view) {
        teamBScore += 2;
        displayTeamBScore(teamBScore);
    }

    public void incOnePointForSecondTeam(View view) {
        teamBScore++;
        displayTeamBScore(teamBScore);
    }

    public void displayTeamBScore(int score){
        TextView teamBScoreTV = (TextView) findViewById(R.id.team_B_score);
        teamBScoreTV.setText(String.valueOf(score));
    }

    public void resetScore(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayTeamAScore(teamAScore);
        displayTeamBScore(teamBScore);
    }
}