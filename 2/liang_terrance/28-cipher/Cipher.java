import java.io.*;
import java.util.*;

public class Cipher {
    
    public String rot(String s, int n){
	String ans = "";
	int place = 0;
	for (int i = 0; i < s.length(); i ++){
	    place = s.charAt(i);
	    if ((place >= "A".charAt(0)) && (place <= "Z".charAt(0))){
		place = place + n;
		if (place > "Z".charAt(0)){
		    place = place - 26;
		}
		if (place < "A".charAt(0)){
		    place = place + 26;
		}
	    }
	    else if ((place >= "a".charAt(0)) && (place <= "z".charAt(0))){
		place = place + n;
		if (place > "z".charAt(0)){
		    place = place - 26;
		}
		if (place < "a".charAt(0)){
		    place = place + 26;
		}
	    }
	    ans = ans + String.valueOf((char)place);
	}
	return ans;
    }



}
