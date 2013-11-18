import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g;
	String result;
	g = new Greeter("I love You", "I hate you");
	result = g.happyGreet("Tom");
	System.out.println(result);
	result = g.sadGreet("Sarah");
	System.out.println(result);

	/* 1. Try:
	      g.setGreeting("Howdy");
	         g.greet("Tom");
		    g.setGreeting("sup");
		       g.greet("Fred");
	*/


    }
}