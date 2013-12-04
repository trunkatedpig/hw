import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	
	Greeter g,g2;
	String result;
	

	g = new Greeter("You're a beautiful person,", "No one likes you,");
	 
	
	System.out.println(g.greet("Tom", "Sarah"));
    }
}
