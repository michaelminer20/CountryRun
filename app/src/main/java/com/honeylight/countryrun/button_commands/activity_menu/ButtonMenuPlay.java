package com.honeylight.countryrun.button_commands.activity_menu;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;

import com.honeylight.countryrun.activities.Game;
import com.honeylight.countryrun.activities.Menu;

/**
 * Command for btnMenuPlay
 */
public class ButtonMenuPlay
{
    public void start()
    {
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setClass(Menu.mmContext, Game.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Menu.mmContext.startActivity(intent);
            }
        });
    }
}
