import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g,g2;
	String result;
	
	g2 = new Greeter();
	g = new Greeter("Howdy", "Screw off");
	System.out.println(g.sadGreet("Tom"));
	System.out.println(g2.happyGreet("Sue"));
    }
}
