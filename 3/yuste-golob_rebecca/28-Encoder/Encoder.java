import java.io.*;
import java.util.*;

public class Encoder{
    

    public String encode(String s, int n){
	s = s.toLowerCase();
	String result = "";
	for (int i = 0; i < s.length(); i ++){
	    char c = s.charAt(i);

	    if (c<97 || c>122){
		result = result + (char)c;
	    } else if ( (c+n) > 122){
		int j = (c+n) - 122;
		result = result + (char)(97 + j);
	    } else {
		result = result + (char)(c + n);
		
	    }
	}
	return result;

    }

}
