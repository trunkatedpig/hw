import java.io.*;
import java.util.*;

public class classtests {

    public String diag (int n) {
	String result = "";
	for (int i = 1;i <= n; i++) {
	    for (int spaces = 1; spaces < i; spaces++) {
		result = result + " ";
	    }
	    result = result + "*" + "\n";
	}
	return result;
    }
    
    public String diagword (String n) {
	String result = "";
	for (int i = 0; i <= n.length()-1; i++) {
	    for (int spaces = 0; spaces < i; spaces ++) {
		result = result + " ";
	    }
	    result = result + n.substring(i,i+1) + "\n";
	}
	return result;
    }

    public String fences (int h,int w) {
	String result = "+";
	for (int i = 1; i < w-1; i++)
	    result = result + "-";
	result = result + "+ \n";
	for (int i = 1; i < h - 1; i++) {
	    result = result + "|";
	    for (int j = 1; j < w - 1; j++) 
		result = result + " ";
	    result = result + "| \n";
	}
	result = result + "+";
	for (int i = 1; i < w - 1; i ++)
	    result = result + "-";
	result = result + "+";
	return result;
    }
}