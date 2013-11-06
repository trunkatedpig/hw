import java.io.*;
import java.util.*;

public class CodingBat{
    public boolean sameStarChar(String str) {
	boolean stat = true;
	int current;
	int len = str.length() - 1;
	int index = str.indexOf("*");
	if (index < 0)
	    return stat;
	for (current = 1; current < len; current ++){
	    if (str.substring(current,current + 1).equals("*")){
		if (!str.substring(current - 1,current).equals(str.substring(current + 1,current + 2))){
		    stat = false;
		    return stat;
		}
		
	    }
	}
	return stat;
    }
    
    public String sameEnds(String string){
	String s = "";
	int half = string.length() / 2;
	int current = 0;
	int lenS = s.length();
	for (current = 0; current < half; current ++){
	    if (string.substring(0,current + 1).equals(string.substring(string.length() - (current + 1)))){
		s = string.substring(0,current + 1);
		lenS = s.length();
	    }

	}
	return s;
    }

}
