//Kelly Chen and Tina Lee
import java.io.*; 
import java.util.*;

public class For{
    private int result;
    private int count;
    private String rev;

    public int fact(int n){
	for (result = 1; n>=1; n = n-1){
	    result = result * n;
	}
	return result;
    }


    public String Reverse(String s){
	int len = s.length();
	for (rev = "" ; len >0; len -= 1){
	    rev = rev + s.substring((len -1), len);
	}
	return rev;
    }

    public String table(int n, int m){
	String s;
	int xi = 1;
	int yi = 1;

	for (s = "" ; xi <=n; xi += 1){
	    s = s + " " + xi;
	}
	s = s + "\n";
	   for (s = s; yi <= m; yi +=1){
	       s = s + yi;
	       xi = 1;
	       for (s = s ; xi <=n; xi += 1){
		   s = s + " " + (xi * yi);
	       }
	       s = s + "\n";
	   }

	return s; 
    }


}
