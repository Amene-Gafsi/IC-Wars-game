package ch.epfl.cs107.play.game.icwars.actor;

import java.awt.Color;

import ch.epfl.cs107.play.game.actor.TextGraphics;
import ch.epfl.cs107.play.game.areagame.actor.Sprite;
import ch.epfl.cs107.play.math.Vector;

public class Soldat extends Unit {
	int rayon = 2 ;
	int damage = 2 ;
	int Hp =5;
	int maxHp=5;
	

	public Soldat (int aire, Vector position, String faction) {
		

		Sprite sprite = new Sprite(faction , 1.5f, 1.5f, this , null , new Vector(-0.25f, -0.25f));

	}
	

}
