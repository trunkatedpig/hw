import java.io.*;
import java.util.*;
public class Hero  extends Character{
    private Weapons EquipW;
    private Armor EquipA;
    private Items ItemI;
    private String[][] levelStats = {{"(1)Strength:" + str +"+ 1", "Increases Health"},{"(2)Dexterity:" + dex + "+ 1", "Increases Damage"},{"(3)Intelligence:" + intell + "+1", "Increases Mana and Spell Power"}};
    private int statCount;
    private Fence f = new Fence();

    
    public Hero(){

	EquipW = new Weapons("Wooden Sword");
	Equipment.add(EquipW);
	
	EquipA = new Armor("Tunic");
	Equipment.add(EquipA);

	updateStats();
	hP=maxHP;

	mP=maxMP;

	aP=maxAP;

	inventory= new ArrayList<Items>();
	name = "Sir Arthur";
	ability = new ArrayList<Abilities>();
	ability.add(new Abilities("Flee"));
	spells = new ArrayList<Spells>();
	level = 1;
	exp = 0;
	gold = 1000;

	expThreshold = 10;
    }
    public void toBuyW(String i){
	toEquipW(i);
	Equipment.add(EquipW);
    }

    public void toEquipW(String i){
	EquipW  = new Weapons(i);
	updateStats();	
    }
    public void toBuyA(String i){
	toEquipA(i);
	Equipment.add(EquipA);
    }
    public void toEquipA(String i){
	EquipA = new Armor(i);
	updateStats();
    }
    public void toItem(String i){
	ItemI = new Items(i);
	inventory.add(ItemI);
    }
    public String getEW(){
	return EquipW.getEquipName();
    }
    public String getEA(){
	return EquipA.getEquipName();
    }
    public void levelUp(){
	if (exp > expThreshold){
	    exp = 0;
	    level = level + 1;
	    System.out.println(f.listFence(50,levelStats));
	    updateStats();
	    statCount = 5;
	    System.out.println("Your Stats before leveling up: Strength:" + str + " Dexterity" + dex + " Intelligence" + intell);
	    System.out.println("You have 5 stats to distribute");
	    while (statCount > 0){
		Scanner sc = new Scanner(System.in);
		String stat = sc.nextLine();
		
		if (stat.equals("1")){
		    str = str + 1;
		    System.out.println("You eat some green vegetables, vegetables are good for you!");
		    statCount = statCount - 1;
		}
		else if (stat.equals("2")){
		    dex = dex + 1;
		    statCount = statCount -1;
		    System.out.println("You eat some carrots, carrots provide Vitamin A which help improve eyesight! Your hand-eye coordination improves!");
		}
		else if (stat.equals("3")){
		    intell = intell + 1;
		    statCount = statCount -1;
		    System.out.println("You read some books, Knowledge is Power!");
		}
	    }
	    System.out.println("Your Stats after leveling up: Strength:" + str + " Dexterity" + dex + " Intelligence" + intell);
	}
	
    }
    
    public void updateStats(){
	maxHP=60+(str*4);
	maxMP=10+(intell*2);
	maxAP=10+((level-1)*2);
	minDamage=(dex/4)+EquipW.getMinDamage();
	maxDamage=(dex/2)+EquipW.getMaxDamage();
	crit=EquipW.getCrit();
	accuracy=EquipW.getAccuracy();
	armor=EquipA.getArmor();
	evasion = EquipA.getEvasion();
	expThreshold = (Math.pow(level,5)) + 100;
    }
		
}
    
