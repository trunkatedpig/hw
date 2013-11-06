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

    public String fence(int a, int b) {
	String result = "";
	String top = "+";
	String space = "|";

	for (int i = 1;i<b-1;i++) {
	    top = top + "-";
	    if (i == b-2) 
		top = top + "+";
	}

	if (a == 1) {
	    result = result + top;
	    return result;
	} else
	    result = result + top + "\n";

	for (int j = 1;j<b-1;j++) {
	    space = space + " ";  
	    if (j == b-2)
		space = space + "|";
	}

	for (int k = 1;k<a-1;k++) {
	    if (b == 1) {
		for (int n = 1;n<a-1;n++)
		    result = result + space + "\n";
		result = result + top;
		return result;
	    }
	    result = result + space + "\n";
	}

	result = result + top;
	return result;
    }
}
