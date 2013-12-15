import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String [] args) {
	Greeter g, g2, g3;
	String result;
	g = new Greeter();

	g.setHappy ("I love you");
	g.setSad ("I'm breaking up with you");
	result = g.happygreet ("tom");
	System.out.println(result);
	result = g.sadgreet ("Mary");
	System.out.println(result);

	g2 = new Greeter();
	result = g2.happygreet ("Frank");
	System.out.println(result);
	result = g2.sadgreet ("rachel");
	System.out.println(result);

	g3 = new Greeter( "I love your tie", "You're ugly");
result = g3.happygreet ("Ezra");
System.out.println(result);
result = g3.sadgreet ("Natalie");
System.out.println(result);

    }
}


/* Partners of Deanna and Thomas */

/* Eugene helped fix the stylistic errors from copying over from Google Docs */


