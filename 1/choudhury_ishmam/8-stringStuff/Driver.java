import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	StringStuff one = new StringStuff();
	System.out.println(one.capitalize("charlie chaplin"));
	System.out.println(one.bondify("david draiman"));
	
	System.out.println("\n" + "The original word is shoe");
	System.out.println(one.PigLatinize("shoe"));
	
	System.out.println("\n" + "The original word is truck");
	System.out.println(one.PigLatinize("truck"));
	
	System.out.println("\n" + "The original word is ouroboros");
	System.out.println(one.PigLatinize("ouroboros"));

	System.out.println("\n" + "The original word is game");
	System.out.println(one.PigLatinize("game"));
    }
}
