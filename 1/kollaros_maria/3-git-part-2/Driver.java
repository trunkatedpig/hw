import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g, g2;
	String result;
	g2 = new Greeter();
	g = new Greeter("Hi", "Hello");
	System.out.println(g2.happygreet("Tom"));
	System.out.println(g2.sadgreet("Tom"));

	System.out.println(g.happygreet("Tom"));
	System.out.println(g.sadgreet("Tom"));
    }
}
