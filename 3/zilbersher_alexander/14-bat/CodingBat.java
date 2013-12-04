import java.io.*;
import java.util.*;

public class CodingBat {

    public boolean sameStarChar(String str) {
	//create variables
	int len = str.length();
	int place = 0;
	String newstr = "";
	int index = 0;

	//do a loop for each of the characters in the string
	for (;len>0;len--) {
	    //use place++ to advance a character in the newstr
	    place++;
	    //set newstr for every character starting from place
	    newstr = str.substring(place);
	    //use index to gain easy access to where * is
	    index = newstr.indexOf("*");
	    //make sure * is not the first or last character of the string
	    if (index-1>=0 && index+1!=newstr.length()) {
		//ask if character on each side of * is not equal to the one on the other side
		if (!newstr.substring(index-1,index).equals(newstr.substring(index+1,index+2))) {
		    //if this is true, this must be false
		    return false;
		}
	    }
	}
	// after checking if any are false, state that by default this is true. 
	return true;  
    }

    /* un-annotated

      public boolean sameStarChar(String str) {
      int len = str.length();
      int place = 0;
      String newstr = "";
      int index = 0;
      for (;len>0;len--) {
          place++;
	      newstr = str.substring(place);
	          index = newstr.indexOf("*");
		      if (index-1>=0 && index+1!=newstr.length()) {
		      if (!newstr.substring(index-1,index).equals(newstr.substring(index+1,index+2))) {
		          return false;
			  }
			      }
			      }
			      return true;  
    }

    */

    public String sameEnds(String string) {
	//create variables
	int add = 0;
	int diff = 0;
	//take half of the string and take away a character every time
	for (int place=string.length()/2;place>0;place--) {
	    //account for if half the string isn't a whole number
	    if ((string.length()/1.0)%2 != 0.0) {
		add = 1;
	    }
	    //ask if the first half of the string is equal to the second half 
	    //(add 1 if it didn't divide evenly, add diff)
	    if (string.substring(0,place).equals(string.substring(add+place+diff))) {
		//return the string if true
		return string.substring(0,place);
	    }
	    //basically the place of the first half needs to shrink
	    //while the place of the second half needs to grow, so 
	    //add two to the index of the second half
	    //every time you subtract one from place
	    diff = diff + 2;
	}
	return "";    
    }

    /* un-annotated

      public String sameEnds(String string) {
      int add = 0;
      int diff = 0;
      for (int place=string.length()/2;place>0;place--) {
          if ((string.length()/1.0)%2 != 0.0) {
	  add = 1;
	      }
	          if (string.substring(0,place).equals(string.substring(add+place+diff))) {
		  return string.substring(0,place);
		      }
		          diff = diff + 2;
			  }
			  return "";    
    }

    */

}