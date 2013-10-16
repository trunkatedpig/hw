import java.io.*;
import java.util.*;

public class ForLoops {
    public int fact(int n) {
	int result = 1;
	for (n=n; n>=1; n=n-1) {
	    result = result * n;
	}
	return result;
    }

    public String Reverse(String n) {
	int i;
	String result=n.substring(n.length()-1);
	for (i = n.length()-2; i>=0; i=i-1) {
        result = result + n.substring(i,i+1);
	}
	return result;
    }
    
    public String table(int n, int m) {
	int i;
	int x;
	String a = "";
	String b = "";
	String c = "";
	for (i = 1; i<=n; i=i+1) {
	    a = a + i; // first vertical row 1,2,3,4,5
	}
	for (i=1; i<=m; i=i+1) {
	    c = c + i;
	    for (x=1; x<=n; x=x+1) {
		c = c + x*i;
	    }
	    c = c + "\n";
	}
	return a + "\n" + c;
    }

	    
}

	    
