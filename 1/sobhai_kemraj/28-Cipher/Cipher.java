import java.io.*;
import java.util.*;

public class Cipher {
    
	private double[] CorpusFreq;
	
	public Cipher (){
		buildCorpusFreq("Shakespear.txt");
	}
	
	public String encode(String input, int offset){
		input = input.toLowerCase();
		String output = "";
		offset = offset%26;
		for(int i = 0; i < input.length(); i++){
			char letter = input.charAt(i);
			if (letter > 'z' || letter < 'a')
				output = output + letter;
			else{
				if (letter + offset > 'z')
					letter = (char)(letter - 26);
				output = output + (char)(letter+offset);
			}
		}
	return output;
    }
	
	public double[] getCorpusFreq(){
		return CorpusFreq;
	}
	
	private void buildCorpusFreq (String filename){
		
		CorpusFreq = new double[26];
		for (int i = 0; i < 26; i++)
			CorpusFreq[i] = 0;
		
		try {
			Scanner sc = new Scanner (new File(filename));
			while (sc.hasNext()) {
				String s = sc.nextLine().toLowerCase();
				// do something to the line if you need to
				for (int i=0;i<s.length();i++) {
					char c = s.charAt(i);
					if (c >= 'a' && c <= 'z')
						CorpusFreq[(c-'a')]++;
				}
			}
        } catch (Exception e) {}
	}	
}