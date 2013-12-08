import java.io.*;
import java.util.*;


public class Driver {

	public static void main(String[] args) {

		System.out.println("Does Greeter() work ?");

		Greeter g1 = new Greeter();
		System.out.println(g1.happyGreet("Martian"));
		System.out.println(g1.sadGreet("Martian"));

		System.out.println("Does this one work better ?");

		Greeter g2 = new Greeter("Hi", "Nope");
		System.out.println(g2.happyGreet("Martian"));
		System.out.println(g2.sadGreet("Martian"));
	}
}
