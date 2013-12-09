import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g,g2;
	
	g = new Greeter("Hello", "Why are you crying");
	g2 = new Greeter ();
	System.out.println(g2.happyGreet("Tom"));
	System.out.println(g.sadGreet ("Tom"));
	System.out.println(g2.happyGreet ("Sarah"));
	System.out.println(g.sadGreet ("Sarah"));
    }
}
