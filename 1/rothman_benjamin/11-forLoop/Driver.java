import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String [] args ) {

	GCD M = new GCD ();
	System.out.println (M.myGCD (8,12));
	System.out.println (M.myGCD (20, 8) );
	System.out.println (M.myGCD (6, 27) );


    }

}