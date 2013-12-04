import java.util.*;
import java.io.*;

public class For{
    public int fact(int n){
	int x = 1;
	for (n=n; n > 0; n--){
	    x = x * n;
	}
	return x;
    }

    public String reverse(String s){
	String x = "";
	int l = s.length();
	for (l = l; l>0; l--){
	    x = x + s.substring(l-1, l);
	}
	return x;
    }
    
    public String table(int n, int m){
	String s = "";
	s = s + "  | ";
	for (int x = 1; x<= n; x++){
	    s = s + x + "  ";
	}
	s = s + "\n";
	for (int x = 1; x <= m; x++){
	    s = s + x + " | ";
	    for (int y = 1; y <= n; y++){
		if ((y*x) >= 10)
		    s = s + (y*x) + " ";
		else
		    s = s + (y*x) + "  ";
	    }
	    s = s + "\n";
	}
	return s;
    }
}
