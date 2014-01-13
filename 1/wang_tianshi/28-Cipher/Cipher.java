import java.io.*;
import java.util.*;

public class Cipher{
    
    public String rotate (String s, int i){
	String ans = "";
	s=s.toLowerCase();

	for (int x = 0; x<s.length(); x++){	    
	    char c = s.charAt(x);
	    if (c < 'a' || c > 'z'){
		ans+=c;
	    }
	    else{
		if (c+i>'z')
		    ans+=(char)(c+i-26);
		else
		    ans+=(char)(c+i);
	    }
	}
	return ans;

    }
}
