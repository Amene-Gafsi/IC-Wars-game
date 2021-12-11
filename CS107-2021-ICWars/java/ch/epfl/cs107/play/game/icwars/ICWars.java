package ch.epfl.cs107.play.game.icwars;

import ch.epfl.cs107.play.game.areagame.AreaGame;
import ch.epfl.cs107.play.game.tutosSolution.area.tuto2.Ferme;
import ch.epfl.cs107.play.game.tutosSolution.area.tuto2.Village;

public class ICWars extends AreaGame {
	
	public final static float CAMERA_SCALE_FACTOR = 10.f;	
	
	private void createAreas(){

		addArea(new Ferme());
		addArea(new Village());

	}

	
    @Override
	public void update(float deltaTime) {
	  super.update(deltaTime) ; 
    } 
    
    
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		String ICWars = "ICWars";
		
		
		
		return ICWars;
	}

	
	
	
}
