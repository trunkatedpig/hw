import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	Loops n = new Loops ();
	System.out.println (n.fact (4));
	System.out.println (n.fact (6));
	System.out.println (n.fact (12));
	System.out.println (n.fact2 (7));
	System.out.println (n.fact2 (14));
	System.out.println (n.fact2 (13));

      	System.out.println (n.GCD (4,2));
	System.out.println (n.GCD (30, 4));
	System.out.println (n.GCD (3410, 12));
	
      	System.out.println (n.GCD2 (4,2));
	System.out.println (n.GCD2 (30, 4));
	System.out.println (n.GCD2 (3410, 12));

	System.out.println (n.isPrime (21));
	System.out.println (n.isPrime (1954));
	System.out.println (n.isPrime (30000));
	System.out.println (n.isPrime (7));
	System.out.println (n.isPrime (13));
       
    }
}
