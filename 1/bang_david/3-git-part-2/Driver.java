import java.io.*;
import java.util.*;


public class Driver {
    public static void main(String[] args) {
	Greeter g, g2;
        g = new Greeter();
	System.out.println(g.happyGreet ("Tom"));
	System.out.println (g.sadGreet ("Tom's Brother"));
	g2 = new Greeter ("Have fun" , "Do not have fun");
	/* first one is happy greeting, 2nd one is sad greeting */
	System.out.println(g2.happyGreet ("Mom"));
	System.out.println(g2.sadGreet ("Enemy#1"));
 


    }
}
