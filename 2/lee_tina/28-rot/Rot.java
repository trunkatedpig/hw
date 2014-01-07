import java.io.*;
import java.util.*;

public class Rot{
    
    public String encode(String s, int rots){
	String str = s.toLowerCase();
	String code = "";
	char c;
	int tempRots;
	for (int ind = 0; ind < str.length(); ind++){
	    tempRots = rots;
	    c = str.charAt(ind);
	    if (c >= 'a' && c <= 'z'){
		if (c + rots > 'z'){
		    tempRots = rots - ('z' - c) - 1;
		    c = 'a';
		}
		code = code + (char)(c + tempRots);
	    }
	    else
		code = code + c;
	}
	return code;
    }
}
		    
		
