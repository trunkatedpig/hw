import java.io.*;
import java.util.*;

public class For {
    
    public int factf(int n) {
	int ans = 1;
	for (int count = 1;count != n;n = n - 1) {
	    ans = ans * n;
	}
	return ans;
    }

    public String reverse(String s) {
	int length;
	String result = "";
	for (length = s.length();length != 0;length = length - 1) {
	    result = result + s.substring(length-1);
	    s = s.substring(0,length-1);
	}
	return result;
    }

    public String table(int n, int m) {
	int countn,countm;
	String result = "  ";
	for (countn = 1;countn != n+1;countn++) { 
	    result = result + countn + " ";
	}
	result = result + "\n";
	for (countm = 1;countm != m+1;countm++) {
	    result = result + countm + " ";
	    for (countn = 1;countn != n+1;countn++) {
		result = result + countm*countn + " ";
	    }
	    result = result + "\n";
	}
	return result;
    }
}
