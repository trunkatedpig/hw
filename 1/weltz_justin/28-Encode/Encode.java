import java.io.*;
import java.util.*;
public class Encode {
    public String encode(String s, int n){
	s = s.toLowerCase();
	String newString = "";
	for (int i = 0; i < s.length();i++){
	    char letter = s.charAt(i);
	    if (Character.isLetter(letter)){
		if (letter + n > 122)
		    letter = (char) (letter - (26 - n));
		else {
		    letter = (char)(letter + n);
		}
		newString = newString + letter ;
	    }
	    else {
		newString = newString + letter;
	    }
	}
	return newString;
    }

}

	    
		    
		
		
		
    
    
