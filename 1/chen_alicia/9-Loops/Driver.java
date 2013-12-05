import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String [] args) {
	Loops l = new Loops();
	/*System.out.println (l.fact(5));
	  System.out.println (l.fact2(5));*/
	System.out.println (l.gcd(210,45));
	System.out.println (l.gcd2(210,45));
	System.out.println (l.isPrime(210));
	System.out.println (l.isPrime(13));
	System.out.println ("\n" + l.fact2(5));
	System.out.println(l.factFor(5));
	lSystem.out.print(l.backwards("hello"));
    }
}
			    
