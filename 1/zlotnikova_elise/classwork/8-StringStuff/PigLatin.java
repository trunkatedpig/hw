import java.io.*;
import java.util.*;

public class PigLatin {
    public String PigLatinify(String word) {
	word = word.toLowerCase();
	String s1 = word.substring(0,1);
	String s2 = word.substring(1,length(word));
	if (s1.equals("a") || s1.equals("e") || s1.equals("i") || s1.equals("o") || s1.equals("u")) {
	    String result = word + "ay";
	}
	else {
	    String result = s2 + s1 + "ay";
	}
    }
}

	    
	    