package ch.epfl.cs107.play.game.icwars.actor.players;

import ch.epfl.cs107.play.game.areagame.Area;
import ch.epfl.cs107.play.game.icwars.actor.ICWarsActor;
import ch.epfl.cs107.play.game.icwars.actor.Unit;
import ch.epfl.cs107.play.math.DiscreteCoordinates;

public class ICWarsPlayer extends ICWarsActor{
	
	
    public int hp ;

    int nbrUnit ;
    
	public ICWarsPlayer(Area area, DiscreteCoordinates position, faction faction, Unit... unit) {
		super(area, position, faction);
		
		// TODO Auto-generated constructor stub
		
		this.nbrUnit = unit.length;

/////////////////
	}
	

	 public void update(float deltaTime) { ///////////////////////
		 if ( hp == 0 ) { ;}}
     	 
	    public void centerCamera() {
	        getOwnerArea().setViewCandidate(this);
	    }
	    
		@Override
		public boolean takeCellSpace() {
			return false;
		}
				
		
		public boolean lost() {
			if ( nbrUnit == 0) {return true;}
			return false;
		}
		

		}



