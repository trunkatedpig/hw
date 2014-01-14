import java.util.*;
import java.io.*;

public class Converter{
    public String convert(String s, int n){
	s = s.toLowerCase();
	String ans = "";
	for (int i = 0; i<s.length(); i ++){
	    char x = s.charAt(i);
	    if(x<'a' || x > 'z'){
		ans = ans + x;
	    }
	    else {
		if (x + n > 'z'){
		    ans = ans + (char)(x+n-26);
		}
		else {
		    ans = ans + (char)(x+n);
		}
	    }
	}
	    return ans;
    }
}
