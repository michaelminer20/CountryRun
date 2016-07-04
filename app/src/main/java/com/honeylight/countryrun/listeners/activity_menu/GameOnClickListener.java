package com.honeylight.countryrun.listeners.activity_menu;

import android.view.MotionEvent;
import android.view.View;

import com.honeylight.countryrun.R;
import com.honeylight.countryrun.activities.Game;

/**
 * OnClickListener for main menu
 */
public class GameOnClickListener implements View.OnHoverListener
{
    @Override
    public boolean onHover(View v, MotionEvent event)
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
                Game.testPlayer.moveLeft();
                break;

            case R.id.btnGameRight:
                Game.testPlayer.moveRight();
                break;
        }

        return false;
    }
}
