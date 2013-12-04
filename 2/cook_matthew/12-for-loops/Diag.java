import java.io.*;
import java.util.*;

public class Diag {
    public String diag(int n){
	String ret="";
	for (int q=0; q<=n; q++) {
	    for (int j = q; j>0; j--) {
		ret = ret + " ";
	    }
	    ret = ret + "*\n";
	}
	return ret;
    }
    public String diagWord(String w) {
	String ret = "";
	for (int q= 0; q<w.length(); q++) {
	    for (int j=q; j>0; j--) {
		ret = ret + " ";
	    }
	    ret = ret + w.substring(q,q+1) + "\n";
	}
	return ret;
    }

    public String fence(int h, int w) {
	int i= h-2;
	int j= w-2;
	String r1 = "+";
	for (int q=0; q<j; q++) {
	    r1 = r1 + "-";
	}
	r1 = r1 + "+\n";
	String r2= "|";
	for (int r=0; r<j; r++) {
	    r2 = r2 + " ";
	}
	r2 = r2 + "|\n";
	String ret=r1;
	for (int s=0; s<i; s++) {
	    ret = ret + r2;
	}
	ret = ret + r1;
	return ret;
    }

}