package ch.epfl.cs107.play.game.icwars.actor;

import ch.epfl.cs107.play.game.areagame.actor.Sprite;
import ch.epfl.cs107.play.math.Vector;

public class Tank extends Unit {

	int rayon = 4 ;
	int damage = 7 ;
	int Hp = 10;
	int maxHp=10 ;
	
	
	public Tank (int aire, Vector position, String faction) {

		Sprite sprite = new Sprite(faction , 1.5f, 1.5f, this , null , new Vector(-0.25f, -0.25f));

	}
}

