package ch.epfl.cs107.play.game.icwars.actor.players;

import ch.epfl.cs107.play.game.areagame.Area;
import ch.epfl.cs107.play.game.areagame.actor.Orientation;
import ch.epfl.cs107.play.game.areagame.actor.Sprite;
import ch.epfl.cs107.play.game.icwars.actor.Unit;
import ch.epfl.cs107.play.math.DiscreteCoordinates;
import ch.epfl.cs107.play.window.Button;
import ch.epfl.cs107.play.window.Canvas;
import ch.epfl.cs107.play.window.Keyboard;


public class RealPlayer extends ICWarsPlayer{


    private final static int MOVE_DURATION = 8;
	 
    String spriteName;
    Sprite sprite;
	
	public RealPlayer(Area area, DiscreteCoordinates position, faction faction, Unit... unit) {
		super(area, position, faction, unit);
		// TODO Auto-generated constructor stub
		
		if (faction== ch.epfl.cs107.play.game.icwars.actor.ICWarsActor.faction.ENNEMY) {
		spriteName ="icwars/enemyCursor"  ;}
		if (faction==ch.epfl.cs107.play.game.icwars.actor.ICWarsActor.faction.ALLY) {
		spriteName ="icwars/allyCursor"   ;}
		
		
	    sprite = new Sprite(spriteName,1.f ,1.f ,this );
		
	}
	 public void update() {
			Keyboard keyboard= getOwnerArea().getKeyboard();
			
			moveIfPressed(Orientation.LEFT, keyboard.get(Keyboard.LEFT));
            moveIfPressed(Orientation.UP, keyboard.get(Keyboard.UP));
            moveIfPressed(Orientation.RIGHT, keyboard.get(Keyboard.RIGHT));
            moveIfPressed(Orientation.DOWN, keyboard.get(Keyboard.DOWN));
          
	       
	    }
	 
	    private void moveIfPressed(Orientation orientation, Button b){
	        if(b.isDown()) {
	            if (!isDisplacementOccurs()) {
	                orientate(orientation);
	                move(MOVE_DURATION);
	            }
	        }
	    }
	    
		public void draw(Canvas canvas) {
			sprite.draw(canvas);	
		}


}
