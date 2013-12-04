import java.io.*;
import java.util.*;

public class For {

    private int product;
    public int fact2(int n){
	for (product = 1; n > 1; n--){
	    product = product * n;
	}
	return product;
    }

    public String Reverse(String s){
	String reversed = "";
	for (int x = s.length(); x > 0; x--){
	    reversed += s.substring(x-1,x);
	}
	return reversed;
    }

    public String table(int n, int m){
	String s;
	int x = 1;
	int y = 1;

	for (s = ""; x <= n; x += 1){
	    s = s + " " + x;
	}
	s = s + "\n";
	for (s = s; y <= m; y += 1){
	    s = s + y;
	    x = 1;
	    for (s = s; x <=n; x += 1){
		s = s + " " + (x * y);
	    }
	    s = s + "\n";
	}
	return s;
    }

}
