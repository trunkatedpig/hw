import java.io.*;
import java.util.*;

public class Driver{
	public static void main(String[] args) {
	    Greeter g,g2;

	    g = new Greeter();
	    System.out.println(g.happyGreet("Tom"));
            System.out.println(g.sadGreet("John"));

            g2 = new Greeter("This is sad Greeting, ","This is happy Greeting, ");
            System.out.println(g2.happyGreet("Tom"));
            System.out.println(g2.sadGreet("John"));
        }
}
