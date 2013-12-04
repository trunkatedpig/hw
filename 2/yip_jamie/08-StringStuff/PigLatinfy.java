import java.io.*;
import java.util.*;

public class PigLatinfy {
    private String word;

    public String PigLatinify (String word) {
	String result;
	if (word.substring(0) == "a") {
		result = word + "ay";	    
	    }
	if (word.substring(0) == "e") {
		result = word + "ay";	    
	    }
	if ( word.substring(0) == "i") {
		result = word + "ay";	    
	    }
	if( word.substring(0) == "o") {
		result = word + "ay";	    
	    }
	if( word.substring(0) == "u") {
		result = word + "ay";	    
	    }
	else 
	    {
		result = word.substring(1) + word.substring(0,1) + "ay";
	    }
	return result;
    }

}
