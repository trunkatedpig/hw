import java.io.*;
import java.util.*;


public class Driver {
	public static void main(String[] args) {
		Greeter g1 = new Greeter();
		System.out.println(g1.HappyGreet("Katie"));
		System.out.println(g1.sadGreet("Elise"));
    
    Greeter g2 = newGreeter("Hello", "Gimme a break");
    System.out.println(g2.HappyGreet("Emilia"));
    System.out.println(g2.SadGreeter("Jana"));
    
	}
}
