import java.io.*;
import java.util.*;

public class Pictures{

    public String addSpaces(int n) {
	String ans = "";
	while(n>0) {
	    ans = ans + " ";
	    n--;
	}
	return ans;
    }
    
    public String diag(int n) {
	String ans = "";
	for(int i = 0; i < n; i++)
	    ans = ans + addSpaces(i) + "*\n";
	return ans;
    }
    
    public String diagWord(String s) {
	String ans = "";
	for(int i = 0; i < s.length(); i++)
	    ans = ans + addSpaces(i) + s.substring(i,i+1) + "\n";
	return ans;
    }

     public String fence(int b, int h) {
	 String ans = "", firstlast = "+", temp = "", middle = "";
	 int base = b;
	 while(base>2) {
	     temp = temp + "-";
	     base--;
	 }
	 firstlast = firstlast + temp + firstlast + "\n";
	 temp = "|" + addSpaces(b-2) + temp + "\n";
	 for(h;h>2;h--)
	     middle = middle + temp;
	 return firstlast + middle + firstlast;
     }

}