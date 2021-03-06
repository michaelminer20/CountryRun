package com.honeylight.countryrun.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.honeylight.countryrun.R;
import com.honeylight.countryrun.characters.Player;
import com.honeylight.countryrun.listeners.activity_menu.GameOnClickListener;
import com.honeylight.countryrun.ui.GameUi;
import com.honeylight.countryrun.utils.Constants;
import com.honeylight.countryrun.utils.RepeatListener;

public class Game extends AppCompatActivity
{
    public static Player testPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        GameUi ui = new GameUi();

        ui.btnGameUp = (Button) findViewById(R.id.btnGameUp);
        ui.btnGameUp.setOnTouchListener(new RepeatListener(Constants.INITIAL_INTERVAL, Constants.REPEAT_INTERVAL, new GameOnClickListener()));

        ui.btnGameDown = (Button) findViewById(R.id.btnGameDown);
        ui.btnGameDown.setOnTouchListener(new RepeatListener(Constants.INITIAL_INTERVAL, Constants.REPEAT_INTERVAL, new GameOnClickListener()));

        ui.btnGameLeft = (Button) findViewById(R.id.btnGameLeft);
        ui.btnGameLeft.setOnTouchListener(new RepeatListener(Constants.INITIAL_INTERVAL, Constants.REPEAT_INTERVAL, new GameOnClickListener()));

        ui.btnGameRight = (Button) findViewById(R.id.btnGameRight);
        ui.btnGameRight.setOnTouchListener(new RepeatListener(Constants.INITIAL_INTERVAL, Constants.REPEAT_INTERVAL, new GameOnClickListener()));

        ui.btnGameUR = (Button) findViewById(R.id.btnGameUR);
        ui.btnGameUR.setOnTouchListener(new RepeatListener(Constants.INITIAL_INTERVAL, Constants.REPEAT_INTERVAL, new GameOnClickListener()));

        ui.btnGameDR= (Button) findViewById(R.id.btnGameDR);
        ui.btnGameDR.setOnTouchListener(new RepeatListener(Constants.INITIAL_INTERVAL, Constants.REPEAT_INTERVAL, new GameOnClickListener()));

        ui.btnGameUL = (Button) findViewById(R.id.btnGameUL);
        ui.btnGameUL.setOnTouchListener(new RepeatListener(Constants.INITIAL_INTERVAL, Constants.REPEAT_INTERVAL, new GameOnClickListener()));

        ui.btnGameDL = (Button) findViewById(R.id.btnGameDL);
        ui.btnGameDL.setOnTouchListener(new RepeatListener(Constants.INITIAL_INTERVAL, Constants.REPEAT_INTERVAL, new GameOnClickListener()));

        testPlayer = (Player) findViewById(R.id.testPlayer);
    }
}
