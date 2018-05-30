package com.example.android.courtcounter;

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
    int scoreKeeperA = 0;
    int scoreKeeperB = 0;

    public void scoreThreeA(View view) {
        scoreKeeperA = scoreKeeperA + 3;
        displayForTeamA(scoreKeeperA);
    }

    public void scoreTwoA(View view) {
        scoreKeeperA = scoreKeeperA + 2;
        displayForTeamA(scoreKeeperA);
    }

    public void freeThrowA(View view) {
        scoreKeeperA = scoreKeeperA + 1;
        displayForTeamA(scoreKeeperA);
    }

    public void scoreThreeB(View view) {
        scoreKeeperB = scoreKeeperB + 3;
        displayForTeamB(scoreKeeperB);
    }

    public void scoreTwoB(View view) {
        scoreKeeperB = scoreKeeperB + 2;
        displayForTeamB(scoreKeeperB);
    }

    public void freeThrowB(View view) {
        scoreKeeperB = scoreKeeperB + 1;
        displayForTeamB(scoreKeeperB);
    }
     public void reset(View view){
        scoreKeeperA = 0;
        scoreKeeperB = 0;
        displayForTeamA(scoreKeeperA);
        displayForTeamB(scoreKeeperB);
     }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
