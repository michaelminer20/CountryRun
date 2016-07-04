package com.honeylight.countryrun.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.honeylight.countryrun.R;
import com.honeylight.countryrun.characters.Player;
import com.honeylight.countryrun.listeners.activity_menu.GameOnClickListener;
import com.honeylight.countryrun.ui.GameUi;

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
        ui.btnGameUp.setOnClickListener(new GameOnClickListener());

        ui.btnGameDown = (Button) findViewById(R.id.btnGameDown);
        ui.btnGameDown.setOnClickListener(new GameOnClickListener());

        testPlayer = (Player) findViewById(R.id.testPlayer);
        testPlayer.moveUp();


    }
}
