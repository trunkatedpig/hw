import java.io.*;
import java.util.*;

public class CaesarCipher{

    public String encode(String word, int shift){
	
	String result = "";
	String lword = word.toLowerCase();
	
	for(int i=0; i<word.length(); i++){
	    char letter = lword.charAt(i);
	    if (letter >= 'a' && letter <= 'z'){
		if (letter + shift > 'z')
		    letter = (char) (letter + shift - 26);
		else
		    letter = (char) (letter + shift);
	    }
	    result = result + letter;
	}
	return result;
    }
}