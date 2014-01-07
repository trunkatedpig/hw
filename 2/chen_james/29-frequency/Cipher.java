import java.util.*;
import java.io.*;

public class Cipher {

	public static void main(String [] args) {
		Cipher c = new Cipher();
		c.buildCorpusFreq("pg100.txt");
		System.out.println(c.getFreq('a'));
        System.out.println(c.getFreq('e'));
        System.out.println(c.getFreq('y'));
        System.out.println(c.getFreq('z'));
		
		
		
	}
	
	
	public String encode(String s, int shift) {
		String result = s;
		result.toLowerCase();
		char[] chars = result.toCharArray();
		
		for (int i = 0; i <s.length(); i++) {
			char c = chars[i];
			if (c >= 97 && c <= 123) {
				int x = c;
				x = x + shift;
				chars[i] = (char) x;
			}
			
		}
	
	return new String(chars);	
	}
	
	public double[] CorpusFreqs = new double[26];
	
	private void buildCorpusFreq(String filename) {
		try {
        	Scanner sc = new Scanner (new File(filename));
        	while (sc.hasNext()) {
            	String s = sc.nextLine();
            	s = s.toLowerCase();
            	// do something to the line if you ened to
            		for (int i=0;i<s.length();i++) {
              			char c = s.charAt(i);
              			// do something with each character
              				if (c >= 97 && c<= 122) {
              					
              					CorpusFreqs[c-97]++; 
              				}
            		}
            		
        	}
        	 
        } 
        catch (Exception e) {}
	
	}
	
	 public String getFreq(char c) {
        String s = "" + c + ": " + CorpusFreqs[c - 97]; 
        return s;
    }
	
	
	

}