import java.io.*;
import java.util.*;

public class PigLatinify {
    private String vowels, s, firstletter;
    
    public String toPigLatin(String word) {
	vowels= "aeiouAEIOU";
	s= word;
	firstletter= s.substring(0,1);
	if (vowels.indexOf(firstletter) != -1) {
	    word=word +"yay";
	}
	else if (vowels.indexOf(firstletter) == -1) {
	    word=word.substring(1)+word.substring(0,1)+"ay";
	}
	return word;
    }
}