import java.io.*;
import java.util.*;

public class same {

    public String sameEnds(String s) {
	int l = s.length();
	int i;
	String ans = "";
	int half = (l+1)/2;

	for (i = l/2; i > 0; i--) {
	    if (s.substring(0,i).equals(s.substring(half++))) {
		ans = s.substring(0,i);
		break;
	    }
	}
	return ans; 
    }

    public boolean sameStarChar(String str) {
    	boolean ans = false;
    	int l = str.length();
	int i;
	//Couldn't get case where the string contains ONLY multiple *'s.
	if (str.equals("") || !str.contains("*") || str.equals("*")) {
	    ans = true;
	}
	else {
	    for (i = 1; i < l-1; i++) {
		if (str.substring(i,i+1).equals("*")) {
		    if (str.substring(i-1,i).equals(str.substring(i+1,i+2))) {
			ans = true;
		    }
		else ans = false;
		}
	    }
	}
	return ans;
    }
}