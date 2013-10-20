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
	String fence = "";
	if (h == 1 && w == 1) {
	    fence = fence + "+";
	} else {
	    for (int top = w;top>0;top--){
		if (top == w || top == 1) {
		    fence = fence + "+";
		}else{
		    fence = fence + "-"; }
	    }
	    for (int middle = h-2;middle>0;middle--) {
		fence = fence + "\n";
		for (int sect = w;sect>0;sect--) {
		    if (sect == w || sect == 1) {
			fence = fence + "|";
		    } else {
			fence = fence + " "; }
		}
	    }
	    fence = fence + "\n";
	    for (int bottom = w;bottom>0;bottom--) {
		if (bottom == w || bottom == 1) {
		    fence = fence + "+";
		}else{
		    fence = fence + "-"; }
	    }}
	return fence;}	
}
