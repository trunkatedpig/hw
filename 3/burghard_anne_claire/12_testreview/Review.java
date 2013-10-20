import java.util.*;
import java.io.*;

public class Review {
    
    public String diag (int n) {
	String answer = "";
	int line;
	for (line = 0; line < n; line = line + 1) {
	    int space;
	    for (space = line; space > 0; space = space - 1) {
		answer = answer + " ";
	    }
	    answer = answer + "* \n";
	}
	return answer;
    }

    public String diagWord (String w) {
	String answer = "";
	int length = w.length();
	int line;
	for (line = 0; line < length; line = line + 1) {
	    int space;
	    for (space = line; space > 0; space = space - 1) {
		answer = answer + " ";
	    }
	    answer = answer + w.substring(0,1) + "\n";
	    w = w.substring(1);
	}
	return answer;
    }
    
    public String fence (int h, int w) {
	String answer = "";
	String top = "+";
	String middle = "|";
	int hh = h -2;
	int ww = w -2;
	for (int i = 0; i < ww; i = i + 1) {
	    top = top + "-";
	}
	top = top + "+\n";
	for (int i = 0; i < ww; i = i + 1) {
	    middle = middle + " ";
	}
	middle = middle + "|\n";
	for (int line = 0; line < h; line  = line + 1) {
	    if (line == 0 || line == (h-1)){
		answer = answer + top;
	    }
	    else {
		answer = answer + middle;
	    }
	}
	return answer;
    }
}
	    


