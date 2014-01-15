import java.util.*;
import java.io.*;

public class caesar {

    public String encode(String word, int shift){

	word = word.toLowerCase();
	String ans = "";


	for(int i = 0; i < word.length(); i++) {
	    
	    if ((word.charAt(i) < 'a')
		||
		(word.charAt(i) > 'z')){
		
		ans += word.charAt(i);
	    }
	    
	    else {
		if (word.charAt(i) + shift <='z')
		    ans += (char)(word.charAt(i)+shift);
		else
		    ans += (char)('a'+(shift - ('z' + 1 - word.charAt(i))));
	    }
	}
	return ans;
    }
}
