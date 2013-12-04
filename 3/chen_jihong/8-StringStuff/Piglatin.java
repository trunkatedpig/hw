import java.io.*;
import java.util.*;

public class Piglatin{
    public String Piglatinify(String word){
	String f = word.substring(0, 1);
	String r = word.substring(1, word.length());
	if (word.startsWith("a")) {
		return word + "way";
	} else if(word.startsWith("e")) {
		return word + "way";
	}else if (word.startsWith("i")) {
	       	return word + "way";
	} else if (word.startsWith("o")) {
	     	return word + "way";
	} else if (word.startsWith("u")) {
	    return word + "way";
		    } else {
	    return r + f + "ay";
		}
    }
}