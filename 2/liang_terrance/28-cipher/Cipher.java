import java.io.*;
import java.util.*;

public class Cipher {
    
    public String rot(String s, int n){
	String ans = "";
	int place = 0;
	for (int i = 0; i < s.length(); i ++){
	    place = s.charAt(i);
	    if ((place >= 'A') && (place <= 'Z')){
		place = place + n;
		if (place > 'Z'){
		    place = place - 26;
		}
		if (place < 'A'){
		    place = place + 26;
		}
	    }
	    else if ((place >= 'a') && (place <= 'z')){
		place = place + n;
		if (place > 'z'){
		    place = place - 26;
		}
		if (place < 'a'){
		    place = place + 26;
		}
	    }
	    ans = ans + String.valueOf((char)place);
	}
	return ans;
    }



}
