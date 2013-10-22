import java.util.*;
import java.io.*;

public class Practice {

    public boolean sameStarChar(String s) {
        for (int i=1;i<s.length()-1;i++) {
	    if (s.substring(i,i+1).equals("*")) {
		if (!s.substring(i-1,i).equals(s.substring(i+1,i+2)))
		    return false;
	    }
	}
	return true;
    }

    public String sameEnds(String s) {
	int length = s.length();
	String r = "";
	int h;
	
	if (length % 2==0) {
	    h = (length/2);
	}
	else {
	    h = ((length-1)/2);
	    s = s.substring(0,h) + s.substring(h+1);
	    length = s.length();
	}
	
	for (int i=h;i>0;i--) {
	    if (s.substring(0,i).equals(s.substring(length-i))) {
		r = r + s.substring(0,i);
		return r;
	    }
	}
	return r;
    }

    public static void main(String[] args) {
	Practice p = new Practice();
	System.out.println(p.sameStarChar("*xa*az"));
	System.out.println(p.sameEnds("abXYab"));
    }
}
