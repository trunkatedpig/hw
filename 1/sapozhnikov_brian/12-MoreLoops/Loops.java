import java.io.*;
import java.util.*;

public class Loops {
    public String help(int n, String s){
	String ans = "";
	for (;n>0;n--)
	    ans = ans + s;
	return ans;
    }
    
    public String diag(int n){
	String ans = "";
	int i = 0;
	/*without helper function
	for (;i<n;i++){
	    for (int k = i;k>0;k--){
		ans = ans + " ";
	    }
	    ans = ans + "*\n";
	}
	*/

	//with helper function
	for (;i<n;i++)
	    ans = ans + help(i," ") + "*\n";
   	return ans;
    }

    public String diagWord(String s){
	String ans = "";
	int i = 0;
	/*without helper
	for (;i<s.length();i++){
	    for (int k = i;k>0;k--){
		ans = ans + " ";
	    }
	    ans = ans + s.substring(i,i+1) + "\n";
	}
	*/

	//with helper
	for (;i<s.length();i++)
	    ans = ans + help(i," ") + s.substring(i,i+1) + "\n";
	return ans;
    }
    
    public String fence(int h, int w){
	String ans = "";
	String spaces = help(w - 2, " ");
	String dashes = help(w - 2, "-");
	if (h>1 && w>1){
	    for (int a = 0;a<h;a++){
		if (a == 0 || a == h - 1)
		    ans = ans + "+" + dashes + "+";
		else
		    ans = ans + "|" + spaces + "|";
		ans = ans + "\n";
	    }
	}
	return ans;
    }
}
