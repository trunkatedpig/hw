import java.util.*;
import java.io.*;


public class Rot {


    public String encode(String s, int shift){
	s=s.toLowerCase();
	String end="";
	shift= shift%26;
	for (int x= 0; x<s.length; x++){
	    char b =s.charAt(x);
	    if(b<'a'|| b>'z'){
		end=end+ b;
	    }
	    else {
		if (b+shift<='z'){
		    end=end+(char(b+shift));
		}
		else end= end+(char('a'+(shift-('z'+1-b))));
	    }
	
	}
	return end;
    }