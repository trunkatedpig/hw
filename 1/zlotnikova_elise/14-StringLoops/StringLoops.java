import java.io.*;
import java.util.*;

public class StringLoops { 
    public boolean sameStarChar(String str) { 
	boolean b = true;
	int x; 
	for (x=0;x<str.length();x++) { 
	    if (str.substring(x,x+1).equals("*")) { 
		if (x>0 && x<str.length()-1 && str.indexOf("*")!=-1) {
		    b = b && str.substring(x-1,x).equals(str.substring(x+1,x+2));
		}
	    }
	}
	return b;
    }

    public String sameEnds(String string) {
	String result;
	int x=0;
	int i;
	for (i=string.length()/2;i>0;i=i-1) { 
	    if (string.substring(0,i).equals(string.substring(string.length()-i))) {
		if (i>x)
		    x = i;
	    }
	}
	return string.substring(0,x);
    }
}
