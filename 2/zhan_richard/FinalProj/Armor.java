public class Armor extends Equips{
    
    private double armor;
    private double evasion;

    //The Methods
    public Armor (String i){
	super(i); 
	description = new String[1];
	if (i.equals("Leather Armor")){
	    armor=.05;
	    evasion=.1;
	    description={"5 Armor", "10% Evasion"};	    
	}
	if (i.equals("Copper Cuirass")){
	    armor=.12;
	    evasion=.02;
	    description={"12 Armor","2% Evasion"};
	  
	}
	if (i.equals("Iron Suit")){
	    armor=.20;
	    evasion= .2;
	    description= {"20 Armor","20% Evasion"};
	    
	}
	if (i.equals("Chainmail")){
	    armor=.15;
	    evasion=.25;
	    description= {"15 Armor","25% Evasion"};
	    
	}
    }
    public double getArmor(){
	return armor;
    }
    public double getEvasion(){
	return evasion;
    }
}
