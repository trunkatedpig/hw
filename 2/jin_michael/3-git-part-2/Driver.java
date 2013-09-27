import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g,g2,g3,g4;
       
	g = new Greeter();
	g2 = new Greeter();
	g3 = new Greeter("I'm also happy,","I'm also sad");
g4 = new Greeter("I'm also happy,","I'm also sad");
	System.out.println(g.happygreet("Tom"));
	System.out.println(g2.sadgreet("Sarah"));
System.out.println(g3.happygreet("Tom"));
System.out.println(g4.happygreet("Sarah"));
    }
}

/*I looked at James Chen's hw for reference.*/
