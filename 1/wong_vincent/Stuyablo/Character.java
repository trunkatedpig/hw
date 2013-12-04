import java.io.*;
import java.util.*;

public class Character {
    protected String name;
    protected int atk;
    protected int health, exp, str, dex, wis, def, itemattackpoints;
    protected Random b = new Random();

    public Character () {
	name = "unamed";
	health = 100;
	exp = 0;
	str = 10;
	dex = 10;
	wis = 10;
	atk = str/10;
	def = 0;
	itemattackpoints = 0;
    }
    public Character (String n, int h) {
	name = n;
	health = h;
	exp = 0;
	str = 10;
	dex = 10;
	wis = 10;
	atk = str/10;
	def = 0;
	itemattackpoints = 0;
    }
    public Character (String n, int h, int s, int d, int w, int f) {
	name = n;
	health = h;
	exp = 0;
	str = s;
	dex = d;
	wis = w;
	atk = str/10;
	def = f;
	itemattackpoints = 0;
    }

    //attack functions 
    public void setAttack (){
	atk = b.nextInt(atk) + exp*5 + dex*2 + wis + itemattackpoints;
	    }
    public void setDefense(){
	def = b.nextInt(def) + exp*5  + dex*2 + wis + itemattackpoints;
    }
    public void Battle(Character other){
	int loss=0;
	boolean turn = true;
	boolean wins = true;
	while (wins){
	setAttack();
	other.setAttack();
	setDefense();
	other.setDefense();
	if (turn){
	    if (atk > other.def){
		loss = atk - other.def;
		other.health = other.health - loss;
		System.out.println(name + " wins and " + other.name + " loses " + loss);
		exp = exp + 1;
		wins = false;
		System.out.println(name + " says: I am victorious!");//victory cry
		System.out.println(other.name + " says: You are too strong for me....");//losing cry
	    }
	    else {
		System.out.println(other.name + " blocks " + name);
		turn = false;
		System.out.println(other.name + " says: Your sword is no match for me!");//blocking
		}
	}
	else{
	    if (other.atk > def){
		loss = other.atk - def;
		health = health - loss;
		System.out.println(other.name + " wins and "+  name + " loses " + loss);
		other.exp = other.exp + 1;
		wins = false;
		System.out.println(name + " says: You are too strong for me....");//losing cry
		System.out.println(other.name + " says: You are too strong for me....")//victory cry
	    }
	    else {
		System.out.println(name + " blocks " + other.name);
		turn = true;
		System.out.println(name + " says: Your sword is not match for me!");//blocking
	    }
	}
	System.out.println( "*********************");
	    }
    }
     			   
  // Get Functions
    public int  getHealth () {
	return health;
    }

    public int getExp () {
	return exp;
    }

    public int getStr () {
	return str;
    }

    public int getDex () {
	return dex;
    }

    public int getWis () {
	return wis;
    }

    public int getAtk () {
	return atk;
    }

    public int getDef () {
	return def;
    }   
    public String getName(){
	return name;
    }
    
}
