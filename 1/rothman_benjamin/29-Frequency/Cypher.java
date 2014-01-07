import java.io.*;
import java.util.*;

public class Cypher {

    private String result;
    private double [] CorpusFreqs;

    public String encoder (String s, int i) {

	result = s;

	result.toLowerCase();

	String temp = "";
	
	for (int n = 0; n < result.length(); n++) {

	    if (result.charAt (n) < 'a' || result.charAt (n) > 'z') {

		temp = temp + result.charAt (n);
	    }

	    else {
		if (result.charAt (n) + i <= 'z') {

		    temp = temp + (char)( result.charAt (n) + i);
		}

		else {
		    temp = temp + (char) ('a' + (i - ('z' + 1 - result.charAt (n) ) ) );
		   
	   
	}
	    }

	}

    

	result = temp;
	
	return result;

    }



    public void buildCorpusFreq (String filename) {

	int [] letters = new int [26];
	CorpusFreqs = new double [26];


	try {
	    Scanner sc = new Scanner (new File (filename) );
	    while (sc.hasNext () ) {
		String s = sc.nextLine ();

		for (int i = 0; i < s.length (); i++) {
		    char c = s.charAt (i);
		    if (c <= 'z' && c >= 'a') {		        
		    letters [c - 'a'] = letters [c - 'a'] + 1;
		    }
		    else {}

		}

	    }
	}

	    catch (Exception e) {}
	

	int totalLetters = 0;

	for (int i = 0; i < letters.length; i++) {
	    totalLetters = totalLetters + letters [i];
	}



	for (int i = 0; i < letters.length; i++) {


	    CorpusFreqs [i] = ((double) letters [i] / (double) totalLetters);
	}



    }


    public double [] getLetterFreqs () {

	return CorpusFreqs;

    }




       public String toString () {
	return Arrays.toString (CorpusFreqs);
	}



}
