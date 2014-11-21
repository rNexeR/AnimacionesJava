package raim.game.animations;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class PersonajeAnimado extends Actor{
	ArrayList<Image>images;
	int dibujoActual;
	//int llamadasAct = 0;
	float tiempoAct = 0;
	
	PersonajeAnimado(){
		super();
		images = new ArrayList<Image>();
		images.add(new Image(new Texture("run01.png")));
		images.add(new Image(new Texture("run02.png")));
		images.add(new Image(new Texture("run03.png")));
		dibujoActual = 0;
	}
	
	@Override
	public void act(float delta){
		super.act(delta);
		
		tiempoAct += delta;
		
		if (tiempoAct >  0.1f){
			dibujoActual++;
			tiempoAct = 0;			
		}
		

		if(dibujoActual >= images.size())
			dibujoActual = 0;
		System.out.println(tiempoAct);
		//++llamadasAct;
	}
	
	@Override
	public void draw(Batch batch, float parentAlpha){
		super.draw(batch, parentAlpha);
		images.get(dibujoActual).draw(batch, parentAlpha);
	}
}
