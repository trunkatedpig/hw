import java.io.*;
import java.util.*;

public class CodingBat {

    private String before;
    private String after;

    public boolean sameStarChar(String str) { 
	for (int i = 1; i < str.length()-1; i++) {
	    if (str.substring(i,i+1).equals("*")) {
		before = str.substring(i-1,i);
		after = str.substring(i+1,i+2);
		if (before.equals(after) == false)
		    return false;
	    }
	}
	return true;
    }

    public String sameEnds(String string) {
	String answer = "";
	for (int i = 1; i < string.length(); i++) {
	    before = string.substring(0,i);
	    after = string.substring(string.length()-before.length());
	    if (before.equals(after)) 
		answer = before;
	    if (answer.length() > string.length()/2)
		answer = answer.substring(0,answer.length()-1);
	}
	return answer;
  
    }

}
