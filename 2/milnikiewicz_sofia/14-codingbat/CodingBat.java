import java.io.*;
import java.util.*;

public class CodingBat{
    public boolean sameStarChar(String str) {
	int x, n;
	n = str.length();
	for (x=0;x<n-1;x+=1){
	    if (str.substring(x,x+1).equals("*")) {
		if (x==0)
		    continue;
		if (!str.substring(x-1,x).equals(str.substring(x+1,x+2)))
		    return false;
	    }
	}
	return true;
    }

    public String sameEnds(String string) {
	int x,n;
	String ans = "";
	n = string.length();
	for (x=0;x<=n/2;x+=1){
	    for (int m=n/2; m<n; m+=1){
		if (string.substring(0,x).equals(string.substring(m)))
		    ans = string.substring(0,x);
	    }
	}
	return ans;
    }    

}
