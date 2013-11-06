import java.io.*;
import java.util.*;

public class For {
    
    private int s;
    private String p;
    
    public boolean isPrime(int s) {
	double bound = s/2;
	int counter;
	for (counter = 2;counter <= bound;counter ++) {
	    if (s%counter == 0) {
		return false; }
	}
	return true;
    }

    public String Reverse(String p) {
	int length;
	String start = "";
	for (length=p.length()-1;length >= 0;length --) {
	    start = start + p.substring(length,length+1);
	}
	return start;
    }

    public String table(int n,int m) {
	
    }
