import java.util.*;
import java.io.*;

public class Cipher{
    public String encode(String s, int offset){
	s=s.toLowerCase();
	String encoded = new String();
	for (int i=0; i < s.length(); i++){
	    //non letter characters
	    if ((s.charAt(i) < 'a')||(s.charAt(i)>'z')){
		encoded=encoded + s.charAt(i);
	    }
	    //letter characters
	    else{
		//if it goes over 'z'
		if((char)(s.charAt(i)+(offset%26)) > 'z'){
		    encoded=encoded + ((char)('a'+(s.charAt(i)+(offset%26))-'z'-1));
		}
		else if((char)(s.charAt(i)+(offset%26)) < 'a'){
		    encoded=encoded + ((char)('z'+(s.charAt(i)+(offset%26))-'a'+1));
		}
		else{
		    encoded=encoded + (char)(s.charAt(i)+(offset%26));
		}
	    }
	}
	return encoded;
    }
}
