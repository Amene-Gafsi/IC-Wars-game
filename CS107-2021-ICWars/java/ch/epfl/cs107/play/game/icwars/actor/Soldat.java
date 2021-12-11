package ch.epfl.cs107.play.game.icwars.actor;

import ch.epfl.cs107.play.game.areagame.Area;
import ch.epfl.cs107.play.game.areagame.actor.Sprite;
import ch.epfl.cs107.play.math.DiscreteCoordinates;
import ch.epfl.cs107.play.math.Vector;
import ch.epfl.cs107.play.window.Canvas;

public class Soldat extends Unit {
	
	int rayon = 2 ;
	int damage = 2 ;
	int Hp =5;
	int maxHp=5;
	String nomDuSprite ;
	
	

	
	public Soldat(Area area, DiscreteCoordinates position, faction faction) {
		super(area, position, faction);

		if (faction == ICWarsActor.faction.ENNEMY) {
			nomDuSprite ="icwars/enemySoldier"   ;}
			if (faction == ICWarsActor.faction.ALLY) {
			nomDuSprite ="icwars/friendlySoldier"   ;}
			
		setSprite (new Sprite(nomDuSprite , 1.5f, 1.5f, this , null , new Vector(-0.25f, -0.25f)));
	}
	
	public void draw(Canvas canvas) {
		sprite.draw(canvas);	
	}

}
	


