import java.util.*;
import java.io.*;

public class Frequency{
    private double[] CorpusFreqs= new double[26];
    
    public static void main (String[] args){
	Frequency f=new Frequency();
	f.buildCorpusFreq("SherlockHolmes.txt");
	
    }
  
    private void buildCorpusFreq (String filename){
	int totalLetters=0;
	try{
	    Scanner sc= new Scanner (new File(filename));
	    while (sc.hasNext()){
		String s= sc.nextLine();
		s= s.toLowerCase();
		for (int i=0; i<s.length();i++){
		    char c= s.charAt(i);
			addToArray(c);
			totalLetters=totalLetters+1;
		}
	    }
	    System.out.println("You made it!");
	    for (int i=0; i<CorpusFreqs.length; i++){
		CorpusFreqs[i]= CorpusFreqs[i]/totalLetters;
		System.out.print(CorpusFreqs[i]+ " ");
		
	    }
	    System.out.println();
	}

	catch (Exception e){
	    System.out.println("Bluh bluh you messed up somewhere");
	}
    }
    private void addToArray(char ch){
	if (ch >= 97 && ch<=122){
	    CorpusFreqs[ch-97]= CorpusFreqs[ch-97]+1;
	}
    }
}
