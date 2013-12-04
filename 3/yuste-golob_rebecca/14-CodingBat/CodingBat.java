import java.io.*;
import java.util.*;

public class CodingBat {
    //Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
    public boolean sameStarChar(String str) {
        int f, l;
        String temp;
        for(f = 0, l = 3; l <= str.length(); f++, l++) {
            temp = str.substring(f,l);
            if (temp.substring(1,2).equals("*")) {
                if (!temp.substring(0,1).equals(temp.substring(2)))
                    return false;
            }
        }
        return true;
    }

    //Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".

    public String sameEnds(String string) {
	String result = "";
	int len = string.length();
	int i;
	if (len % 2 == 1) {
	    i = len / 2;
	    len = i + 1;
	} else {
	    i = len / 2;
	    len = i;
	}
	for(; i >= 1; i--, len++) {
	    result = string.substring(0, i);
	    if(result.equals(string.substring(len))) {
		return result;
	    }
	}
	return "";
    }

}

// Sorry this is uploaded so late, I forgot we had to upload it!
