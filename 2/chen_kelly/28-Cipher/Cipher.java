import java.util.*;
import java.io.*;


public class Cipher{

    public String encode(String s, int offset){
	String ans = "";
	//not changing s directly in case we need s again
	String sLower = s.toLowerCase();

	for(int i = 0; i < sLower.length() ; i++){
	    if ((sLower.charAt(i) < 'a')&& (sLower.charAt(i)>'z')){
		ans = ans + sLower.charAt(i);
	    }
	    else{
		if(sLower.charAt(i) + offset <= 'z')
		    ans = ans + (char)(sLower.charAt(i) + offset);
		else
		    ans = ans + (char)('a' + (offset - ('z' - sLower.charAt(i))));
	    }

	}
	return ans;
    }

}
