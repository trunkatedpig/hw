import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	
	Greeter g1,g2;

	String result;

	g1 = new Greeter();
	g2 = new Greeter("Wave","ACHOO");
	System.out.println(g1.happyGreet("Sun"));
	System.out.println(g1.sadGreet("Moon"));
	System.out.println(g2.happyGreet("Stars"));
	System.out.println(g2.sadGreet("Birds"));
    }
}
