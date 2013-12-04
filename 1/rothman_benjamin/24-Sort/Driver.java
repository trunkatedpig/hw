import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String [] args) {


	Sorting s = new Sorting (10,4); //First number says how many elements there will be in the array. The second is how many digits in the number.


	System.out.println (s);



	s.Order ();


	System.out.println (s);


	System.out.println ("------------");


	Sorting s2 = new Sorting (10, 6);

	System.out.println (s2);


	s2.Order ();

	System.out.println (s2);

    }

}
	    
	
