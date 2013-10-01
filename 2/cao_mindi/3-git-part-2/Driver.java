import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g1,g2;
	g1 = new Greeter();
	System.out.println(g1.happyGreet("Oreo"));
	g2 = new Greeter();
	System.out.println(g2.sadGreet("Oreo"));
    }
}
