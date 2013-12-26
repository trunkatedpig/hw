import java.io.*;
import java.util.*;

public class Character{
    //THE INSTANCES
    public int maxHP,hP,maxMP,mP,maxAP,aP;
    public int str,dex,intell;
    public int level, exp, gold;
    public ArrayList<Items> inventory;
    public String name;
    public ArrayList<Abilities> ability;
    public ArrayList<Spells> spells;
    public double armor=0;
    //THE GETS
    public int getHP(){
	return hP;
    }
    public int getMP(){
	return mP;
    }
    public int getAP(){
	return aP;
    }
    public String getName(){
	return name;
    }
    public int getLevel(){
	return level;
    }
    public ArrayList<Items> getInventory(){
	return inventory;
    }
    public int getStr(){
	return str;
    }
    public int getDex(){
	return dex;
    }
    public int getIntell(){
	return intell;
    }
    public int getGold(){
	return gold;
    }
    //THE SETS
    public void setHP(int loss){
	if (hP <= loss)
	    hP = 0;
	else
	    hP=hP-loss;
    }
    public void heal(int gain){
	if (hP >= maxHP)
	    hP=maxHP;
	else
	    hP=hP+gain;
    }
    public void fullHeal(){
	hP=maxHP;
    }
    public void setMP(int loss){
	mP=mP-loss;
    }
    public void setAP(int loss){
	aP=aP-loss;
    }
    public void setName(String newName){
	name=newName;
    }
    public void addInventory(Items i){
	inventory.add(i);
    }
    public void setStr(int gain){
	str = str + gain;
    }
    public void setDex(int gain){
	dex = dex + gain;
    }
    public void setIntell(int gain){
	intell = intell + gain;
    }
    public void levelUp(){
	level=level+1;
	exp = 0;
    }
    public void gainGold(int gain){
	gold = gold + gain;
    }
    public boolean loseGold(int loss){
	if (gold >= loss){
	    gold = gold - loss;
	    return false;
	}
	return true;
    }
    //THE METHODS
    public Character(){
	maxHP=1;
	hP=maxHP;
	maxMP=0;
	mP=maxMP;
	maxAP=0;
	aP=maxAP;
	str=10;
	dex=10;
	intell=10;
	inventory = new ArrayList<Items>();
	ability = new ArrayList<Abilities>();
	spells = new ArrayList<Spells>();
	name = "Derp";
	armor = 0;
	level = 1;
	exp = 0;
	gold = 0;
    }


    public void attack(Character c){
	double s = (double)(str);
	int b = (int)(Math.round(s*(1-armor)));
	c.setHP(b);
    }
}
