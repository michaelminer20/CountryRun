package com.honeylight.countryrun.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.honeylight.countryrun.R;
import com.honeylight.countryrun.listeners.activity_menu.MenuOnClickListener;
import com.honeylight.countryrun.ui.MenuUi;

public class Menu extends AppCompatActivity
{
    MenuUi ui;
    public static Context mmContext;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mmContext = getApplicationContext();

        ui = new MenuUi();

        ui.btnMenuPlay = (Button) findViewById(R.id.btnMenuPlay);
        ui.btnMenuPlay.setOnClickListener(new MenuOnClickListener());
    }
}
