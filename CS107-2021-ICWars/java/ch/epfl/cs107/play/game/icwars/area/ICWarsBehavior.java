package ch.epfl.cs107.play.game.icwars.area;

import ch.epfl.cs107.play.game.areagame.AreaBehavior;
import ch.epfl.cs107.play.game.areagame.actor.Interactable;
import ch.epfl.cs107.play.game.areagame.handler.AreaInteractionVisitor;

import ch.epfl.cs107.play.window.Window;

public class ICWarsBehavior extends AreaBehavior{

	public enum ICWarsCellType{
		//https://stackoverflow.com/questions/25761438/understanding-bufferedimage-getrgb-output-values
		NONE(0, 0),
		ROAD(-16777216, 0),
		PLAIN(-14112955, 1),
		WOOD(-65536, 3),
		RIVER(-16776961, 0),
		MOUNTAIN(-256, 4),
		CITY(-1,2);
	

	final int type;
	final int defencestars;

	 ICWarsCellType(int type, int defencestars){
		this.type = type;
		this.defencestars = defencestars;
	}
	}
	  
		public ICWarsBehavior(Window window, String name) {
		super(window, name);
		// TODO Auto-generated constructor stub
	}

		public class ICWarsCell extends AreaBehavior.Cell {

			public ICWarsCell(int x, int y) {
				super(x, y);
				// TODO Auto-generated constructor stub
			}
			
			@Override
			public boolean isCellInteractable() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isViewInteractable() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void acceptInteraction(AreaInteractionVisitor v) {
				// TODO Auto-generated method stub
				
			}

			@Override
			protected boolean canLeave(Interactable entity) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			protected boolean canEnter(Interactable entity) {
				// TODO Auto-generated method stub
				return false;
			}
			
			
		}
		
		

}
			