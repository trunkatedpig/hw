import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g,g2;
	String result;

	g = new Greeter();
	g.setGreeting("Hi there,","May your chickens rot in their coops,");
	result = g.happygreet("Tom");
	System.out.println(result);
	result = g.sadgreet("Sam");
	System.out.println(result);

	g2 = new Greeter();
	result = g2.happygreet("Alice");
	System.out.println(result);
	result = g2.sadgreet("Elle");
	System.out.println(result);
    }
}
