package com.example.cs498teamassign5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameHistoryActivity extends Activity implements View.OnClickListener {
    private static final int MAIN_ACTIVITY_REQUEST = 1;
    private GameInfo gameInfo;
    private String myTeamName;
    private String opposeTeamName;
    private String playerName;
    private int myTeamScore;
    private int opposingTeamScore;
    private int myTeamRebound;
    private int opposingTeamRebound;
    private int myTeamFoul;
    private int opposingTeamFoul;
    private int myTeamTurnover;
    private int opposingTeamTurnover;
    private int playerScore;
    private int othersInTeamScore;
    private int playerRebound;
    private int othersInTeamRebound;
    private int playerFoul;
    private int othersInTeamFoul;
    private int playerTurnover;
    private int othersInTeamTurnover;


    private double myTeamScaleScore;
    private double opposingTeamScaleScore;
    private double myTeamScaleRebound;
    private double opposingTeamScaleRebound;
    private double myTeamScaleFoul;
    private double opposingTeamScaleFoul;
    private double myTeamScaleTurnover;
    private double opposingTeamScaleTurnover;
    private double playerScaleScore;
    private double othersInTeamScaleScore;
    private double playerScaleRebound;
    private double othersInTeamScaleRebound;
    private double playerScaleFoul;
    private double othersInTeamScaleFoul;
    private double playerScaleTurnover;
    private double othersInTeamScaleTurnover;
<<<<<<< HEAD
    
    private static final double barWidth = 160.0;
    
=======

    private static final double barWidth = 160.0;

>>>>>>> 334d1b4ef59846070b2bb4a5282a7d648e58faf6


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_history);

        Intent intent = getIntent();
        Bundle gameHistInfo = intent.getExtras();
        gameInfo = (GameInfo) gameHistInfo.getSerializable("gameInfo");
        myTeamName = (String) gameHistInfo.getString("myTeamName");
        opposeTeamName = (String) gameHistInfo.getString("opposingTeamName");
        playerName = (String) gameHistInfo.getString("playerName");

        updatePlayerStats();
    }

    public void onClick(View v) {

    }

    public void updatePlayerStats(){
<<<<<<< HEAD

        // Team Name and Player Name
        TextView myTeamLabel = (TextView) findViewById(R.id.myTeamLabel);
        myTeamLabel.setText(myTeamName);

        TextView opposeTeamLabel = (TextView) findViewById(R.id.opposeTeamLabel);
        opposeTeamLabel.setText(opposeTeamName);

        TextView teamALabel = (TextView) findViewById(R.id.teamALabel);
        teamALabel.setText(myTeamName);

        TextView teamBLabel = (TextView) findViewById(R.id.teamBLabel);
        teamBLabel.setText(opposeTeamName);

        TextView playerALabel = (TextView) findViewById(R.id.playerALabel);
        playerALabel.setText(playerName);

=======

        // Team Name and Player Name
        TextView myTeamLabel = (TextView) findViewById(R.id.myTeamLabel);
        myTeamLabel.setText(myTeamName);

        TextView opposeTeamLabel = (TextView) findViewById(R.id.opposeTeamLabel);
        opposeTeamLabel.setText(opposeTeamName);

        TextView teamALabel = (TextView) findViewById(R.id.teamALabel);
        teamALabel.setText(myTeamName);

        TextView teamBLabel = (TextView) findViewById(R.id.teamBLabel);
        teamBLabel.setText(opposeTeamName);

        TextView playerALabel = (TextView) findViewById(R.id.playerALabel);
        playerALabel.setText(playerName);

>>>>>>> 334d1b4ef59846070b2bb4a5282a7d648e58faf6
        // Game Score
        myTeamScore = gameInfo.myTeamScore();
        TextView playerPoints = (TextView) findViewById(R.id.myTeamScore);
        playerPoints.setText(Integer.toString(myTeamScore));

        opposingTeamScore = gameInfo.opposingTeamScore();
        TextView opposingTeamPoints = (TextView) findViewById(R.id.opposeTeamScore);
        opposingTeamPoints.setText(Integer.toString(opposingTeamScore));

        // Detail Game Score
        TextView ourTeamPointLabel = (TextView) findViewById(R.id.ourTeamPointLabel);
        ourTeamPointLabel.setText(Integer.toString(myTeamScore));

        TextView opposeTeamPointLabel = (TextView) findViewById(R.id.opposeTeamPointLabel);
        opposeTeamPointLabel.setText(Integer.toString(opposingTeamScore));

        myTeamRebound = gameInfo.myTeamRebound();
        TextView ourTeamReboundLabel = (TextView) findViewById(R.id.ourTeamReboundLabel);
        ourTeamReboundLabel.setText(Integer.toString(myTeamRebound));

        opposingTeamRebound = gameInfo.opposingTeamRebound();
        TextView opposeTeamReboundLabel = (TextView) findViewById(R.id.opposeTeamReboundLabel);
        opposeTeamReboundLabel.setText(Integer.toString(opposingTeamRebound));

        myTeamFoul = gameInfo.myTeamFoul();
        TextView ourTeamFoulLabel = (TextView) findViewById(R.id.ourTeamFoulLabel);
        ourTeamFoulLabel.setText(Integer.toString(myTeamFoul));

        opposingTeamFoul = gameInfo.opposingTeamFoul();
        TextView opposeTeamFoulLabel = (TextView) findViewById(R.id.opposeTeamFoulLabel);
        opposeTeamFoulLabel.setText(Integer.toString(opposingTeamFoul));

        myTeamTurnover = gameInfo.myTeamTurnover();
        TextView ourTeamTurnoverLabel = (TextView) findViewById(R.id.ourTeamTurnoverLabel);
        ourTeamTurnoverLabel.setText(Integer.toString(myTeamTurnover));

        opposingTeamTurnover = gameInfo.opposingTeamTurnover();
        TextView opposeTeamTurnoverLabel = (TextView) findViewById(R.id.opposeTeamTurnoverLabel);
        opposeTeamTurnoverLabel.setText(Integer.toString(opposingTeamTurnover));

        playerScore = gameInfo.myPlayerScore();
        TextView ourPlayerPointLabel = (TextView) findViewById(R.id.ourPlayerPointLabel);
        ourPlayerPointLabel.setText(Integer.toString(playerScore));

        othersInTeamScore = gameInfo.myTeamScore() - gameInfo.myPlayerScore();
        TextView opposePlayerPointLabel = (TextView) findViewById(R.id.opposePlayerPointLabel);
        opposePlayerPointLabel.setText(Integer.toString(othersInTeamScore));

        playerRebound = gameInfo.myPlayerRebound();
        TextView ourPlayerReboundLabel = (TextView) findViewById(R.id.ourPlayerReboundLabel);
        ourPlayerReboundLabel.setText(Integer.toString(playerRebound));

        othersInTeamRebound = gameInfo.myTeamRebound() - gameInfo.myPlayerRebound();
        TextView opposePlayerReboundLabel = (TextView) findViewById(R.id.opposePlayerReboundLabel);
        opposePlayerReboundLabel.setText(Integer.toString(othersInTeamRebound));

        playerFoul = gameInfo.myPlayerFoul();
        TextView ourPlayerFoulLabel = (TextView) findViewById(R.id.ourPlayerFoulLabel);
        ourPlayerFoulLabel.setText(Integer.toString(playerFoul));

        othersInTeamFoul = gameInfo.myTeamFoul() - gameInfo.myPlayerFoul();
        TextView opposePlayerFoulLabel = (TextView) findViewById(R.id.opposePlayerFoulLabel);
        opposePlayerFoulLabel.setText(Integer.toString(othersInTeamFoul));

        playerTurnover = gameInfo.myPlayerTurnover();
        TextView ourPlayerTurnoverLabel = (TextView) findViewById(R.id.ourPlayerTurnoverLabel);
        ourPlayerTurnoverLabel.setText(Integer.toString(playerTurnover));

        othersInTeamTurnover = gameInfo.myTeamTurnover() - gameInfo.myPlayerTurnover();
        TextView opposePlayerTurnoverLabel = (TextView) findViewById(R.id.opposePlayerTurnoverLabel);
        opposePlayerTurnoverLabel.setText(Integer.toString(othersInTeamTurnover));


        // detail Bar
        myTeamScaleScore = ((double) (myTeamScore) / (double) (myTeamScore + opposingTeamScore)) * barWidth;
        setGraphBar(R.id.ourTeamPointBar, myTeamScaleScore);
<<<<<<< HEAD
    }
    
    private void setGraphBar(int viewID, double newWidth) {
        View view = findViewById(viewID);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) newWidth;
        view.setLayoutParams(layoutParams);
    }
=======
    }

    private void setGraphBar(int viewID, double newWidth) {
        View view = findViewById(viewID);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) newWidth;
        view.setLayoutParams(layoutParams);
    }
>>>>>>> 334d1b4ef59846070b2bb4a5282a7d648e58faf6


}