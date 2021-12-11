package ch.epfl.cs107.play.game.icwars.actor;

import java.util.Collections;
import java.util.List;

import ch.epfl.cs107.play.game.actor.TextGraphics;
import ch.epfl.cs107.play.game.areagame.Area;
import ch.epfl.cs107.play.game.areagame.actor.MovableAreaEntity;
import ch.epfl.cs107.play.game.areagame.actor.Orientation;
import ch.epfl.cs107.play.game.areagame.actor.Sprite;
import ch.epfl.cs107.play.game.areagame.handler.AreaInteractionVisitor;
import ch.epfl.cs107.play.math.DiscreteCoordinates;
import ch.epfl.cs107.play.window.Canvas;

public class ICWarsActor extends MovableAreaEntity {
	private TextGraphics message;
	private Sprite sprite;
    
	public ICWarsActor(Area area, DiscreteCoordinates position, faction faction) {
		super(area, Orientation.UP , position);
		// TODO Auto-generated constructor stub
		/////////////
	}
	
	 public enum faction {
		    ALLY,
		    ENNEMY;			 
	 }
	 
	    public void leaveArea(){
	        getOwnerArea().unregisterActor(this);
	    }
	 
	    public void enterArea(Area area, DiscreteCoordinates position){
	        area.registerActor(this);
	        setOwnerArea(area);
	        setCurrentPosition(position.toVector());
	    }

	    
	    
	@Override
	public List<DiscreteCoordinates> getCurrentCells() {
		// TODO Auto-generated method stub
		return Collections.singletonList(getCurrentMainCellCoordinates());
	}

	@Override
	public boolean takeCellSpace() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCellInteractable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isViewInteractable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void acceptInteraction(AreaInteractionVisitor v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Canvas canvas) {
		// TODO Auto-generated method stub
		sprite.draw(canvas);	
		message.draw(canvas);
	}


	 

}
