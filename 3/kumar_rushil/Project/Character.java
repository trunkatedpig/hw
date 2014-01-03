import java.io.*;
import java.util.*;

public class Character{
    protected int health, maxhealth;
    protected int mana, maxmana; //are we going to have mana points?
    protected int dexterity, magic, strength;
    protected int exp, maxexp, level, gold, damage;
    //protected int gold; this is in case we have a store. i think it would be a good idea
    protected String name, profession;
    protected ArrayList<String> inventory;
    Weapon sword = new Weapon();
    Random r = new Random();
    public Character(String s){
	name = s;
	maxexp = 10;
	level = 1;
	magic = 15;
	strength = 15;
	dexterity = 15;
	gold = 0;
	health = 100;
	mana = 100;
    }

    public String toString(){
	return name;
    }

    public void setMaxHealth(int i){
	maxhealth = i;
    }

    public void setHealth(int i){
	health = i;
    }

    public void setMana(int i){
	mana = i;
    }

    public void setMaxMana(int i){
	maxmana = i;
    }

    public void setDexterity(int i){
	dexterity = i;
    }

    public void setMagic(int i){
	magic = i;
    }

    public void setStrength(int i){
	strength = i;
    }

    public void setMaxExp(int i){
	maxexp = i;
    }

    public int getMaxHealth(){
	return maxhealth;
    }

    public int getHealth(){
	return health;
    }

    public int getMana(){
	return mana;
    }

    public int getMaxMana(){
	return maxmana;
    }

    public int getDexterity(){
	return dexterity;
    }

    public int getMagic(){
	return magic;
    }

    public int getStrength(){
	return strength;
    }

    public int getMaxExp(){
	return maxexp;
    }


    public void addExp(int i){
	int k = exp + i;
	if (k >= maxexp){
	    exp = k - maxexp;
	    addLevel();
	    //maxexp has to increase over here somehow
	    System.out.println(name + " has reached level " + level);
	}else{
	    exp = exp + i;
	}
    }

    public void addLevel(){
	level = level + 1;
    }

// we can definitely change this, it was just something i made up on the spot
    public boolean attackHits(){
	if (r.nextInt(30) + 1 <= dexterity){
	    return true;
	}
	else {
	    return false;
	}
    }

    public void die(){
	health = 0;
	System.out.println(name + " has died");
    }

    public void die(Character other){
	health = 0;
	System.out.println(other + " has defeated " + this);
    }

    public int meleeAttack (Character other){	
	damage = (int)(sword.getDamage() * (1 + .5 * strength/100));//this damage formula is taken from Skyrim
	//the strength does not add a boost to the damage at 15
	if(attackHits()){
	    if(other.getHealth()-damage > 0){
		other.setHealth(other.getHealth()-damage);
		System.out.println(other + "'s health decreased to " + other.getHealth() + "hp");
		return 1;
	    }
	    else{
		other.die(this);
		return -1;
	    }
	}
	else{
	    System.out.println(this + "'s attacked missed!");
	    return 1;
	}
	//the success will depend on dexterity for melee attacks
	//for magic attacks it will depend on magic stat? 
	//need to figure out health points and how much damage is done
    }
}