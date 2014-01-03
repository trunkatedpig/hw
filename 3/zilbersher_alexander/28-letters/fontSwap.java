import java.io.*;
import java.util.*;


public class fontSwap {

    public String encode(String s, int i) {
	String l = s.toLowerCase(); 
	char[] c = s.toCharArray();
	for (int j = 0;j < c.length;j++) {
	    if (c[j] == ' '|| c[j] == '!' || c[j] == '?') {
	    } else if ((int)c[j] + i > 122) {
		c[j] = (char)((((int)c[j] + i)-122)+97);
	    } else {   
		c[j] = (char)((int)c[j] + i);
	    }
	}
	return new String(c);
    }
}