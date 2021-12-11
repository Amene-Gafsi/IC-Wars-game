package ch.epfl.cs107.play.game.icwars.area;

import ch.epfl.cs107.play.game.areagame.AreaBehavior;
import ch.epfl.cs107.play.game.areagame.actor.Interactable;
import ch.epfl.cs107.play.game.areagame.handler.AreaInteractionVisitor;
import ch.epfl.cs107.play.game.tutosSolution.Tuto2Behavior.Tuto2Cell;
import ch.epfl.cs107.play.game.tutosSolution.Tuto2Behavior.Tuto2CellType;
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
	 
		public static ICWarsCellType toType(int type){
			for(ICWarsCellType ict : ICWarsCellType.values()){
				if(ict.type == type)
					return ict;
			}
			// When you add a new color, you can print the int value here before assign it to a type
			System.out.println(type);
			return NONE;
		}
	}
	  
		public ICWarsBehavior(Window window, String name) {
		super(window, name);
		// TODO Auto-generated constructor stub
		int height = getHeight();
		int width = getWidth();
		for(int y = 0; y < height; y++) {
			for (int x = 0; x < width ; x++) {
				ICWarsCellType color = ICWarsCellType.toType(getRGB(height-1-y, x));
				setCell(x,y, new ICWarsCell(x,y,color));
			}
		}
	}

		public class ICWarsCell extends AreaBehavior.Cell {
			
			private final ICWarsCellType type;

			public ICWarsCell(int x, int y, ICWarsCellType type) {
				super(x, y);
				// TODO Auto-generated constructor stub
				this.type = type;	
			}
			
			@Override
			public boolean isCellInteractable() {
				// TODO Auto-generated method stub
				return true;
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
				return true;
			}

			@Override
			protected boolean canEnter(Interactable entity) {
				// TODO Auto-generated method stub
				
				for (Interactable element : entities ) {
					if (element.takeCellSpace()&& entity.takeCellSpace()) {
						return false;
					}
				}

				return true;
			}

			public ICWarsCellType getType() {
				return type;
			}
			
			
		}
		
		

}			