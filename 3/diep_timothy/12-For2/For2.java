import java.io.*;
import java.util.*;

public class For2 {
    public String diag(int n) {
	String result = "";
	String space = "";
	for (int i = 0;i<n;i++) {
	    if (i == n-1) 
		result = result + space + "*";
	    else
		result = result + space + "*\n";
	    space = space + " ";
	}
	return result;
    }

    public String diagWord(String s) {
	String result = "";
	String space = "";
	for (int i = 0;i<s.length();i++) {
	    if (i == s.length()-1) 
		result = result + space + s.substring(i);
	    else
		result = result + space + s.substring(i,i+1) + "\n";
	    space = space + " ";
	}
	return result;
    }

    public String fence (int a, int b) {
	String result = "";
	String space = "";
	String dash = "";
	if (a == b && a == 1)
	    result = "+";
	for (int i = 1;i<=b;i++) {
	    dash = dash + "-"
    }
}
