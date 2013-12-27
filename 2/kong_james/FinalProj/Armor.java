public class Armor extends Equips{
    
    private int armor;
    private double evasion;
    private String description;

    //The Methods
    public Armor (String i){
	super(i);
	if (i.equals("Leather Armor")){
	    armor=5;
	    evasion=.1;
	    description="5 Armor and 10% Evasion";
	    
	}
	if (i.equals("Copper Cuirass")){
	    armor=12;
	    evasion=.02;
	    description="12 Armor and 2% Evasion";
	  
	}
	if (i.equals("Iron Suit")){
	    armor=20;
	    evasion= .2;
	    description= "20 Armor and 20% Evasion";
	    
	}
	if (i.equals("Chainmail")){
	    armor=15;
	    evasion=.25;
	    description= "15 Armor and 25% Evasion";
	    
	}
    }
}
