public class Weapons extends Equips{
    private int mindamage;
    private int maxdamage;
    private double crit;
    private double accuracy;
    private String description;
    //THE METHODS 
    public Weapons(String i){
	super(i);
	if (i.equals("Short Sword")){
	    mindamage = 3;
	    maxdamage = 6;
	    crit = .02;
	    accuracy = .85;
	    description= "3-6 Damage, 2% Crit, 85% Accuracy";
	}
	if (i.equals("Sabre")){
	    mindamage = 4;
	    maxdamage = 9;
	    crit = .15;
	    accuracy=.95;
	    description= "4-9 Damage, 15% Crit, 95% Accuracy";
	}
	if (i.equals("Long Sword")){
	    mindamage = 11;
	    maxdamage = 18;
	    crit = .1;
	    accuracy=.75;
	    description= "11-18 Damage, 10% Crit, 75% Accuracy";
	}
	if (i.equals("Scimitar")){
	    mindamage = 13;
	    maxdamage = 20;
	    crit = .2;
	    accuracy=.85;
	    description= "13-20 Damage, 20% Crit, 85% Accuracy";
	}
        
    }
   
    public int mindamage(){
	return mindamage;
    }

    public int maxdamage(){
	return maxdamage;
    }

    public double getCrit(){
	return crit;
    }

    public double getAccuracy(){
	return accuracy;
    }
}
