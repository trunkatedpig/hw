import java.io.*;
import java.util.*;

public class For {
    public int fact2 (int n ) {
	int n3 = 1;
	for (int n2 = n ; n2 > 0; n2 = n2 - 1) {
	    n3 = n3 * n2;
	}
	return n3;
    }

    public String Reverse (String s) {
	String r = "";
	for (int x = s.length ()- 1 ; x >= 0 ; x = x - 1) {
		r = r + s.substring (x, x + 1);
	    }
	return r;
    }

    public String table (int n, int m ) {
	String r = "";
	String l = "";
	for (int x = n ; x > 0 ; x = x - 1) {
	    r = x +  " " + r ;
	    for (int y = n * m; y > 0; y = y - m) {
		l =  y + " " + l;
	    }
	    l = "\n"  + l;
	    m = m - 1;
			      
	}
	return r + l;
    }
}
	
	
	    
						     
