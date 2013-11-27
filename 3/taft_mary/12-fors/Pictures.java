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
	 if (b<2||h<2)
	     return "Invalid input.\n";
	 String topbottom = "+", middle = "|", ans;
	 int base = b, height;
	 while (base > 2) {
	     topbottom = topbottom + "-";
	     middle = middle + " ";
	     base = base - 1;
	 }
	 topbottom = topbottom + "+\n";
	 middle = middle + "|\n";
	 ans = topbottom;
	 for(height = h; height > 2; height--)
	     ans = ans + middle;
	 ans = ans + topbottom;
	 return ans;
     }

}
