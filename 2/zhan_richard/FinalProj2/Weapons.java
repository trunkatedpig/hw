import java.io.*;
import java.util.*;
public class Weapons extends Equips{
    private int mindamage;
    private int maxdamage;
    private double crit;
    private double accuracy; 
    private String[][] descriptions={{"Short Sword","3-6 Damage","2% Crit","85% Accuracy"},{"Sabre","4-9 Damage","15% Crit","95% Accuracy"},{"Long Sword","11-18 Damage","10% Crit","75% Accuracy"},{"Scimitar","13-20 Damage","20% Crit","85% Accuracy"},{"Wooden Sword","1-3 Damage","1% Crit","80% Accuracy"}};
    //THE METHODS 
    public Weapons(String i){
	Ename=i;
	if (i.equals("Short Sword")){
	    mindamage = 3;
	    maxdamage = 6;
	    crit = .02;
	    accuracy = .85;
	    description=descriptions[0];
	}
	else if (i.equals("Sabre")){
	    mindamage = 4;
	    maxdamage = 9;
	    crit = .15;
	    accuracy=.95;
	    description= descriptions[1];
	}
	else if (i.equals("Long Sword")){
	    mindamage = 11;
	    maxdamage = 18;
	    crit = .1;
	    accuracy=.75;
	    description= descriptions[2];
	}
	else if (i.equals("Scimitar")){
	    mindamage = 13;
	    maxdamage = 20;
	    crit = .2;
	    accuracy=.85;
	    description= descriptions[3];
	}
	else if (i.equals("Wooden Sword")){
	    mindamage = 1;
	    maxdamage=3;
	    crit=.01;
	    accuracy=.8;
	    description=descriptions[4];
	}
        
    }
   
    public int getMinDamage(){
	return mindamage;
    }

    public int getMaxDamage(){
	return maxdamage;
    }

    public double getCrit(){
	return crit;
    }

    public double getAccuracy(){
	return accuracy;
    }
    public String[] getAll(){
	String[] result = new String[descriptions.length];
	for (int i = 0; i < result.length;i++)
	    result[i]=descriptions[i][0];
	return result;
    }
}
