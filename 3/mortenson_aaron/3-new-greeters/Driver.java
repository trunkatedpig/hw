import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	/*Greeter g,g2;
	String result;
	g = new Greeter();
	g.setGreeting("Hello");
	g2 = new Greeter();
	g2.setGreeting("How are you doing");
	result = g.greet("Tom");
	System.out.println(result);
	result = g2.greet("Sarah");
	System.out.println(result);*/
	Greeter g,g2;
	String result;
	g = new Greeter();
	g2 = new Greeter(":(",":)");
	result = g.happyGreet("Bobert");
	System.out.println(result);
	result = g.sadGreet("Jeff");
	System.out.println(result);
	result = g2.happyGreet("qwertyuiop");
	System.out.println(result);
	result = g2.sadGreet("asdfghjkl");
	System.out.println(result);
    }
}
