import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	Greeter g, g2;
	g = new Greeter();
	System.out.println(g.happygreet("James"));
	System.out.println(g.sadgreet("Mary"));
	g2 = new Greeter ("hi","bye");
	System.out.println(g2.happygreet("Dad"));
	System.out.println(g2.sadgreet("Mom"));
    }
}