package ch.epfl.cs107.play.game.icwars.actor;

import ch.epfl.cs107.play.game.areagame.Area;
import ch.epfl.cs107.play.game.areagame.actor.Sprite;
import ch.epfl.cs107.play.math.DiscreteCoordinates;
import ch.epfl.cs107.play.math.Vector;
import ch.epfl.cs107.play.window.Canvas;

public class Tank extends Unit {
	
	int rayon = 4 ;
	int damage = 7 ;
	int Hp = 10;
	int maxHp=10 ;
	String nomDuSprite ;

	
	public Tank(Area area, DiscreteCoordinates position, faction faction) {
		super(area, position, faction);
		// TODO Auto-generated constructor stub
		
		if (faction==ICWarsActor.faction.ENNEMY) {
		nomDuSprite ="icwars/enemyTank"   ;}
		if (faction==ICWarsActor.faction.ALLY) {
		nomDuSprite ="icwars/friendlyTank"   ;}
		
		setSprite ( new Sprite(nomDuSprite , 1.5f, 1.5f, this , null , new Vector(-0.25f, -0.25f)));
	}
	
	public void draw(Canvas canvas) {
		sprite.draw(canvas);	
	}


	
}

