// Standard import stuff - nothing to see here, move along.
import java.io.*;
import java.util.*;


public class Driver {
	public class void main(String[] args) {
		System.out.println("Testing out constructor Greeter() on Mr. Z.");
		Greeter g1 = new Greeter();
		g1.happyGreet("Mr. Zamansky");
		g1.sadGreet("Mr. Zamansky");
		
		System.out.println("Testing out constructor Greeter(h,s) on Mr. Z.");
		Greeter g2 = new Greeter("Hey, it's","Bah it's");
		g2.happyGreet("Mr. Zamansky");
		g2.sadGreet("Mr. Zamansky");
	}
}
