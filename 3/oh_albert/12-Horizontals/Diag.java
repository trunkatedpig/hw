import java.io.*;
import java.util.*;

public class Diag {
    
    public String Diag(int n) {
	String start="";
	int counter;
	for (int m=0;m<=n;m++){
	    for (counter=0;counter <= m;counter++) {
		start = start + " ";
	    }
	    start = start + "*" + "\n";
	}
	return start;
    }

    public String diagWord(String w) {
	int counter,b;
        String begin = "";
	for (b=0;b <= w.length()-1;b++) {
	    for (counter=0;counter <= b;counter++) {
		begin = begin + " ";
	    }
	    begin = begin + w.substring(b,b+1) + "\n";
	}
	return begin;
    }

    public String fence(int h,int w) {
	
    }
	
}
