import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
    	Greeter g1, g2;
    	g1 = new Greeter();
    	g2 = new Greeter("Hey", "Leave");
    	System.out.println(g1.happyGreet("dude"));
    	System.out.println(g1.sadGreet("dude"));
    	System.out.println(g2.happyGreet("dude"));
    	System.out.println(g2.sadGreet("dude"));
    }
}
