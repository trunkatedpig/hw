import java.io.*;
import java.util.*;

public class Diag {

    public String diag(int i) {
	String output = "";
	String increment = "";
	for (;i>0;i--) {
	    output = output + "\n" + increment + "*";
	    increment = increment + " ";
	}
	return output;
    }
 
    public String diagWord(String s) {
	String output = "";
	String increment = "";
	for (int i=0;i<s.length();i++) {
	    output = output + "\n" + increment + s.substring(i,i+1);
	    increment = increment + " ";
	}
	return output;
    }

    public String fence(int i, int j) {
	String output = "";
	for (;i>0;i--) {
	    if (output.equals("") || i == 1) {
		output = output + "+";
		for (int k = j-2;k>0;k--) {
		    output = output + "-";
		}
		output = output + "+\n";
	    } else {
		output = output + "|";
		for (int k = j-2;k>0;k--) {
		    output = output + " ";
		}
		output = output + "|\n";
	    }
	}
	return output;
    }
}
