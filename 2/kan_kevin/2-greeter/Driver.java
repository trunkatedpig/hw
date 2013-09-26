import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g,g2;
	String result;
	g = new Greeter("Welcome");
	//	g.setHappyGreeting("Welcome");
	g2 = new Greeter("Go away");
	//	g2.setSadGreeting("Go away");
	result = g.greet("Tom");
	System.out.println(result);
	result = g2.greet("Sarah");
	System.out.println(result);

    }
}
