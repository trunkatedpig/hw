import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
	Greeter g,g2;
	String result;

	g = new Greeter();
	result = g.happyGreet("Kevin");
	System.out.println(result);
	result = g.sadGreet("Miley");
	System.out.println(result);
	
	g2 = new Greeter("Hola","Bye");
	result = g2.happyGreet("Kevin");
	System.out.println(result);
	result = g2.sadGreet("Miley");
	System.out.println(result);
	
    }
}
