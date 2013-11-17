import java.io.*;
import java.util.*;

public class CoolStuff {
    public boolean sameStarChar(String str) {
	//str = " " + str + " ";
	for (int i = 0; i < str.length(); i++) {
	    String substr = str.substring(i,i+1);
            if (substr.equals("*")) {
                if (!((i == 0) || (i == str.length()-1))) {
		    String before = str.substring(i-1,i);
		    String after = str.substring(i+1,i+2);
		    if (before.equals(after) == false) {
			return false;}
		}
	    }
	}
	return true;
    }
    
    public String sameEnds(String string) {
	String ret = "";
	for (int i = 1; i < string.length(); i++) {
	    String before = string.substring(0,i);
	    String after = string.substring(string.length()-before.length());
	    if (before.equals(after))  {
		ret = before;}
	    if (ret.length() > string.length()/2) {
		ret = ret.substring(0,ret.length()-1);}
	}
	return ret;
    }
}
