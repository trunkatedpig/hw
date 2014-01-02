import java.io.*;
import java.util.*;

public class Rot {
    public String rotter(String s, int i){
	s=s.toLowerCase();
	String temp = "";
	for(int j=0;j<s.length();j++){
	    if ((s.charAt(j)<'a')||(s.charAt(j)>'z'))
		temp = temp + s.charAt(j);
	    else{
		if (s.charAt(j)+i<='z')
		    temp = temp + (char)(s.charAt(j)+i);
		else
		    temp = temp + (char)('a'+(i-('z'+1-s.charAt(j))));
	    }
	}
	return temp;
    }
}
