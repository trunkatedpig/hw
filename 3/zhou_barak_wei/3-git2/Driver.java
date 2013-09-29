import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g,g2;
	String result;
	/* g = new Greeter();
	g.setGreeting("Hello");
	g2 = new Greeter();
	g2.setGreeting("How are you doing");
	result = g.greet("Tom");
	System.out.println(result);
	result = g2.greet("Sarah");
	System.out.println(result);
	*/
	
	
	//testing the first constructor
	System.out.println("You should see Hello Tom");
	System.out.println("")
	g = new Greeter();
	g.setGreeting("Hello");
	result = g.greet("Tom");
	System.out.println(result);
	
	//testing the second constructor
	System.out.println("You should see Hello Fred and Die Tom");
	System.out.println("")
	g2 = new Greeter("Hello", "Die");
	result = g2.happyGreet("Fred");
	System.out.println(result);
	result = g2.sadGreet("Tom");
	System.out.println(result);
	
	/* 1. Try:
	   g.setGreeting("Howdy");
	   g.greet("Tom");
	   g.setGreeting("sup");
	   g.greet("Fred");
	*/


    }
}
