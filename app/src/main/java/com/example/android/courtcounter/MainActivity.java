package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0, teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void addThreeForTeamA(View v)
    {
        teamAScore += 3;
        updateScores();
        Log.v("MainActivity", String.valueOf(teamAScore));
    }

    public void addTwoForTeamA(View v)
    {
        teamAScore += 2;
        updateScores();
        Log.v("MainActivity", String.valueOf(teamAScore));
    }

    public void freeThrowTeamA(View v)
    {
        teamAScore += 1;
        updateScores();
        Log.v("MainActivity",  String.valueOf(teamAScore));
    }

    public void addThreeForTeamB(View v)
    {
        teamBScore += 3;
        updateScores();
        Log.v("MainActivity", String.valueOf(teamBScore));
    }

    public void addTwoForTeamB(View v)
    {
        teamBScore += 2;
        updateScores();
        Log.v("MainActivity",  String.valueOf(teamBScore));
    }

    //TEAM B METHODS

    public void freeThrowTeamB(View v)
    {
        teamBScore += 1;
        updateScores();
        Log.v("MainActivity",  String.valueOf(teamBScore));
    }
    public void updateScores()
    {
        TextView teamAScore = (TextView) findViewById(R.id.team_a_score);
        teamAScore.setText(String.valueOf(this.teamAScore));
        TextView teamBScore = (TextView) findViewById(R.id.team_b_score);
        teamBScore.setText(String.valueOf(this.teamBScore));
    }

    public void resetScore(View v)
    {
        teamAScore = 0;
        teamBScore = 0;
        updateScores();
    }


}
