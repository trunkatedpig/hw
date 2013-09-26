import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g,g2;

	g = new Greeter();
	System.out.println(g.happyGreet("Tom"));
	g2 = new Greeter();
	System.out.println(g2.sadGreet("Sue"));

	
    }
}
