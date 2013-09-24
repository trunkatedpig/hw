import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[]args) {
	Greeter g, g2, g3, g4;
	String result;
	g = new Greeter ();
	g.setGreeting ("Hello");
	g2 = new Greeter ();
	g2.setGreeting ("How are you doing");
	result = g.greet ("Tom");
	System.out.println(result);
	result = g2.greet("Sarah");
	System.out.println(result);
	g3 = new Greeter();
	g3.setGreeting("Howdy");
	result = g3.greet("Tom");
	System.out.println(result);
	g4 = new Greeter();
	g4.setGreeting ("sup");
	g4.greet("Fred");
	result = g4.greet("Fred");
	System.out.println(result);
    }
}
