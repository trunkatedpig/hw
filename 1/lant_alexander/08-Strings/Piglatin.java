import java.util.*;
import java.io.*;

/*
OOZE >> OOZEYAY
TRASH >> ASHTRAY

COMPOUND LETTERS:
TR, TH, SH, CH, 


*/



public class Piglatin {

    public String Piglatin (String word) {
	
	String a = (word.substring(0,2));
	String b = (word.substring(0,1));
	//ANOTHER WAY TO DO THIS:
	/*
	String vowels = "aeiou";
	String consonents = "tr|th|sh|ch"
	
	
	if (vowels.Indexof(b)
	
		{
			[COMMANDS]			
		}
*/
	
	if 
	    (a.equals("tr") || a.equals("th") || a.equals("sh") || a.equals("ch")) 
		  {
		      return word.substring(2) + word.substring (0,2) + "ay";
		  }
	
	else {
	    if
		(b.equals("a") || b.equals("e") || b.equals("i") || b.equals("o") || b.equals("u"))
		      {
			  return word + "yay";
		      }
	    else {
		return word.substring (1) + word.substring (0,1) + "ay";
	    }
	}
    }
    
}
