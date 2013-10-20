import java.io.*;
import java.util.*;

public class Lupz {
    public String diag (int n) {
	String result = "";
	while (n > 0) {
	    for (int i = n; i>0; i--){
		result = result + " ";
	    }
	    result = result.substring (0,n) + "*\n" + result;
	    n --;
	}
	return result;
    }

     public String diagWord (String word) {
	String result = "";
	int n = word.length();
	while (n > 0) {
	    for (int i = n; i>0; i--){
		result = result + " ";
	    }
	    result = result.substring (0,n) + word.substring (n-1, n) + "\n" + result;
	    n --;
	}
	return result;
    }

     public String fence (int h, int w) {
	String result = "";
	String firstline = "+";
	String line = "|";
	for (int i = w; i > 2; i --) {
	    firstline += "-";
	    line += " ";
	}
	firstline += "+";
	line += "|";
	result = firstline + "\n";
	for (int x = h - 2; x > 0; x --) {
	    result += line + "\n";
	}
	result += firstline;
	return result;
     }
}
