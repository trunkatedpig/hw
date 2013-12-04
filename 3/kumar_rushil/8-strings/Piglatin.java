import java.io.*;
import java.util.*;
    public class Piglatin{
	public String vowel(String word){
	    word = word + "way";
	    return word;
	}

	public String consonant(String word){
	    String s,s1;
	    s = word.substring(0,1); 
	    word = word.substring(1);
	    word = word + s + "ay";
	    return word;
	}

	public String Pigify(String word){
	    char c = word.charAt(0);
	    if ((c == 'a')||
                (c == 'e')||
                (c == 'i')||
                (c == 'o')||
                (c == 'u')||
                (c == 'y')){
		return (vowel (word));
	    } else {
		return (consonant (word));
	    }	    
	}
    }
