import java.util.*;
import java.io.*;

public class Cipher{
    
    public static void main(String[] args){
	Cipher c = new Cipher();
	System.out.println(c.encode("hello", 3));
	System.out.println(c.encode("hello!", 29));
	
}

    public String encode(String s, int offset){
	s = s.toLowerCase();
	String result = "";
	String alp = "abcdefghijklmnopqrstuvwxyz";
	for(int i = 0; i < s.length(); i ++){
	    if ( s.charAt(i) <= 'z' && s.charAt(i) >= 'a'){
	        int x = offset%26 + s.charAt(i);
		if (x < 97){
		    x = x + 26;
		}
		else if (x > 122){
		    x = x - 26;
		}
		result = result + alp.charAt(x - 97); 
	}
	    else{
		result = result + s.charAt(i);
    }
}
	return result;
    }
}
