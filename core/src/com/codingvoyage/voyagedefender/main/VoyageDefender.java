
package com.codingvoyage.voyagedefender.main;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.codingvoyage.voyagedefender.global.Util;

/**
 * VoyageDefender
 * @author Brian Yang
 * @author Edmund Qiu
 *
 * A twist on the classic space invaders game
 */
public class VoyageDefender extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
        Util.FONT.draw(batch, "VoyageDefender by CodingVoyage. Coming Soon!", 500, 500);
		batch.end();
	}
}
