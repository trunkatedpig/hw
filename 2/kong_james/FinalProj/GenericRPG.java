import java.io.*;
import java.util.*;

public class GenericRPG{
    private String[] villages = {"(1)Town Hall","(2)Hospital","(3)Blacksmith","(4)Magic Store","(5)Inventory","(6)Quit"};
    private String[] magicStoreItems = {"(1)Magic Bolt-$20","(2)Minor Heal-$30","(3)Stone Skin-$50","(4)Fireball-$80","(5)Temper-$100","(6)Heal-$150","(7)Blizzard-$200","(8)Poison-$300","(9)Full Heal-$500","(10)Unholy-$666"};
    private Enemy bounty;
    private Random r = new Random(); 
    private Scanner sc = new Scanner(System.in);
    private Fence f = new Fence();
    private Hero h;
    private ArrayList<String> en = new ArrayList<String>();
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
	System.out.println("Well than, welcome to the city of Kongsville");//:D
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
	else if (whereTo.equals("5")){
	    checkInventory();
	    village();
	}
	else if (whereTo.equals("6"))
	    System.exit(0);
	else{
	    System.out.println("Please try again");
	    village();
	}
    }
    public void townHall(){
	System.out.println("                                +\n                               /_\\\n                     ,%%%______|O|\n                     %%%/_________\\\n                     `%%| /\\[][][]|%\n                    ___||_||______|%\n                         /  \\\n");
	int ene = (int)(Math.random()*en.size());
	bounty = new Enemy(en.get(ene),h);
	System.out.println("I have a quest for you! Slay "+plural(en.get(ene)));
    }
    public void magicStore(){
	System.out.println("            ,    _\n           /|   | |\n         _/_\\_  >_<\n        .-\\-/.   |\n       /  | | \\_ |\n       \\ \\| |\\__(/\n       /(`---')  |\n      / /     \\  |\n   _.'  \\'-'  /  |\n   `----'`=-='   '\n");
	System.out.println("Come have a look");
	System.out.println(f.multiFence(2,5,20,4,magicStoreItems));
    }
    public void blacksmith(){
	System.out.println("      '\n       , \n       ' \n      '                   :=<]\n       '          *__       /\n      (          (__/     e\n     '  )        ('J)    /\n    ')('          )))____/\n   ( )  )')      |   |\n    ( /(( )      \\____m=====\\\n   )')(( ) )      +()+      (')\n|E -_-_-_-_-||   ++vv++     ======\n|J-_-_-_-_-_||  +++++++       \\/\n|M-_-_-_---_|| ++++++++       /\\\n|9-_-_-_-_-_||   // ||       /  \\\n|6-_-_-_---_||  (__D(__D    /    \\\n============== ");
	System.out.println("Let's me see what I have");
	System.out.println(f.singleFence(30,3,"(1)Weapons or (2)Armor"));
    }
    public void hospital(){
	System.out.println("    _____ \n   ,\\_+_/,\n  ,((''')),\n  ,(|*_*|),\n   ·; = ;·\n   __) (__\n  /  \\_/  \\\n /_(_ : _)_\\\n | |)___( \\ \\\n | /     \\/ /\n");
	System.out.println("How can I help you?");
    }
    public void checkInventory(){
    }
    public String plural(String s){
	if (s.substring(s.length()-1).equals("s"))
	    return s.substring(0,s.length()-1)+"es";
	else if (s.substring(s.length()-1).equals("y"))
	    return s.substring(0,s.length()-2)+"ies";
	else
	    return s+"s";
    }
}
