import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String [] args) {

	StringTests s = new StringTests();
	StringTests s2 = new StringTests ();
	StringTests s3 = new StringTests ();
	StringTests s4 = new StringTests ();
	StringTests s5 = new StringTests ();

	System.out.println (s.sameStarChar ("as*sa") );
	System.out.println (s2.sameStarChar ("Ao*ao") );
	System.out.println (s3.sameStarChar ("*nn*o*n*n"));
	System.out.println (s4.sameStarChar ("*one*ef") );
	System.out.println (s5.sameStarChar ("ef*fo*ne") );

	StringTests s6 = new StringTests();
	StringTests s7 = new StringTests ();
	StringTests s8 = new StringTests ();
	StringTests s9 = new StringTests ();
	StringTests s10 = new StringTests ();
	StringTests s11 = new StringTests ();
	StringTests s12 = new StringTests ();

	System.out.println (s6.sameEnds ("as*as") );
	System.out.println (s7.sameEnds ("PokaoP") );
	System.out.println (s8.sameEnds ("XXX"));
	System.out.println (s9.sameEnds ("xx") );
	System.out.println (s10.sameEnds ("abXab") );
	System.out.println (s11.sameEnds ("Lackadaisical") );
	System.out.println (s12.sameEnds ("Nescient") );

	
	


    }

}
