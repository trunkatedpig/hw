import java.io.*;
import java.util.*;

public class GenericRPG {

    private String[] villages = {"(1)Town Hall","(2)Hospital","(3)Blacksmith","(4)Magic Store","(5)Inventory","(6)Quit"};
    private String[] blacksmithOptions = {"(1)Weapons","(2)Armor"};
    private String[] magicStoreOptions= {"(1)Spell Tomes","(2)Potions"};
    private String[] hospitalOptions = {"(1)Cure-$1","(2)Leave"};
    private String[][] magicStoreSpells = {{"(1)Magic Bolt-$20","Deals 20 damage","Costs 4 mana"},{"(2)Minor Heal-$30","Heals a little based on intell","Costs 10 mana"},{"(3)Stone Skin-$50","Increases resistance towards attacks","Lasts 3 turns","Costs 8 mana"},{"(4)Fireball-$80","Deals damage based on intell","Costs 15 mana"},{"(5)Temper-$100","Increases damage and crit chance","Costs 19 mana"},{"(6)Heal-$150","Heals based on intell","Costs 24 mana"},{"(7)Blizzard-$200","Deals damage based on intell","20% Freeze","Costs 30 mana"},{"(8)Poison-$300","Deals damage per turn based on enemy max HP","Lasts 5 turns","Costs 35 mana"},{"(9)Full Heal-$500","Full heals","Costs 77 mana"},{"(10)Unholy-$666","Oh my...","Costs 100 mana"}};
    private String[][] magicStorePotions = {{"(1)Minor Healing Potion-$3","Heals 20 hit points"},{"(2)Healing Potion-$15","Heals 50 hit points"},{"(3)Major Healing Potion-$40","Heals 200 hit points"},{"(4)Minor Mana Potion-$2","Heals 10 mana"},{"(5)Mana Potion-$10","Heals 40 mana"},{"(6)Major Mana Potion-$25","Heals 100 mana"},{"(7)Stamina Potion-$20","Recovers 40 ability power"},{"(8)Elixir-$100","Heals 300 HP, 200 MP, 100 AP"}};
    private String[][] swordList = {{"(1)Short Sword-$15","3-6 Damage","2% Crit","85% Accuracy"},{"(2)Sabre-$50","4-9 Damage","%15 Crit","95% Accuracy"},{"(3)Long Sword-$60","11-18 Damage","10% Crit","75% Accuracy"},{"(4)Scimitar-$100","13-20 Damage","20% Crit","85% Accuracy"}};
    private String[][] armorList = {{"(1)Leather Armor-$15","5 Armor","10% Evasion"},{"(2)Copper Cuirass-$40","12 Armor","2% Evasion"},{"(3)Iron Suit-$80","20 Armor","20% Evasion"},{"(4)Chainmail-$110","15 Armor","25% Evasion"}};

    private String[] fightOptions = {"(1)Attack","(2)Abilties","(3)Spells","(4)Items"};
    private Enemy bounty;
    private int bountyNumber;
    private int bountyKilled;
    private boolean quest = false;
    private Random r = new Random(); 
    private Weapons Dict = new Weapons("Short Sword");
    private Scanner sc = new Scanner(System.in);
    private Fence f = new Fence();
    private Hero h;
    private ArrayList<String> en = new ArrayList<String>();
    private String noGold = "You do not have enough gold";
    private String purchase = "You have purchased %s!";
    public GenericRPG(Hero hero){
	h=hero;
	loadWords("enemynames.txt");
    }


    private void loadWords(String filename) {
        en = new ArrayList<String>();
        try {
            File f = new File(filename);
            Scanner sc1 = new Scanner(f);
            while (sc1.hasNext()) {
                String s =sc1.nextLine();
                en.add(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.exit(0);
        }
    }








    public void village(){
	System.out.println("  ~         ~~          __\n       _T      .,,.    ~--~ ^^\n ^^   // \\                    ~\n      ][O]    ^^      ,-~ ~\n   /''-I_I         _II____\n__/_  /   \\ ______/ ''   /'\\_,__\n  | II--'''' \\,--:--..,_/,.-{ },\n; '/__\\,.--';|   |[] .-.| O{ _ }\n:' |  | []  -|   ''--:.;[,.'\\,/\n'  |[]|,.--'' '',   ''-,.    |\n  ..    ..-''    ;       ''. '");
	System.out.println("Where do you want to go "+h.getName() +"?");
	System.out.println(f.multiFence(2,3,20,4,villages));
	Scanner sc = new Scanner(System.in);
	String whereTo = sc.nextLine();
        if (whereTo.equals("1"))
	    townHall();
	else if (whereTo.equals("2"))
	    hospital();
	else if (whereTo.equals("3"))
	    blacksmith();
	else if (whereTo.equals("4"))
	    magicStore();
	else if (whereTo.equals("5"))
	    checkInventory();	
	else if (whereTo.equals("6"))
	    System.exit(0);
	else{
	    System.out.println("Please try again");
	    village();
	}
    }
    public void townHall(){
	System.out.println("                                +\n                               /_\\\n                     ,%%%______|O|\n                     %%%/_________\\\n                     `%%| /\\[][][]|%\n                    ___||_||______|%\n                         /  \\\n");
	if (!quest){
	    int ene = (int)(Math.random()*en.size());
	    quest = true;
	    bounty = new Enemy(en.get(ene),h);
	    bountyNumber = (r.nextInt(4)+2);
	    bountyKilled=0;
	}
	System.out.println("I have a quest for you! Slay "+bountyNumber+" "+plural(bounty.getName()));
	System.out.println(f.singleFence(50,3,"(1)Let's Go! (2)Train (3)Leave"));
	String townHallInput=sc.nextLine();
	if (townHallInput.equals("1"))
	    toQuest();
	else if(townHallInput.equals("2"))
	    train();
	else if (townHallInput.equals("3"))
	    village();
	else
	    townHall();
    
    }
    public void magicStore(){
	System.out.println("            ,    _\n           /|   | |\n         _/_\\_  >_<\n        .-\\-/.   |\n       /  | | \\_ |\n       \\ \\| |\\__(/\n       /(`---')  |\n      / /     \\  |\n   _.'  \\'-'  /  |\n   `----'`=-='   '\n");

	System.out.println("Gold: " + h.getGold());
	System.out.println("Come have a look");
	System.out.println(f.multiFence(2,1,30,2,magicStoreOptions));
	System.out.println("(3)Leave");
	String magicStoreInput1 = sc.nextLine();
	if (magicStoreInput1.equals("1")){
	    magicStoreSpells();
	}
	else if (magicStoreInput1.equals("2")){
	    magicStorePotions();
	}
	else if (magicStoreInput1.equals("3"))
	    village();
	else
	    magicStore();
    
    }
    public void magicStoreSpells(){
	System.out.println(f.listFence(50,magicStoreSpells));
	System.out.println("(11)Back (12)Leave");
	System.out.println("Gold: " + h.getGold());
	String magicStoreInput2 = sc.nextLine();
	if (magicStoreInput2.equals("11"))
	    magicStore();
	else if (magicStoreInput2.equals("12"))
	    village();
	else
	    magicStoreSpells();
    }
    public void magicStorePotions(){
	System.out.println(f.listFence(50,magicStorePotions));
	System.out.println("(9)Back (10)Leave");
	System.out.println("Gold: " + h.getGold());
	String magicStoreInput2 = sc.nextLine();
	String[] ops = {"1","2","3","4","5","6","7","8"};
	Store(ops,magicStoreInput2,magicStorePotions,5);
	if (magicStoreInput2.equals("9"))
	    magicStore();
	else if (magicStoreInput2.equals("10"))
	    village();
	else
	    magicStorePotions();
    }

    public void blacksmith(){
	System.out.println("      '\n       , \n       ' \n      '                   :=<]\n       '          *__       /\n      (          (__/     e\n     '  )        ('J)    /\n    ')('          )))____/\n   ( )  )')      |   |\n    ( /(( )      \\____m=====\\\n   )')(( ) )      +()+      (')\n|E -_-_-_-_-||   ++vv++     ======\n|J-_-_-_-_-_||  +++++++       \\/\n|M-_-_-_---_|| ++++++++       /\\\n|9-_-_-_-_-_||   // ||       /  \\\n|6-_-_-_---_||  (__D(__D    /    \\\n============== ");
	
	System.out.println("Gold: " + h.getGold());
	System.out.println("Let's me see what I have");
	System.out.println(f.multiFence(2,1,20,2,blacksmithOptions));
	System.out.println("(3)Leave");
	String blacksmithInput = sc.nextLine();
	if (blacksmithInput.equals("1"))
	    blacksmithWeapons();
	else if (blacksmithInput.equals("2"))
	    blacksmithArmor();
	else if (blacksmithInput.equals("3"))
	    village();
	else
	    blacksmith();
    }
    public void blacksmithWeapons(){
	System.out.println(f.listFence(50,swordList));
	System.out.println("(5)Back (6)Leave");
	System.out.println("Gold: " + h.getGold());
	String blacksmithInput1 = sc.nextLine();
	String[] ops = {"1","2","3","4"};
	Store(ops,blacksmithInput1,swordList,0);
	if (blacksmithInput1.equals("5"))
	    blacksmith();
	else if (blacksmithInput1.equals("6"))
	    village();
	else
	    blacksmithWeapons();
    }

    public void blacksmithArmor(){
	System.out.println(f.listFence(50,armorList));
	System.out.println("(5)Back (6)Leave");
	System.out.println("Gold: " + h.getGold());
	String blacksmithInput1 = sc.nextLine();
	String[] ops = {"1","2","3","4"};
	Store(ops,blacksmithInput1,armorList,1);
	if (blacksmithInput1.equals("5"))
	    blacksmith();
	else if (blacksmithInput1.equals("6"))
	    village();
	else
	    blacksmithArmor();
    }


    public void hospital(){
	System.out.println("    _____ \n   ,\\_+_/,\n  ,((''')),\n  ,(|*_*|),\n   ·; = ;·\n   __) (__\n  /  \\_/  \\\n /_(_ : _)_\\\n | |)___( \\ \\\n | /     \\/ /\n");
	System.out.println("Gold: " + h.getGold());
	System.out.println("How can I help you?");
	System.out.println(f.multiFence(2,1,20,2,hospitalOptions));
	String hospitalInput = sc.nextLine();
	if (hospitalInput.equals("1")){
	    if (h.loseGold(1))
		System.out.println("I'm sorry. Cash is required");
	    else{
		h.fullHeal();
		System.out.println("Feel Better!");
	    }
	    village();
	}
	else if (hospitalInput.equals("2"))
	    village();
	else
	    hospital();
    }
    public void checkInventory(){
	int hammerspace = h.getEquipment().size();
	int hammerspaceItems = h.getInventory().size();
	int hammerspace2 = 3;
	int hammerspace3 = 2;
	String[][] EquipmentA = new String[hammerspace][hammerspace2];
	String[][] InventoryA = new String[hammerspaceItems][hammerspace3];
	String[] EquipmentB = new String[hammerspace];
	String[] InventoryB = new String[hammerspaceItems];
	for (int i = 0; i <hammerspace;i++){
	    EquipmentA[i] = h.getEquipment().get(i).getDescription();
	    EquipmentB[i]=h.getEquipment().get(i).getEquipName();
	}	
	for (int i = 0; i <hammerspaceItems;i++){
	    InventoryA[i] = h.getInventory().get(i).getDescription();
	    InventoryB[i] = h.getInventory().get(i).getName();
	}
	
	System.out.println(f.singleFence(75,3,"Name:"+h.getName()+" "+h.getHP()+"/"+h.getMaxHP()+"HP "+
					 h.getMP()+"/"+h.getMaxMP()+"MP "+ h.getAP()+"/"+h.getMaxAP()+"AP "+
					 "Level:" + h.getLevel()+" Gold:"+h.getGold()+" Exp:"+h.getXP()));
	System.out.println(f.singleFence(70,3,"Equipped Weapon: "+h.getEW()+"  Equipped Armor: "+h.getEA()));
	System.out.println(f.listFence(40,EquipmentA));
	System.out.println(f.listFence(40,InventoryA));
	System.out.println("Type in 'Close' to close your magical bag");
	System.out.print("Type in the name of a weapon or armor to equip it: ");
	String inventoryInput = sc.nextLine();
	if (Arrays.asList(EquipmentB).contains(inventoryInput)){
	    if (Arrays.asList(Dict.getAll()).contains(inventoryInput)){
		h.toEquipW(inventoryInput);
	    }else{
		h.toEquipA(inventoryInput);
	    }
	    checkInventory();
	}
	else if (inventoryInput.equals("Close") || inventoryInput.equals("close"))
	    village();
	else
	    checkInventory();

    }
    public String plural(String s){
	if (s.substring(s.length()-1).equals("s"))
	    return s.substring(0,s.length())+"es";
	else if (s.substring(s.length()-1).equals("y"))
	    return s.substring(0,s.length()-1)+"ies";
	else
	    return s+"s";
    }
    public void Store(String[] i,String j,String[][]k,int l){
	if (Arrays.asList(i).contains(j)){
	    int inputTrue= Integer.parseInt(j);
	    String thingName = k[inputTrue - 1][0];
	    int dollarSign = thingName.indexOf("$");
	    int start = thingName.indexOf(")");
	    int end = thingName.indexOf("-");
	    String priceS= thingName.substring(dollarSign + 1);
	    int price = Integer.parseInt(priceS);
	    String thingTrueName= thingName.substring(start + 1,end);
	    if (h.loseGold(price))
		System.out.println(noGold);
	    if (l == 0){
		h.toBuyW(thingTrueName);
		System.out.println("You have bought a " + thingTrueName);
	    }
	    else if (l == 1){
		h.toBuyA(thingTrueName);
		System.out.println("You have bought a " + thingTrueName + "!");
	    }
	    else {
		h.toItem(thingTrueName);
		System.out.println("You have bought a " + thingTrueName + "!");
	    }
	}
       
    }
    public void toQuest(){
    }
    public void train(){
	Enemy v = new Enemy(bounty.getName(),h);
	while (h.getHP()>0 && v.getHP()>0){
	    System.out.println(f.singleFence(50,3,"Name:"+v.getName()+" "+v.getHP()+"/"+v.getMaxHP()+"HP "+
					     v.getMP()+"/"+v.getMaxMP()+"MP"));
	    System.out.println(f.singleFence(75,3,"Name:"+h.getName()+" "+h.getHP()+"/"+h.getMaxHP()+"HP "+
					     h.getMP()+"/"+h.getMaxMP()+"MP "+ h.getAP()+"/"+h.getMaxAP()+"AP "+
					     "Level:" + h.getLevel()+" Gold:"+h.getGold()+" Exp:"+h.getXP()));
	    System.out.println(f.multiFence(2,2,20,2,fightOptions));
	    String fightInput = sc.nextLine();
	    if (fightInput.equals("1")){
		if (h.getDex()>=v.getDex()){
		    h.attack(v);
		    v.attack(h);
		}
		else{
		    v.attack(h);
		    h.attack(v);
		}
	    }
	}

    }
  


}
