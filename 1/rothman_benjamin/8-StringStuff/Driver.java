import java.io.*;
import java.util.*;

public class Driver {

    /* OLD STUFF
    public static void main (String [] args) {

	StringStuff s = new StringStuff ("johnny cash");

	System.out.println (s.capitalize ());
	System.out.println (s.bondify ());

    */

    public static void main (String [] args) {

	StringStuff s = new StringStuff ("Arthur");
	StringStuff s1 = new StringStuff ("Howdy");
	StringStuff s2 = new StringStuff ("Every");
	StringStuff s3 = new StringStuff ("open");
	StringStuff s4 = new StringStuff ("yellow");
	StringStuff s5 = new StringStuff ("Investigate");
	StringStuff s6 = new StringStuff ("Chandelier");
	StringStuff s7 = new StringStuff ("Photo");
	StringStuff s8 = new StringStuff ("Shadow");
	StringStuff s9 = new StringStuff ("Rhino");

	System.out.println (s.piglatinify () );
	System.out.println (s2.piglatinify () );
	System.out.println (s3.piglatinify () );
	System.out.println (s4.piglatinify () );
	System.out.println (s5.piglatinify () );
	System.out.println (s6.piglatinify () );
	System.out.println (s7.piglatinify () );
	System.out.println (s8.piglatinify () );
	System.out.println (s9.piglatinify () );
        
	
        

    }

}

