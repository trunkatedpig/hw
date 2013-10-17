import java.io.*;
import java.util.*;

public class For {
    
    private int ans;
    private String result, tbl;

    // rewritten factorial 
    public int fact (int n) {
	ans = 1;
	for (int x=1; x<=n; x++){
	    ans = ans * x;
	}
	return ans;
    }

    // Reverse
    public String Reverse (String s) {
	result = "";
	for (int i=s.length()-1; i>=0; i=i-1) {
	    result = result + s.substring(i,i+1);
	}
	return result;
    }

    // table
    public String table (int n, int m) {
	tbl="";
	for (int y=0; y<=m; y++) {
	    for (int x=0; x<=n; x++) {
		if (y==0 && x!=n) {
		    tbl = tbl + " " + x;
		}
		else if (y==0 && x==n) {
		    tbl = tbl + " " + x + "\n";
		}
		else if (x!=n) {
		    if (x==0) {
			tbl = tbl + " " + y;
		    }
		    else {
			tbl = tbl + " " + x*y;
		    }
		}
		else {
		    tbl = tbl + " " + x*y + "\n";
		}
	    }
	}
	return tbl;
    }
}
	    
