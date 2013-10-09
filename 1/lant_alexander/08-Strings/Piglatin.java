import java.util.*;
    import java.io.*;

/*
OOZE >> OOZEYAY
TRASH >> ASHTRAY

COMPOUND LETTERS:
TR, TH, SH, CH, 


 */

 public class Piglatin {
     public String piglatin (String word) {
	 if (word.substring (0,2).equals ("tr", "th", "sh", "ch") {
		 return word.substring (2) + word.substring (0,2) + "ay";
	     }
	     else {if (word.substring (0,1).equals ("a", "e", "i", "o", "u") {
			 return word + "yay";
		     }
		    else {
		 return word.substring (1) + word.substring (0,1) + "ay";
		    }
}