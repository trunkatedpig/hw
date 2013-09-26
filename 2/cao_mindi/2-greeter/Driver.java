import java.to*;
import java.util.*;


public class Driver {
    public static void main(String[]args){
	    Greeter g2 = new Greeter();
	    String result;

	    Greeter g = new Greeter();
	    g.setGreeter("Hello");
	    g2 = new Greeter();
	    result = g.greet("Tom");
	    System.out.println(result);
	    result = g2.greet("Sarah");
	    System.out.prinln(result);


    }
}