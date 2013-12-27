public class Weapons extends Equips{
    private int mindamage;
    private int maxdamage;
    private double crit;
    //THE METHODS
    public Weapons(String i){
	super(i);
	if (i.equals("Short Sword")){
	    mindamage = 2;
	    maxdamage = 4;
	    crit = .3;
	}
	if (i.equals("Sabre")){
	    mindamage = 3;
	    maxdamage = 5;
	    crit = .4; 
	}
	if (i.equals("Long Sword")){
	    mindamage = 5;
	    maxdamage = 7;
	    crit = .5;
	}
	if (i.equals("Scimitar")){
	    mindamage = 8;
	    maxdamage = 10;
	    crit = .6;
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

}
