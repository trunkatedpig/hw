import java.io.*;
import java.util.*;

public class For {
 
    public int fact2 (int n) {
	int result;
	for (result = 1; n > 1; n--) {
	    result = result * n;
	}
	return result;
    }

    public String Reverse (String word) {
	String result = "";

	for (int i = word.length(); i > 0; i--) {
	    result += word.substring(i-1, i);
	}
	return result;
    }

    public String table(int n,int m) {
	String output = "";
	for (int i = 1;i <= n;i++) {
	    output += i + " ";
	}

	output += "\n";

	for (int h  = 1;h <= m;h++) {
	    output += h + " ";

	    for (int w = h; w <= h * n;w+=h) {
		output += w + " ";
	    }
	    output += "\n";
	}
	return output;
    }
}