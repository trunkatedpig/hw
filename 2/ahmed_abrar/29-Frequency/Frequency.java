import java.io.*;
import java.util.*;

public class Frequency {
    public static void main ( String[] args ) {
	Frequency f = new Frequency();
	f.buildCorpusFreq ( "thePrince.txt" );
    }
    private double[] CorpusFreqs = new double [ 26 ];
    public void buildCorpusFreq ( String filename ) {
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		for (int i=0;i<s.length();i++) {
		    char c = Character.toLowerCase ( s.charAt(i) );
		    if ( c >= 'a' && c <= 'z' )
			CorpusFreqs [ c - 'a' ] = CorpusFreqs [ c - 'a' ] + 1;
		}
	    }
	} catch (Exception e) {
	    System.out.println ( "something didnt work: " + e + "\n" );
	}
	System.out.println ( Arrays.toString ( CorpusFreqs ) );
    }
}
