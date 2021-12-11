package ch.epfl.cs107.play.game.icwars.actor;

import ch.epfl.cs107.play.game.areagame.Area;
import ch.epfl.cs107.play.game.areagame.actor.Sprite;
import ch.epfl.cs107.play.math.DiscreteCoordinates;


public class Unit extends ICWarsActor{

		 public Unit(Area area, DiscreteCoordinates position, faction faction) {
		super(area, position, faction);
		// TODO Auto-generated constructor stub
	}

		 String name ;
		 public int Hp ;
		 int maxHp;
		 int damage;
		 int rayon;
		 Sprite sprite;
		 
		  public String getName (String name) {
			  this.name = name;
			  return name;
		  }
		 
		  public int getHp (int Hp) {
			  this.Hp = Hp;
			  return Hp;
		  }
		  
		  public void setHp (int Hp) {
			  if (Hp >= 0 && Hp <= maxHp) {	  
				  this.Hp = Hp;
			  }
		  }
		 
		  public boolean isdead (int Hp) {
			  if (Hp == 0) {return true;}
			  return false;
		  }
		 
		  public void damageSubi (int damage) {
			 Hp = Hp - damage;
			 if (Hp <0) {Hp =0 ;}
		  }
		  
		  public void heal (int heal) {
			 Hp = Hp + heal;
			 if (Hp > maxHp) {Hp = maxHp ;}
		  }
		  
		 public int getDamage() { return damage;}
		 
		 public boolean deplacer(int rayon) {
			 if (this.rayon<= rayon) {return true;}
			 return false;}
		 
		 public boolean takeCellSpace() {return true;}
		 
		 public void setSprite(Sprite sprite) {
			 this.sprite = sprite; 		
		 }
}

