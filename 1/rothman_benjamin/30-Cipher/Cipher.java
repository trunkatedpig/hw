import java.io.*;
import java.util.*;

public class Cipher {

    private double [] finalAns;
    private double [] wordFreq;
    private double [] corpusFreqs;


    public double DistanceCalc () {

	//for all 26 letters
	int distance =0;

	for (int i = 0; i < 26; i++) {

	    distance = distance +   Math.pow ( corpusFreqs [i] - wordFreq [i], 2);

	}

	distance = Math.sqrt (distance);

	return distance;

    }


    public double findWordFreq (String s) {

	wordFreq = new double [26];
	int letta = 0;

	for (int i = 0; i < s.length (); i++) {


	    char c2 = charAt (i);

	    if (c2 <= 'z' && c2 >= 'a') {

		wordFreq [c2 - 'a'] = wordFreq [c2 - 'a'] + 1;
		letta = letta + 1;
	    }

	}


	for (int i = 0; i < 26; i ++) {

	    wordFreq [i] = wordFreq [i] / letta;

	}

    }



	    
	