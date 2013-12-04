import java.io.*;
import java.util.*;

public class For{
    
public String diag(int n){
    String result = "*";
    String thing = "";
    while (n > 0){
	    thing = thing + "\n" + result;
	    result = " " + result;
	    n = n -1;
    }	
    return thing;
}

    public String diagWord(String w){
	String spaces = " ";
	String thing = w.substring(0, 1);
	int n;
	for (n = 1; n < w.length(); n = n + 1){
	    thing = thing + "\n" + spaces + w.substring(n, n + 1);
	    spaces = spaces + " ";
	}
	return thing;
 }

    public String fence(int h, int w){
	String result = "";
	String end = "+";
	String middle = "|";
	int x = 0;
	while (w > 2){
	    end = end + "-";
	    middle = middle + " ";
	    w = w -1;
	}
	if (w == 2){
	    end = end + "+";
	    middle = middle + "|";
	}
        while (x < h){
	    if (x == 0 || x == h - 1){
		result = result + "\n" + end;
		x = x + 1;
	    }
	    else{
		result = result + "\n" +  middle;
		x = x + 1;
	    }
	}
	return result;
    }
}
