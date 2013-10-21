import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String [] args ) {

	Rational a = new Rational (5,2);
	Rational b = new Rational (3, 7);
	Rational c = new Rational (10,2);


	System.out.println (a.equals (new Rational (5,2) ) );
	System.out.println (a.equals (new Rational (10, 99) ));
			    
			    
	System.out.println (b.mult (new Rational (7, 4)) );
	System.out.println (b.mult (new Rational (0, 2)) );
	System.out.println (b.mult (new Rational (2,2) ).equals (new Rational (6,14) ) );

	System.out.println (c.compareTo (new Rational ( 8,3) ) );
	System.out.println (c.compareTo (new Rational (92, 2) ));
	System.out.println (c.compareTo (new Rational (20, 4) ) );
			    

			    





    }

}
