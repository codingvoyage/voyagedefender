
package com.codingvoyage.voyagedefender.main;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.codingvoyage.voyagedefender.main.VoyageDefender;

/**
 * @author Brian Yang
 * @author Edmund Qiu
 * The main activity for the Android app
 */
public class MainActivity extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new VoyageDefender(), config);
	}
}
