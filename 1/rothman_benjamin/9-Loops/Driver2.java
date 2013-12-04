import java.io.*;
import java.util.*;

public class Driver2 {

    public static void main (String [] args ) {

	GCD g = new GCD ();
	GCD g2 = new GCD ();
	GCD g3 = new GCD ();

	System.out.println (g.returnGCD (12,8));
	System.out.println (g.returnGCD (25, 5));
	System.out.println (g.returnGCD (29, 3));
	System.out.println (g.returnGCD (3, 91));
	System.out.println (g.returnGCD (12, 40));
	System.out.println (g.returnGCD (49, 140));
       
	System.out.println (g2.returnGCD2 (12,8));
	System.out.println (g2.returnGCD2 (25, 5));
	System.out.println (g2.returnGCD2 (29, 3));
	System.out.println (g2.returnGCD2 (3, 91));
	System.out.println (g2.returnGCD2 (12, 40));
	System.out.println (g2.returnGCD2 (49, 140));

	/*System.out.println (g.returnGCD (373587883, 40000000));

	System.out.println (g2.returnGCD2 (373587883, 40000000));

	Now I'm not entirely sure because Java won't let me pick numbers much larger then this, but I think I was already starting to get lag with the returnGCD function, but not with the returnGCD2. (Used the int primitive rather than the long primitive. */


	System.out.println (g3.isPrime (2));
	System.out.println (g3.isPrime (1));
	System.out.println (g3.isPrime (0));
	System.out.println (g3.isPrime (7));
	System.out.println (g3.isPrime (20));
	System.out.println (g3.isPrime (99));
	System.out.println (g3.isPrime (117));

	/* Fun note = I thought 117 was a prime number, but this function proved how wrong I was haha. */






    }

}
	
