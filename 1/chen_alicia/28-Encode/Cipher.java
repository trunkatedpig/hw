import java.util.*;
import java.io.*;

public class Cipher {

    public String encode(String s, int offset){
	s = s.toLowerCase();
	String r = "";
	for (int i = 0; i<s.length(); i++){
	    if ((s.charAt(i) < 'a') || (s.charAt(i) > 'z')){
		r = r + s.charAt(i);
	    }
	    else{
		if (s.charAt(i) + offset <='z'){
		    r = r +(char)( s.charAt(i)+offset);
		}
		else {
		    r = r + (char)('a'+(offset - ('z'- s.charAt(i)) -1));
		}
	    
	    }
	    
	}
	return r;
    }
}
