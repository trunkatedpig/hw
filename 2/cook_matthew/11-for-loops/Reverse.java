import java.io.*;
import java.util.*;

public class Reverse {
    private String r = "";
    public String toReverse(String s) {
	int i;

	for (i=s.length() - 1; i>=0; i--) {
	    r= r + s.substring(i, i+1);
	}
	return r;
    }
    public boolean isPrime(int n){
        
	for (int q=2; q<n; q=q+1){
	    if (n%q == 0) {
		return false;
	    }
	    else {
		q=q+1;
	    }
	}
	return true;
    }
    public String table(int n, int m) {
	String s = "";
	for (int i=1; i<=n;i++) {
	    s= i + " ";
	}
	s+= "\n";
	for (int j=1; j <=m; j++) {
	    s+= j+ " ";
	    for (int k=1; k<=n; k++) {
		s= s+(k*j) + " "; 
	    }
	    s = s+ "\n";
	}
	return s;
    }
    /*
    public String table(int n, int m){
        String r = "";
        for (int j=1;j<=n;j++){
	    r += j + " ";
        }
        r += "\n";
        for (int x=1;x<=m;x++){
	    r += x + " ";
	    for (int y=1;y<=n;y++){
                r += y * x + " ";
	    }
	    r += "\n";
        }
        return r;
    }
    */
    
}

