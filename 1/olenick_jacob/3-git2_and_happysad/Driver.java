import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter a,b;
	a = new Greeter();
	System.out.println(a.happyGreet("Jack"));
	System.out.println(a.sadGreet("Jill"));
	b = new Greeter("Oh wow, hi there", "Is your day as awful as mine");
	System.out.println(b.happyGreet("Billmantha"));
	System.out.println(b.sadGreet("Manbilltha"));
    }
}
