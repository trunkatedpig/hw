import java.io.*;
import java.util.*;

public class Encode{
    public String encode(String word, int offset){
	String lowered = word.toLowerCase();
	String codeWord = "";
	for (int i = 0; i < lowered.length(); i++){
	    char coded = lowered.charAt(i);
	    int charNum = (int)coded;
	    if (coded >= 'a' && coded <= 'z'){
		charNum = charNum + offset;
		if (charNum > 'z')
		    charNum = charNum - 26;
		coded = (char)charNum;
		codeWord = codeWord + coded;
	    }
	    else{
		codeWord = codeWord + coded;
	    }
	}
	return codeWord;
    }
    public static void main(String args[]){
	Encode e = new Encode();
	System.out.println(e.encode("hello", 3));
	System.out.println(e.encode("abcxyz", 3));
    }
}