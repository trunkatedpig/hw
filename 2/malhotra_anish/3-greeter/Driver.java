import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g,g2;
	String result;
	g = new Greeter("Hi, How are you?","Get Lost");
	g2 = new Greeter();
	System.out.println(g.greet("Tom"));
	System.out.println(g2.greet2("Sarah"));
    }
}
