import java.util.*;
import java.io.*;

public class Diag {
    public String diag (int n) {
	String s = "*\n";
	String result = s;
	int i;
	for (i = 0; i < n; i++) {
	    s = " " + s;
	    result = result + s;
	}
	return result;
    } 

    public String diagWord(String s) {
	String result = "";
	int i;
	int j;
	for (i = 0; i < s.length() ; i ++) {
	    String space = "";
	    for (j = i; j > 0; j --) {
		space = space + " ";
	    }
	    result = result + space + s.substring(i, i + 1) + "\n";
	}
	return result;
    
    }

    public String fence (int h, int w) {
	int i;
	int j;
	String result = "+";
	for (i = w - 2; i > 0; i = i - 1) {
	    result = result + "-";
	}
	result = result + "+\n";
	for (i = h - 2; i > 0; i = i - 1) {
	    String space = "";
	    for (j = w - 2; j > 0; j --) {
		space = space + " ";
	    }
	    result = result + "|" + space + "|\n";
	}
	result = result + "+";
	for (i = w - 2; i > 0; i = i - 1) {
	    result = result + "-";
	}
	result = result + "+";
	return result;
    }
}

    
