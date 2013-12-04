import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g,g2;

	g = new Greeter();
	System.out.println(g.greetSad("Tom"));
	System.out.println(g.greetHappy("Sue"));


	g2= new Greeter ("Heyo", "Get away");
	System.out.println(g2.greetSad("Tom"));
	System.out.println(g2.greetHappy("Lisa"));
    }
}
