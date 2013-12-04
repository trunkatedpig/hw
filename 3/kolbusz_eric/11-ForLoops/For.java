import java.util.*;
import java.io.*;

public class For {
    
    public boolean isPrimeF(int a) {
	int b = a-1;
	for (; a%b != 0; b--) {}
	return b==1;
    }
 
    public String Reverse(String s) {
	String returnstring = "";
	int len = s.length();
	for (int k = 0; k < len; k++) {
	    int len2 = s.length();
	    returnstring = returnstring + s.substring(len2-1);
	    s = s.substring(0,len2-1);}
	return returnstring;
    }

    public String table(int n, int m) {
	//X|1 2 3 4 5
	//-+----------
	//1|1 2 3 4 5
	//2|2 4 6 8 10
	String returnstring = "X|";
	for (int j = 1; j <= n; j++) {
	    returnstring = returnstring + j + " ";}
	returnstring = returnstring + "\n-+";
	for (int i = 1; i <=n; i++) {
	    returnstring = returnstring + "--";}
	returnstring = returnstring + "\n";
	for (int k = 1; k <= m; k++) {
	    returnstring = returnstring + k + "|";
	    for (int j = 1; j <= n; j++) {
		returnstring = returnstring + j*k + " ";
	    }
	    returnstring = returnstring + "\n";
	}
	return returnstring;
    }
}



     
	   
