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

    public static void main(String[] args) {
	Practice p = new Practice();
	System.out.println(p.sameStarChar("*xa*az"));
    }
}
