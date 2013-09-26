import java.io.*;
import java.util.*;

public class Driver {
	public static void main (String[] args) {
		Greeter g; 		
		g = new Greeter();
		System.out.println(g.happyGreet("Fawn"));
		System.out.println(g.sadGreet("Tom"));	
		g = new Greeter("Hi", "Go away"); 
		System.out.println(g.happyGreet("James"));
		System.out.println(g.sadGreet("Sarah"));
		/*	
		deals with the case that Greeter is only given one argument	
		g = new Greeter("Hello");
		System.out.println(g.happyGreet("Kevin"));
		System.out.println(g.sadGreet("Jennie"));
		*/
	}
}	