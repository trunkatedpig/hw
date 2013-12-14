import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g,g2;
	String result;
	g = new Greeter();
	g2 = new Greeter();
	System.out.println(g.happyGreet("Tom"));
	System.out.println(g2.sadGreet("Tom"));
    }
}
