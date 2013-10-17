import java.io.*;
import java.util.*;

public class For {

    private int small, big;   

    public void smallBig(int a, int b) {
	if (a > b) {
	    big = a;
	    small = b;
	}
	else {
	    big = a;
	    small = b;
	}
    }    

    public int GCDfor(int a, int b) {
	smallBig(a, b);

	for ( ;big%small != 0 ;small --) {
	}
	return small;
    }

    public String Reverse(String s) {
	int index;
	String ans = "";

	for (index = s.length(); index > 0; index --) {
	    ans = ans + s.substring(index-1, index);
	}

	return ans;
    }

    public String table (int n, int m) {
	String ans = "";
	int ncount, mcount;

	for (mcount = 0; mcount <= m; mcount ++) {
	    if (mcount == 0) {
		ans = ans + "  ";
	    }
	    else {
		ans = ans + mcount + " ";
	    }
	    
	    for (ncount = 1 ;ncount <= n; ncount ++) {
		if (mcount == 0) {
		    ans = ans + ncount + " ";
		}
		else {
		    ans = ans + ncount*mcount + " ";
		}
	    }
	    
	    ans = ans + "\n";
	}

	return ans;
    }

}