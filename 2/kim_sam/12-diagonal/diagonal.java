import java.io.*;
import java.util.*;

public class diagonal {
    
    //for loop
    public String diag(int n) {
	int i;
	String result = "";
	int space;
	for (i = 0; i != n; i++){
	    for (space = 0; space < i; space++) {
		result = result + " ";
	    }
	    result = result + "*\n";    
	}
	return result;
    }
    //for loop
    public String diagWord(String w) {
	int i;
	String result = "";
	int space;
	int l = w.length();
	for (i = 0; i != l; i++) {
	    for (space = 0; space < i; space++) {
		result = result + " ";
	    }
	    result = result + w.substring(i, i + 1) + "\n";
	}
	return result;
    }
    //while loop
    public String fence(int h, int w) {
	int i = 0;
	int j = 0;
	String result = "";
	while (i == 0) {
	    if (j == 0) {
		result = result + "+";
		j++;
	    }
	    else if (j == w) {
		result = result + "+\n";
		j = 0;
		i++;
	    }
	    else if (j < w && j != 0) {
		result = result + "-";
		j++;
	    }
	}
	while (i < h && i != 0) {
	    if (j == 0) {
		result = result + "|";
		j++;
	    }
	    else if (j == w) {
		result = result + "|\n";
		j = 0;
		i++;
	    }
	    else if (j < w && j != 0) {
		result = result + " ";
		j++;
	    }
	}
	while (i == h) {
	    if (j == 0) {
		result = result + "+";
		j++;
	    }
	    else if (j == w) {
		result = result + "+";
		i++;
	    }
	    else if (j < w && j != 0) {
		result = result + "-";
		j++;
	    }
	}
	return result;
    }
}
