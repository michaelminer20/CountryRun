package com.honeylight.countryrun.characters;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.honeylight.countryrun.utils.Constants;

/**
 * Class for the player that runs the maze
 */
public class Player extends ImageView
{
    float distance = Constants.MOVE_DISTANCE;

    public Player(Context context) {
        super(context);
    }

    public Player(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Player(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void moveUp()
    {
        animate().translationY(getTranslationY() - distance).setDuration(1000);
    }

    public void moveDown()
    {
        animate().translationY(getTranslationY() + distance).setDuration(1000);
    }

    public void moveLeft()
    {

    }

    public void moveRight()
    {

    }
}
