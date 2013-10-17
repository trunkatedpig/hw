import java.io.*;
import java.util.*;

public class ForLoops{
     //worked with Justin Weltz on this part
    public int GCD3(int a, int b){
	int g = 0;
	if (a < b)
	    g = a;
	else 
	    g = b;
	for (g = g;(b % g) != 0 || (a % g) != 0; g =g -1){
	}
	return g;
    }

    //got help on the rest of the code from Justin
    public String Reverse(String s){
	String newstring = "";
	for(int n = (s.length() - 1); n >= 0;n = n - 1){
	    newstring = newstring + s.substring(n, n + 1);
	}
	return newstring;
    }

    public String table(int n, int m){
        String newstring = "";
	for(int g = 1; g <= n; g = g + 1){
	    newstring = newstring + " " + g;
	}
	newstring = newstring + "\n";
	for(int i = 1; i <= m; i = i + 1){
	    newstring = newstring + i + " ";
	    for (int q = 1; q <= n; q = q + 1){
		newstring = newstring + (i * q) + " ";
	    }
	    newstring = newstring + "\n";
	}
	return newstring;
    }
}
	    
	    
