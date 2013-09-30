import java.io.*;
import java.util.*;


public class Driver {
	public static void main(String[] args) {
		Greeter g1 = new Greeter();
		System.out.println(g1.happyGreet("Mr. Zamansky"));
		System.out.println(g1.sadGreet("Mr. Zamansky"));

		Greeter g2 = new Greeter("Oh boy! It's","Oh god, RUN! It's");
		System.out.println(g2.happyGreet("Mr. Zamansky"));
		System.out.println(g2.sadGreet("Mr. Zamansky"));
	}
}
