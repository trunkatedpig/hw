import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g, g2;
	g = new Greeter("Hello", "Ni Hao");
	g2 = new Greeter();
	System.out.println(g.happyGreet("Cello"));
	System.out.println(g.sadGreet("Kai Lan"));

	System.out.println(g2.happyGreet("Brian Guo"));
	System.out.println(g2.sadGreet("Brian Guo"));
    }
}
