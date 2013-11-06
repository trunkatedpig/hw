import java.io.*;
import java.util.*;

public class CodingBat {

    private String before;
    private String after;

    public boolean sameStarChar(String s) { 
	for (int i = 1; i < s.length()-1; i++) {
	    if (s.substring(i,i+1).equals("*")) {
		before = s.substring(i-1,i);
		after = s.substring(i+1,i+2);
		if (before.equals(after) == false)
		    return false;
	    }
	}
	return true;
    }

    public String sameEnds(String s) {
	String ans = "";
	for (int i = 1; i < s.length(); i++) {
	    before = s.substring(0,i);
	    after = s.substring(s.length()-before.length());
	    if (before.equals(after)) 
		ans = before;
	    if (ans.length() > s.length()/2)
		ans = ans.substring(0,ans.length()-1);
	}
	return ans;
  
    }

}
