import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g,g2;
	String result;
        g = new Greeter();
	result = g.happyGreet("Tom");
	System.out.println(result);
        result = g.sadGreet("Sarah");
	System.out.println(result);
	g2 = new Greeter("What's up","Don't talk to me");
	result = g2.happyGreet("John");
	System.out.println(result);
	result = g2.sadGreet("John");
	System.out.println(result);
    }
}