import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g,g2;
	g = new Greeter();
	g2 = new Greeter("WASSUP","Hop off");
	System.out.println(g.happyGreet("Bob"));
	System.out.println(g.sadGreet("Bob"));
	System.out.println(g2.happyGreet("Lilo"));
	System.out.println(g2.sadGreet("Lilo"));
    }
}
