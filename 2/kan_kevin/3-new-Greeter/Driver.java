import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g,g2;
	g = new Greeter("Welcome");
	g2 = new Greeter("Go away");
	System.out.println(g.greet("Tom"));
	System.out.println(g2.greet("Sarah"));
    }
}
