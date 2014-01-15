import java.io.*;
import java.util.*;
public class Items {
    private int healthheal;
    private int manaheal;
    private int apheal;
    private int apbonus;
    private String Iname;
    private String[] description;
    private String descriptions[][] =  {
    	{"Minor Healing Potion","Heals 20 hit points"},
    	{"Healing Potion","Heals 50 hit points"},
    	{"Major Healing Potion","Heals 200 hit points"},
    	{"Minor Mana Potion","Heals 10 mana"},
    	{"Mana Potion","Heals 40 mana"},
    	{"Major Mana Potion","Heals 100 mana"},
    	{"Stamina Potion","Recovers 40 ability Power"},
    	{"Elixir","Heals 300 HP, 200 MP, and 100 AP"}    	
    };
    public Items(String i){
	Iname = i;
	if (i.equals("Minor Healing Potion")){
	    healthheal=20;
	    manaheal=0;
	    apheal=0;
	    description= descriptions[0];
	}
	if (i.equals("Healing Potion")){
	    healthheal=50;
	    manaheal=0;
	    apheal=0;
	    description= descriptions[1];
	}
	if (i.equals("Major Healing Potion")){
	    healthheal=200;
	    manaheal=0;
	    apheal=0;
	    description=descriptions[2];
	}
	if (i.equals("Minor Mana Potion")){
	    healthheal=0;
	    manaheal=10;
	    apheal=0;
	    description=descriptions[3];
	}
	if (i.equals("Mana Potion")){
	    healthheal=0;
	    manaheal=40;
	    apheal=0;
	    description=descriptions[4];
	}
	if (i.equals("Major Mana Potion")){
	    healthheal=0;
	    manaheal=100;
	    apheal=0;
	    description=descriptions[5];
	}
	if (i.equals("Stamina Potion")){
	    healthheal=0;
	    manaheal=0;
	    apheal=40;
	    description= descriptions[6];
	}
	if (i.equals("Elixir")){
	    healthheal=300;
	    manaheal=200;
	    apheal=100;
	    description= descriptions[7];
	}
    }
    public String[] getDescription(){
	return description;
    }
    public String getName(){
	return Iname;
    }
    public int getHealthValue(){
	return healthheal;
    }
    public int getManaValue(){
	return manaheal;
    }
    public int getAPValue(){
	return apheal;
    }
 
}
