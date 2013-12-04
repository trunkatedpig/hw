import java.io.*;
import java.util.*;

public class For {
    public boolean isPrime(int n) {
	int f;
	for (f=n-1;f>1;f=f-1) {
	    if (n%f == 0) {
		return false;
	    }
	}
	return true;
    }

    public String Reverse(String s) {
	int l = s.length();
        int i;
	String ans = "";
	for (i=0;i<l;i=i+1) {
	    ans = s.substring(i,i+1) + ans;
	}
	return ans;
    }

    public String table(int n, int m) {
	String t = " ";
	int i;
	int x;
	int y;
	for (i=1;i<=n;i=i+1) {
	    t =  t + i + " ";
	}
	t = t + "\n";
	for (y=1;y<=m;y=y+1) {
	    t = t + y + " ";
	    for (x=1;x<=n;x=x+1) {
		t = t + (y*x) + " ";
	    }
	    t = t + "\n";
	}
	return t;
    }
}