package com.honeylight.countryrun.listeners.activity_menu;

import android.view.View;

import com.honeylight.countryrun.R;
import com.honeylight.countryrun.activities.Game;

/**
 * OnClickListener for main menu
 */
public class GameOnClickListener implements View.OnClickListener
{
    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnGameUp:
                Game.testPlayer.moveUp();
                break;

            case R.id.btnGameDown:
                Game.testPlayer.moveDown();
                break;

            case R.id.btnGameLeft:

                break;

            case R.id.btnGameRight:

                break;
        }
    }
}
