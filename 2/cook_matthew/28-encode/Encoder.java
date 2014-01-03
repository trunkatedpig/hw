import java.io.*;
import java.util.*;

public class Encoder {
    public String encode(String s, int n) {
	String test = s.toLowerCase();
	String ret= "";
	for (int q=0; q<test.length(); q++) {
	    if (test.charAt(q)>=97 && test.charAt(q)<=(122-n)) {
		ret = ret + (char)(test.charAt(q) +n);
	    }
	    else if (test.charAt(q)> (122-n) && test.charAt(q) <=122){
		ret=ret + (char) (97+ (n- (122-(test.charAt(q)-1))));
	    }
	    else {
		ret= ret + test.substring(q,q+1);
	    }
	}
	return ret;
    }


}