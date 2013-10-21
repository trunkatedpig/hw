import java.io.*;
import java.util.*;

public class StringStuff {
    public boolean sameStarChar(String str) {
	for (int i = 1;i<str.length()-1;i++) {
	    if (str.substring(i,i+1).equals("*")) {
		if (!str.substring(i-1,i).equals(str.substring(i+1,i+2)))
		    return false;
	    }
	}
	return true;
    }

    public String sameEnds(String string) {
	String ans = "";
	for (int i = 0;i<=string.length()/2;i++)
	    for (int x = string.length()/2;x<string.length();x++)
		if (string.substring(0,i).equals(string.substring(x)))
		    ans = string.substring(0,i);
	return ans;
    }
}

    