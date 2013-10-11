import java.io.*;
import java.util.*;

public class StringStuff {

	public int firstVowel(String word, int indx) {
		String capWord = word.toUpperCase();
		if (Arrays.asList("A", "E", "I", "O", "U").contains(capWord.substring(indx-1, indx))) //stackoverflow.com/questions/2135379
			return indx;
		else
			return firstVowel(word, indx + 1);
	}

	public String capFirst(String name) {
                return name.substring(0,1).toUpperCase()+name.substring(1);
        }

    	public String capitalize (String name) {
                String first = name.substring(0,name.indexOf(" "));
                String last = name.substring(name.indexOf(" ")+1);
                return capFirst(first) + " " + capFirst(last);
        }

   	 public String bondify (String name) {
                String first = name.substring(0,name.indexOf(" "));
                String last = name.substring(name.indexOf(" ")+1);
                return capFirst(last) + ", " + capFirst(first) + " " + capFirst(last) + ".";
        }

   	 public String pigLatinify (String word) {
        	String first = word.substring(0,1).toUpperCase();
           	 if (first.equals("A") || first.equals("E") || first.equals("I") || first.equals("O") || first.equals("U")) {
                	return word+"yay";
            	}

            	else {
			int firstVow = firstVowel(word,1);
                	return word.substring(firstVow-1) + word.substring(0, firstVow-1) + "ay" ;
            	}
    	}
}

