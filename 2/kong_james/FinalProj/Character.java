
import java.io.*;
import java.util.*;

public class Character {
    //THE INSTANCES
    private Random r=new Random();
    public int maxHP,hP,maxMP,mP,maxAP,aP;
    public int str,dex,intell;
    public int level, exp, gold;
    public ArrayList<Items> inventory;
    public ArrayList<Equips> Equipment;
    public String name;
    public ArrayList<Abilities> ability;
    public ArrayList<Spells> spells;
    public double armor,crit,evasion,accuracy;
    public int minDamage,maxDamage;
    public double expThreshold;
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
    public int getMaxHP(){
    	return maxHP;
    }
    public int getMaxMP(){
	return maxMP;
    }
    public int getMaxAP(){
	return maxAP;
    }
    public String getName(){
	return name;
    }
    public int getLevel(){
	return level;
    }
    public int getXP(){
	return exp;
    }
    public ArrayList<Items> getInventory(){
	return inventory;
    }
    public ArrayList<Equips> getEquipment(){
	return Equipment;
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
    public void gainStr(int strength){
	str = str + strength;
    }
    public void gainDex(int dexterity){
	dex = dex + dexterity;
    }
    public void gainIntell(int intelligence){
	intell = intell + intelligence;
    }
    public int getCharacterMinDamage(){
	return minDamage;
    }
    public int getCharacterMaxDamage(){
	return maxDamage;
    }
    public int getGold(){
	return gold;
    }
    public double getArmorStat(){
	return armor;
    }
    public double getCritStat(){
	return crit;
    }
    public double getAccuracyStat(){
	return accuracy;
    }
    public double getEvasionStat(){
	return evasion;
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
    public void gainExp(int experience){
	exp= exp + experience;
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
	Equipment = new ArrayList<Equips>();
	armor = 0;
	crit=0;
	evasion=0;
	accuracy=1;
	name = "Derp";
	level = 1;
	exp = 0;
	gold = 0;
	minDamage=0;
	maxDamage=0;
    }


    public void attack(Character c){
	int damage1 = maxDamage-minDamage+1;
	int damage2 = r.nextInt(damage1);
	int damage3 = minDamage + damage2;
	String isCrit = " hit ";
	if (Math.random()<=c.getEvasionStat()|| Math.random()>accuracy){
	    System.out.println(name + " missed!");
	}
	else{
	    if (Math.random()<=crit){
		damage3=damage3*2;
		isCrit = " CRIT ";
	    }
	    int b = (int)(Math.round(damage3*(1-c.getArmorStat())));
	    c.setHP(b);
	    System.out.println(name + isCrit + c.getName() + " for " +b+ " damage");

	}
    }
}
