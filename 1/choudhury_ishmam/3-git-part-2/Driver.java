import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

	Greeter g,g2;

	String result;
	g = new Greeter("What a wonderful world it is,", "Ew, you're nasty");
    
	System.out.println(g.greet("Janna"));
     
    }
}
