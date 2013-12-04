import java.io.*;
import java.util.*;

public class For {

    public String diag(int n) {
	int count;
	String result = "";
	for (count = 0; count < n; count ++) {
	    for(int count2 = 0; count2 < count; count2 ++) {
		result = result + " ";
	    }
	    result = result + "*\n";
	}
	return result;
    }

    public String diagWord(String s) {
	int count;
	String result = "";
	for (count = 0; count < s.length(); count ++) {
	    for (int count2 = 0; count2 < count; count2 ++) {
		result = result + " ";
	    }
	    result = result + s.substring(count, count + 1) + "\n";
	}
	return result;
    }

    public String fence(int a, int b) {
	String result = "";
	int acount, bcount;

	for (bcount = 1; bcount <= b; bcount ++) {
	    for (acount = 1; acount <= a; acount ++) {
		if ((bcount == 1) || (bcount == b)) {
		    if ((acount == 1) || (acount == a)) {
			result = result + "+";
		    }
		    else {
			result = result + "-";
		    }
		}
		else {
		    if ((acount == 1) || (acount == a)) {
			result = result + "|";
		    }
		    else {
			result = result + " ";
		    }
		}
	    }
	    result = result + "\n";
	}
	return result;
    }

}