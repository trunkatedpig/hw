import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g,g2;
	g = new Greeter("Guten Tag,", "Das ist Genug,");
	g2 = new Greeter();
	System.out.println("The first two tests (on Tom) use the constructor with parameters,");
	System.out.println("and the second two tests (on Sue) use the constructor without parameters. \n");
	System.out.println(g.happyGreet("Tom"));
	System.out.println(g.sadGreet("Tom"));
	System.out.println(g2.happyGreet("Sue"));
	System.out.println(g2.sadGreet("Sue"));
    }
}
