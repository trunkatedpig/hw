import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g,g2,g3;
	String result;
	g = new Greeter();
	g2 = new Greeter();
	g3 = new Greeter("Hi","I can't let you do that");
	g2.setHappy("Hello");
	g2.setSad("Go away");
	result = g.happyGreet("Tom");
	System.out.println(result);
	result = g.sadGreet("Tom");
	System.out.println(result);
	result = g2.happyGreet("Sarah");
	System.out.println(result);
	result = g2.sadGreet("Sarah");
	System.out.println(result);
	result = g3.happyGreet("Joe");
	System.out.println(result);
	result = g3.sadGreet("Joe");
	System.out.println(result);
    }
}
