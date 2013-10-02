import java.io.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {

	Greeter g,g2;
	g = new Greeter("Salutations", "Ba Humbug");
	g2 = new Greeter();
	System.out.println(g.happyGreet("Nick"));
	System.out.println(g.sadGreet("Kevin"));
	System.out.println(g2.happyGreet("Susan"));
	System.out.println(g2.sadGreet("Delores"));
    }
}