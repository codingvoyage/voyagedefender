
package com.codingvoyage.voyagedefender.main;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.codingvoyage.voyagedefender.main.VoyageDefender;

/**
 * @author Brian Yang
 * @author Edmund Qiu
 * Launches the desktop version of VoyageDefender
 *
 * Because Android requires assets to be in its own directory
 * and we don't want duplicates, please note that the desktop app
 * uses assets from the Android directory.
 */
public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration game = new LwjglApplicationConfiguration();
        game.title = "VoyageDefender 0.0 - Days Before Pre-Alpha";
        game.width = 1280;
        game.height = 720;
		new LwjglApplication(new VoyageDefender(), game);
	}
}
