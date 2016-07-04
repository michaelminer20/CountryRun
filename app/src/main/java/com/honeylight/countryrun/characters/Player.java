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
    float distance = Constants.MOVE_DISTANCE, diagonalDistance = Constants.MOVE_DIAGONAL_DISTANCE;

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
        animate().translationY(getTranslationY() - distance);
    }

    public void moveDown()
    {
        animate().translationY(getTranslationY() + distance);
    }

    public void moveLeft()
    {
        animate().translationX(getTranslationX() - distance);
    }

    public void moveRight()
    {
        animate().translationX(getTranslationX() + distance);
    }

    public void moveUR()
    {
        for (int i = 0; i < 30; i++)
        {
            animate().translationY(getTranslationY() - diagonalDistance).setDuration(1);
            animate().translationX(getTranslationX() + diagonalDistance).setDuration(1);
        }
    }

    public void moveDR()
    {
        for (int i = 0; i < 30; i++)
        {
            animate().translationY(getTranslationY() + diagonalDistance).setDuration(1);
            animate().translationX(getTranslationX() + diagonalDistance).setDuration(1);
        }
    }

    public void moveUL()
    {
        for (int i = 0; i < 30; i++)
        {
            animate().translationY(getTranslationY() - diagonalDistance).setDuration(1);
            animate().translationX(getTranslationX() - diagonalDistance).setDuration(1);
        }
    }

    public void moveDL()
    {
        for (int i = 0; i < 30; i++)
        {
            animate().translationY(getTranslationY() + diagonalDistance).setDuration(1);
            animate().translationX(getTranslationX() - diagonalDistance).setDuration(1);
        }
    }
}
