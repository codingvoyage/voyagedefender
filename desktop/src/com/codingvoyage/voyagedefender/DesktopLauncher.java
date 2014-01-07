
package com.codingvoyage.voyagedefender;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

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
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new VoyageDefender(), config);
	}
}
