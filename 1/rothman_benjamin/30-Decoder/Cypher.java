import java.io.*;
import java.util.*;

public class Cypher {

    private String result;
    private double [] CorpusFreqs;
    private double [] wordFreq;


    public Cypher () {

	wordFreq = new double [26];

    }


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


  public double DistanceCalc () {

	//for all 26 letters
	double distance =0;

	for (int i = 0; i < 26; i++) {

	    distance = distance +   Math.pow ( CorpusFreqs [i] - wordFreq [i], 2);

	}

	distance = Math.sqrt (distance);

	return distance;

    }


    public void findWordFreq (String s) {

	for (int i = 0; i < 26; i ++) {

	    wordFreq [i] = 0;

	}



	double letta = 0;

	for (int i = 0; i < s.length (); i++) {


	    char c2 = s.charAt (i);

	    if (c2 <= 'z' && c2 >= 'a') {

		wordFreq [c2 - 'a'] = wordFreq [c2 - 'a'] + 1;
		letta = letta + 1;
	    }

	}


	for (int i = 0; i < 26; i ++) {

	    wordFreq [i] = wordFreq [i] / letta;

	}

    }



    public String decode (String s) {

	findWordFreq (s);

	String temp = s;
	double ans = DistanceCalc();
	double test = 0;
	int shift = 0;

	for (int i = 0; i < 26; i++) {
	    temp = s;
	    temp = encoder (temp, i);
	    findWordFreq (temp);
	    test = DistanceCalc ();

	    if (ans > test) {

		ans = test;
		shift = i;

	    }

	}



	    temp = encoder (s, shift);

	    return temp;
	    
	    

    }



	    
	

       public String toString () {
	return Arrays.toString (CorpusFreqs);
	}



}
