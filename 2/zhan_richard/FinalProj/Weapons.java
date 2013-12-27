public class Weapons extends Equips{
    private int mindamage;
    private int maxdamage;
    private double crit;
    private double accuracy; 
    private String[] description;
    //THE METHODS 
    public Weapons(String i){
	//super(i);
	if (i.equals("Short Sword")){
	    mindamage = 3;
	    maxdamage = 6;
	    crit = .02;
	    accuracy = .85;
	    description = new String[3];
	    description={"3-6 Damage","2% Crit", "85% Accuracy"};
	}
	else if (i.equals("Sabre")){
	    mindamage = 4;
	    maxdamage = 9;
	    crit = .15;
	    accuracy=.95;
	    description = new String[3];
	    description= {"4-9 Damage","15% Crit","95% Accuracy"};
	}
	else if (i.equals("Long Sword")){
	    mindamage = 11;
	    maxdamage = 18;
	    crit = .1;
	    accuracy=.75;
	    description = new String[3];
	    description= {"11-18 Damage","10% Crit","75% Accuracy"};
	}
	else if (i.equals("Scimitar")){
	    mindamage = 13;
	    maxdamage = 20;
	    crit = .2;
	    accuracy=.85;
	    description = new String[3];
	    description= {"13-20 Damage","20% Crit","85% Accuracy"};
	}
	else if (i.equals("Wooden Sword")){
	    mindamage = 1;
	    maxdamage=3;
	    crit=.01;
	    accuracy=.8;
	    description = new String[4];
	    description={"A child's toy for the amateur hero!","1-3 Damage","1% Crit","80% Accuracy"};
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
    public String[] getDescription(){
	return description;
    }
}
