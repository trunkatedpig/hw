import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String args) {
	Greeter g,g2;
	String result;
	g2 = new Greeter();
	g = new Greeter("Heyo!", "Boo");
	System.out.println(g.sadGreet("Dan"));
	System.out.println(g2.happyGreet("Dana"));
    }
}