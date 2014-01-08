import java.io.*;
import java.util.*;

public class BookFreq{
    int[] FreqArray = new int[26];
    
    private void setFreqArray(String FileName){
	
    	try {
        Scanner sc = new Scanner (new File(FileName));
        while (sc.hasNext()) {
            String s = sc.nextLine();
            s.toLowerCase();
	    s.trim();
	    s.replace(" ","");
	    System.out.println(s);
            for (int i=0;i<s.length();i++) {
              char c = s.charAt(i);
              if (Character.isLetter(c) == true){
		  FreqArray[(int)c - 97] = FreqArray[(int)c - 97] + 1;
	      }
	    }
	}
        } catch (Exception e) {System.out.println("");}
    }

    public int[] getFreqArray(){
	
	return FreqArray;
    }

    public static void main(String[] args){
	
	BookFreq BF = new BookFreq();
	BF.setFreqArray("WutheringHeights");
	for (int x:BF.getFreqArray()) {
	    System.out.println(x);

	}
    }
    
}
    
	