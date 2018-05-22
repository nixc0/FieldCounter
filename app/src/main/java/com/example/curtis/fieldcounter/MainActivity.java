package com.example.curtis.fieldcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreHomeTeam = 0;
    int scoreAwayTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase home team's score by 6
     */
    public void touchdownForHomeTeam(View v) {
        scoreHomeTeam += 6;
        displayForHome(scoreHomeTeam);
    }

    /**
     * Increase home team's score by 3
     */
    public void fieldgoalForHomeTeam(View v) {
        scoreHomeTeam += 3;
        displayForHome(scoreHomeTeam);
    }


    /**
     * Increase home team's score by 2
     */
    public void twoPointsForHomeTeam(View v) {
        scoreHomeTeam += 2;
        displayForHome(scoreHomeTeam);
    }

    /**
     * Increase home team's score by 1
     */
    public void onePointForHomeTeam(View v) {
        scoreHomeTeam += 1;
        displayForHome(scoreHomeTeam);
    }


    /**
     * Displays the given score for the home team.
     */
    public void displayForHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase Away team's score by 6
     */
    public void touchdownForAwayTeam(View v) {
        scoreAwayTeam += 6;
        displayForAway(scoreAwayTeam);
    }

    /**
     * Increase Away team's score by 3
     */
    public void fieldgoalForAwayTeam(View v) {
        scoreAwayTeam += 3;
        displayForAway(scoreAwayTeam);
    }


    /**
     * Increase Away team's score by 2
     */
    public void twoPointsForAwayTeam(View v) {
        scoreAwayTeam += 2;
        displayForAway(scoreAwayTeam);
    }

    /**
     * Increase Away team's score by 1
     */
    public void onePointForAwayTeam(View v) {
        scoreAwayTeam += 1;
        displayForAway(scoreAwayTeam);
    }


    /**
     * Displays the given score for the Home team.
     */
    public void displayForAway(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets the score for home and away team.
     */
    public void resetButton(View V){
        int scoreHomeTeam = 0;
        int scoreAwayTeam = 0;
        displayForHome(scoreHomeTeam);
        displayForAway(scoreAwayTeam);

    }
}
