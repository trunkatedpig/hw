import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g;
	String result;

	g = new Greeter("Welcome","Begone");

	System.out.println(g.happyGreet("Jeff"));
	System.out.println(g.sadGreet("Barry"));


	
    }
}
