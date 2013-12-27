public class Items{
    private int healthheal;
    private int manaheal;
    private int apheal;
    private int apbonus;
    public String Iname;
    private String description; 

    public Items(String i){
	Iname = i;
	if (i.equals("Minor Healing Potion")){
	    healthheal=20;
	    manaheal=0;
	    apheal=0;
	    description= "Heals 20 hit points";
	}
	if (i.equals("Healing Potion")){
	    healthheal=50;
	    manaheal=0;
	    apheal=0;
	    description= "Heals 50 hit points";
	}
	if (i.equals("Major Healing Potion")){
	    healthheal=200;
	    manaheal=0;
	    apheal=0;
	    description="Heals 200 hit points";
	}
	if (i.equals("Minor Mana Potion")){
	    healthheal=0;
	    manaheal=10;
	    apheal=0;
	    description="Heals 10 mana";
	}
	if (i.equals("Mana Potion")){
	    healthheal=0;
	    manaheal=40;
	    apheal=0;
	    description="Heals 40 mana";
	}
	if (i.equals("Major Mana Potion")){
	    healthheal=0;
	    manaheal=100;
	    apheal=0;
	    description="Heals 100 mana";
	}
	if (i.equals("Stamina Potion")){
	    healthheal=0;
	    manaheal=0;
	    apheal=40;
	    description= "Recovers 40 ability Power";
	}
	if (i.equals("Elixir")){
	    healthheal=300;
	    manaheal=200;
	    apheal=100;
	    description= "Heals 300 HP, 200 MP, and 100 AP";
	}
    }
 
}
