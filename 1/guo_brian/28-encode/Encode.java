import java.io.*;
import java.util.*;

public class Encode {
    
    public String encode(String x, int offset) {
	String temp = x.toLowerCase();
	String result = "";
	for (int i = 0; i < temp.length(); i++) {
	    if (temp.charAt(i) < 'a' || temp.charAt(i) > 'z') {
		result = result.concat(Character.toString(temp.charAt(i)));
		System.out.println(temp.charAt(i));
	    }
	    else if (temp.charAt(i) > 'z'-offset) {
		result = result.concat(Character.toString((char)(temp.charAt(i) -(26- offset))));
		System.out.println(temp.charAt(i));
	    }
	    else if (temp.charAt(i) <= 'z'- offset) {
		result = result.concat(Character.toString((char)(temp.charAt(i) + offset)));
		System.out.println(temp.charAt(i));
	    }
	}
	return result;
    }
}
