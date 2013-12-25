import java.io.*;
import java.util.*;

public class GenericRPG{
    public static void main(String[] args){
	Fence f = new Fence();
	Hero h = new Hero();
	Scanner sc = new Scanner(System.in);
	System.out.print("What is your name brave warrior?: ");
	String nameInput = sc.nextLine();
	h.setName(nameInput);
	System.out.println("Well than, welcome to the city of Kongsville");//:D
	System.out.println("  ~         ~~          __\n       _T      .,,.    ~--~ ^^\n ^^   // \\                    ~\n      ][O]    ^^      ,-~ ~\n   /''-I_I         _II____\n__/_  /   \\ ______/ ''   /'\\_,__\n  | II--'''' \\,--:--..,_/,.-{ },\n; '/__\\,.--';|   |[] .-.| O{ _ }\n:' |  | []  -|   ''--:.;[,.'\\,/\n'  |[]|,.--'' '',   ''-,.    |\n  ..    ..-''    ;       ''. '");
	System.out.println("Where do you want to go "+nameInput);
	String[] villages = {"(1)Town Hall","(2)Hospital"};
	System.out.println(f.multiFence(3,2,20,3,villages));
	String whereTo = sc.nextLine();
    }
}
