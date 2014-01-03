import java.util.*;
import java.io.*;

public class Convert{
    
    public String encode(String c, int z){
	c = c.toLowerCase();
	String s = "";
	for(int i = 0; i < c.length(); i++){
	    int q = (int)c.charAt(i);
	    if(q>= 97 && q<=122){
		q = q + z;
		if(q>= 97 && q<=122){
		    char g = (char)q;
		    s = s + g;
		}
		if(q>122){
		    int h = q - 122;
		    char g = (char)(96 + h);
		    s = s + g;
		}
		if(q<97){
		    int h = 97 - q;
		    char g = (char)(123 - h);
		    s = s + g;
		}
	    }
	    else{
		s = s + c.charAt(i);
	    }
	}
	return s;
    }
}
