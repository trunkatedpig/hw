import java.io.*;
import java.util.*;

public class CodingBat {
   
    public boolean sameStarChar(String str) {
	for (int l=0;str.substring(l,l+1).equals("*");l++){
	    if (l==0||l==str.length()) {
		return true;
	    } else if (str.substring(l-1,l).equals(str.substring(l+1,l+2))) {
		return true;
	    } else {
		return false; }}
	return false;
    }

    /*This first one is producing wierd errors on codingbat
      not sure how to fix them*/

    public String sameEnds(String string) {
        String first = string.substring(0,string.length()/2);
        String last = string.substring(string.length()/2+string.length()%2);
        for (int i=0; i<first.length(); i++) {
            if (first.substring(0,first.length()-i).equals(last.substring(i))) {
                return first.substring(0,first.length()-i);
            }
        }
        return "";
    }

    /*Second one I had to copy my code got really sloppy
      and my brain turned to mush*/
}
