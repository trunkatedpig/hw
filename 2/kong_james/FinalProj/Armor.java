import java.util.*;
import java.io.*;
public class Armor extends Equips{
    
    private double armor;
    private double evasion;
    private String[][] descriptions = {{"Leather Armor","5 Armor","10% Evasion"},{"Copper Cuirass","12 Armor","2% Evasion"},{"Iron Suit","20 Armor","20% Evasion"},{"Chainmail","15 Armor","25% Evasion"},{"Tunic","1 Armor","15% Evasion"}};
    //The Methods
    public Armor (String i){
	Ename=i;
    	int index = 0;
    	for (int j = 0; j < descriptions.length;j++){
	    if (descriptions[j][0].equals(i)){
		index = j;
		break;
	    }
    	}
    	description=descriptions[index];
    	int indexOfArmor = description[1].indexOf(" ");
    	int indexOfEvasion = description[2].indexOf("%");
    	armor = .01*Integer.parseInt(description[1].substring(0,indexOfArmor));
    	evasion = .01*Integer.parseInt(description[2].substring(0,indexOfEvasion));
	
    }
    public double getArmor(){
	return armor;
    }
    public double getEvasion(){
	return evasion;
    }
}
