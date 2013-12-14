import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g,g2;
	g = new Greeter("Why hello there", "Shoo Shoo");
	g2 = new Greeter();
	g2.setHappy("Hello");
	g2.setSad("Go away");
	System.out.println(g.happyGreet("Tom"));
	System.out.println(g.sadGreet("Tom"));
	System.out.println(g2.happyGreet("Sarah"));
	System.out.println(g2.sadGreet("Sarah"));
    }
}
