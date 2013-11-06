import java.io.*;
import java.util.*;

public class CodingBat{
    //tested on CodingBat, no need for Driver
    public boolean sameStarChar(String str) {
 	boolean ans = true;
	for (int i = str.length()-1;i>1;i--){
	    if (str.substring(i-1,i).equals("*") && ! str.substring(i-2,i-1).equals(str.substring(i,i+1)))
		ans = false;
	}
	return ans;
    }

    public String sameEnds(String string) {
	String ans = "";
	int n = string.length();
	int half = (int)(n/2);
	for (int i=1;i<half+1;i++){
	    if (string.substring(0,i).equals(string.substring(n-i,n)))
		ans = string.substring(0,i);
	}
	return ans;
    }
}
