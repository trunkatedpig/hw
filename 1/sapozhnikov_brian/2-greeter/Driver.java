import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g,g2;
	String result;
	g = new Greeter();
	g.setHappy("sup");
	g.setSad("I don't like you");
	g2 = new Greeter();
	//g2.setGreeting("How are you doing");
	result = g.happyGreet("Fred");
	System.out.println(result);
	result = g.sadGreet("Fred");
	System.out.println(result);
	result = g2.happyGreet("Sarah");
	System.out.println(result);
	result = g2.sadGreet("Sarah");
	System.out.println(result);

	/* 1. Try:
	      g.setGreeting("Howdy");
	         g.greet("Tom");
		    g.setGreeting("sup");
		       g.greet("Fred");
	*/


    }
}
