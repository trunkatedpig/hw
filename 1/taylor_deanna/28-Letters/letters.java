import java.io.*;
import java.util.*;

public class letters{
    
    public String rearrange(int x, String word){
	word = word.toLowerCase();
	String answer = "";
	for (int i=0; i<word.length(); i++){
	    char c = word.charAt(i);
	    
	    if (c<97 || c>122){
		answer = answer + (char)c;
	    }
	    else if ( (c+x) > 122){
		int d = c + x - 122;
		answer = answer + (char)(97+d);
	    }
	    else {
		answer = answer + (char)(c+x);
	    }
	}
	return answer;
    }
}
		
