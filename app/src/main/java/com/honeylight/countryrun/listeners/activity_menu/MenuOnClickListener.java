package com.honeylight.countryrun.listeners.activity_menu;

import android.view.View;

import com.honeylight.countryrun.R;
import com.honeylight.countryrun.button_commands.activity_menu.ButtonMenuPlay;

/**
 * OnClickListener for main menu
 */
public class MenuOnClickListener implements View.OnClickListener
{
    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnMenuPlay:
                ButtonMenuPlay btnMenuPlayCommand = new ButtonMenuPlay();
                btnMenuPlayCommand.start();
                break;

            case R.id.btnMenuSettings:

                break;

            case R.id.btnMenuScoreboard:

                break;
        }
    }
}
