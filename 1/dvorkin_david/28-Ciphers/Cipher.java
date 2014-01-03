import java.util.*;
import java.io.*;

public class Cipher{

    public String encode (String code, int offset){
	String s = code.toLowerCase();
	String whole = new String();
	for (int i = 0; i < s.length(); i++) {
	    char c = s.charAt(i);
	    if (c >= 'a' && c <= 'z'){
		c += offset;
		whole += c;
	    }
	    else{
		c += 0;
		whole += c;
	    }
	}
	return whole;
    }
}
