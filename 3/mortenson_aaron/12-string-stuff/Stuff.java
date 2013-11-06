import java.io.*;
import java.util.*;

public class Stuff {

    public String chars(int i,String s ) {
	String result = "";
	for (;i > 0;i--) {
	    result = result + s;
	}
	return result;
    }

    public String diag(int n) {
	String result = "";
	for (int i = 0;i < n;i++) {
	    result = result + chars(i," ") + "*\n" ;
	}
	return result;
    }

    public String diagWord(String s) {
	String result = "";
	int n = s.length();
	for (int i = 0;i < n;i++) {
	    result = result + chars(i," ") + s.charAt(i)  +"\n" ;
	}
	return result;
    }

    public String fence(int h, int w) {
	String result = "";
	if (h <= 2 || w <= 2) {
	    return result;
	}
	else {
	    result = result + "+" + chars (w-2,"-") + "+\n";
	    for (;h >= 2;h--) {
		result = result + "|" + chars (w-2," ") + "|\n";
	    }
	    result = result + "+" + chars (w-2,"-") + "+\n";
	    return result;
	}
    }
}