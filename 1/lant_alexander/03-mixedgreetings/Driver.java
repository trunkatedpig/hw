import java.io.*;
import java.util.*;


public class Driver {
	public static void main(String[] args) {
		System.out.println("Testing out constructor Greeter() on Mr. Z.");
		Greeter g1 = new Greeter();
		System.out.println(g1.happyGreet("User"));
		System.out.println(g1.sadGreet("User"));
		
		System.out.println("Testing out constructor Greeter(h,s) on Mr. Z.");
		Greeter g2 = new Greeter("Hey, it's","Bah it's");
		System.out.println(g2.happyGreet("User"));
		System.out.println(g2.sadGreet("User"));
	}
}
