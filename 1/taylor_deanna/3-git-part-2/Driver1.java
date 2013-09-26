import java.io.*;
import java.util.*;

public class Driver1 {
    public static void main(String [] args) {
	Greeter g,g2;
	String result;

	g2 = new Greeter();
	g = new Greeter("I LOVE YOU", "You're my least favorite person");
	System.out.println(g.greetsad("Thomas"));
	System.out.println(g.greethappy("Austen"));
    }
}
