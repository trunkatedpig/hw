import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String [] args) {

	Cypher c = new Cypher ();

	/*	System.out.println (c.encoder ("hello", 3));

	System.out.println (c.encoder ("abcxyz", 3));

	System.out.println (c.encoder ("hi there!", 1));

	*/


	//	c.buildCorpusFreq ("TestDocument");
	
	c.buildCorpusFreq ("HuckleberryFinn");

	//System.out.println (c);
	String s2 = c.encoder ("hello my name is Ben", 3);
	System.out.println (s2);
	System.out.println (c.decode (s2));



    }

}
