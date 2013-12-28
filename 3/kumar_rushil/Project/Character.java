import java.io.*;
import java.util.*;

public class Character{
    protected int health, maxhealth;
    protected int mana, maxmana; //are we going to have mana points?
    protected int dexterity, magic, strength;
    protected int exp, maxexp, level, gold;
    //protected int gold; this is in case we have a store. i think it would be a good idea
    protected String name, profession;
    protected ArrayList<String> inventory;

    public Character(String s){
	name = s;
	maxexp = 10;
	level = 1;
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

}
