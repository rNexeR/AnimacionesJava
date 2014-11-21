package raim.game.animations;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Animaciones extends ApplicationAdapter {
	Stage stag;
	
	@Override
	public void create () {
		stag = new Stage();
		Gdx.input.setInputProcessor(stag);
		stag.addActor(new PersonajeAnimado());
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stag.draw();
		stag.act();
		//stag.getActors()
		
	}
}
