package com.codingvoyage.voyagedefender.global;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

/**
 * Util class
 * @author Brian Yang
 *
 * Stores useful constants that can be used throughout all classes
 */
public final class Util {

    /** Global base package name */
    public static String PACKAGE = "com/codingvoyage/voyagedefender/";

    /** Global font - Roboto Light by Google */
    public static BitmapFont FONT =
            new BitmapFont(Gdx.files.internal("fonts/RobotoLight.fnt"), Gdx.files.internal("fonts/RobotoLight.tga"), false);

}
