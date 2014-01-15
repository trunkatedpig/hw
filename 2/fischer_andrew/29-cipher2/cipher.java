import java.util.*;
import java.io.*;

public class cipher {

    // Variable Declaration //
    public double[] CorpusFreqs = new double[30];
    private double buffer = 0;



    // Method Definitions //

    /* builds frequency tables for the letters in a give file */
    public void buildCorpusFreq(String filename){
	
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		s = s.toLowerCase().replaceAll("[1234567890?:!.,;/]", "");


		for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    if (c >= (char)'a'  /*97*/ 
			&& 
			c <= (char)'z') /*144*/ {
			int charCode = c - (char)'a';
			CorpusFreqs[c - 'a'] = (CorpusFreqs[c - 'a'] + 1);
		    }
		    
		}
		
	    }
	} catch (Exception e) {}

	for (int i = 0; i < CorpusFreqs.length; i++){
	    buffer += CorpusFreqs[i];
	}
	for (int i = 0; i < CorpusFreqs.length; i++){
	    CorpusFreqs[i] = CorpusFreqs[i]/buffer;
	    CorpusFreqs[i] = CorpusFreqs[i] * 100;
	}


    }
 

    public static void main(String[] args){
        cipher c = new cipher();
	c.buildCorpusFreq("textEnglish.txt");
	System.out.println(Arrays.toString(c.CorpusFreqs));	

	c.buildCorpusFreq("textHebrew.txt");
	System.out.println(Arrays.toString(c.CorpusFreqs));

	//    for (int i = 0; i < 27; i ++){
	    //    System.out.println(c.CorpusFreqs[i] + ",");
	    //	}
	//    System.out.println("]");
    }
}

