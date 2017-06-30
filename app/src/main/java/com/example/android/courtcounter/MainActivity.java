package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity{
        int scoreTeamA = 0;
        int scoreTeamB = 0;
        int tennisScoreTeamA = 0;
        int tennisScoreTeamB = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayTennisForTeamA(scoreTeamA);
    }


    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayTennisForTeamB(scoreTeamB);
    }


    /**
     * Reset all scores
     */
    public void reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTennisForTeamA(scoreTeamB);
        displayTennisForTeamB(scoreTeamA);
    }


    public void displayForTeamB(int score) {

    }


    /**
     * Displays the actual tennis score for Team A.
     */


    public void displayTennisForTeamA(int score) {

        TextView scoreView3 = (TextView) findViewById(R.id.total_hits);
        scoreView3.setText(String.valueOf(scoreTeamA+scoreTeamB));

        if (score == 0) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_tennis_score);
            scoreView.setText(String.valueOf(0));
        } else if (score == 1) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_tennis_score);
            scoreView.setText(String.valueOf(15));
        } else if(score == 2) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_tennis_score);
            scoreView.setText(String.valueOf(30));
        }  else if((score == 3) && (scoreTeamB!=score)) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_tennis_score);
            scoreView.setText(String.valueOf(40));
        }

        else if((score > 2)&& (scoreTeamB==score)){
            TextView scoreView = (TextView) findViewById(R.id.team_a_tennis_score);
            scoreView.setText(String.valueOf("Deuce"));
            TextView scoreView2 = (TextView) findViewById(R.id.team_b_tennis_score);
            scoreView2.setText(String.valueOf("Deuce"));
        }

        else if((score > 3)&& (scoreTeamB<score-1)){
            TextView scoreView = (TextView) findViewById(R.id.team_a_tennis_score);
            scoreView.setText(String.valueOf("Win!"));
            TextView scoreView2 = (TextView) findViewById(R.id.team_b_tennis_score);
            scoreView2.setText(String.valueOf("Lose!"));
        }

        else if((score > 3)&& (scoreTeamB==score-1)){
            TextView scoreView = (TextView) findViewById(R.id.team_a_tennis_score);
            scoreView.setText(String.valueOf("Adv."));
            TextView scoreView2 = (TextView) findViewById(R.id.team_b_tennis_score);
            scoreView2.setText(String.valueOf("Disadv."));
        }

        else if((score > 3)&& (scoreTeamB<score-1)){
            TextView scoreView = (TextView) findViewById(R.id.team_a_tennis_score);
            scoreView.setText(String.valueOf("Win!"));
            TextView scoreView2 = (TextView) findViewById(R.id.team_b_tennis_score);
            scoreView2.setText(String.valueOf("Lose!"));
        }
    }


    public void displayTennisForTeamB(int score) {

        TextView scoreView3 = (TextView) findViewById(R.id.total_hits);
        scoreView3.setText(String.valueOf(scoreTeamA+scoreTeamB));

        if (score == 0) {
            TextView scoreView = (TextView) findViewById(R.id.team_b_tennis_score);
            scoreView.setText(String.valueOf(0));

        } else if (score == 1) {
            TextView scoreView = (TextView) findViewById(R.id.team_b_tennis_score);
            scoreView.setText(String.valueOf(15));

        } else if (score == 2) {
            TextView scoreView = (TextView) findViewById(R.id.team_b_tennis_score);
            scoreView.setText(String.valueOf(30));

        } else if ((score == 3) && (scoreTeamA != score)) {
            TextView scoreView = (TextView) findViewById(R.id.team_b_tennis_score);
            scoreView.setText(String.valueOf(40));

        } else if ((score > 2) && (scoreTeamA == score)) {
            TextView scoreView = (TextView) findViewById(R.id.team_b_tennis_score);
            scoreView.setText(String.valueOf("Deuce"));
            TextView scoreView2 = (TextView) findViewById(R.id.team_a_tennis_score);
            scoreView2.setText(String.valueOf("Deuce"));

        } else if ((score > 3) && (scoreTeamA < score - 1)) {
            TextView scoreView = (TextView) findViewById(R.id.team_b_tennis_score);
            scoreView.setText(String.valueOf("Win!"));
            TextView scoreView2 = (TextView) findViewById(R.id.team_a_tennis_score);
            scoreView2.setText(String.valueOf("Lose!"));

        } else if ((score > 3) && (scoreTeamA == score - 1)) {
            TextView scoreView = (TextView) findViewById(R.id.team_b_tennis_score);
            scoreView.setText(String.valueOf("Adv."));
            TextView scoreView2 = (TextView) findViewById(R.id.team_a_tennis_score);
            scoreView2.setText(String.valueOf("Disadv."));

        } else if ((score > 3) && (scoreTeamA < score - 1)) {
            TextView scoreView = (TextView) findViewById(R.id.team_b_tennis_score);
            scoreView.setText(String.valueOf("Win!"));
            TextView scoreView2 = (TextView) findViewById(R.id.team_a_tennis_score);
            scoreView2.setText(String.valueOf("Lose!"));
        }
    }
}