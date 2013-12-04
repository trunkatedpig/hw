import java.io.*;
import java.util.*;

public class Character {
    protected int health, maxhealth;
    protected int dex, str, intel;
    protected int experience;
    protected int gold;
    protected double x,y,distance;
    protected String name;
    protected String charClass;
 
    public Character(String name, int health, int str, int dex, int intel) {
	this.name = name;
	this.health = health;
	this.dex = dex;
	this.str = str;
	this.intel = intel;
    }

    public int getHealth() {
	return health;
    }

    public int getStr() {
	return str;
    }

    public int getDex() {
	return dex;
    }

    public int getIntel() {
	return intel;
    }

    /* You have to provide other needed get/set methods */

    public void removeHealth(int damage) {
	health = health - damage;
    }

    public void attack(Character other) {
	int damage = str + intel/10; //Numbers can be changed when base values and scaling
	                            //are determined for strength, dexterity, and intelligence
	damage += 5 * damage * (int)(Math.random() + dex/100.0);
        other.removeHealth(damage);
    }

    // returns true if you succesfully flee, false otherwise
    public boolean flee(Character other) {
	double r = Math.random();
	int s = str - other.getStr();
	int d = dex - other.getDex();
	int i = intel - other.getIntel();
	return (int)(r + s/20.0 + d/10.0 + i/15.0) == 1; //Once again, numbers can be changed
    }


    /*
      this routine will decide first ask if other tries to flee. If
      so, and if it's succesful it should adjust experience and or
      gold as needed and return a 0.

      Then, it should decide if this character tries to flee. 
      If so and it's succesful, return a 1;
      
      Otherwise, call attack on both sides:
      this.attack(other);
      if (other.health>0) 
        other.attack(this);

      and then return 2 if this is dead, 3 if other is dead, 4 if both dead, 5 if none dead.

    */
    public int encounter(Character other) {
	return 0;
    }



    public String getStatus() {
	String attrib1=String.format("Str: %d Dex: %d Int: %d",
				     str, dex, intel);
	String attrib2=String.format("Exp: %d Health: %d of %d",
				     experience,health,maxhealth);
	String locale = String.format("x: %5.2f y: %5.2f",x,y);
	String whole=String.format("%s\n%s\n%s\n%s\n",
				   name,attrib1,attrib2,locale);
	return whole;
    }


    public String toString() {
	return name;
    }
    
}
