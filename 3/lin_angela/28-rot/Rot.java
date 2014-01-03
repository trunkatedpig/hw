import java.util.*;
import java.io.*;



public class Rot{

    public String encode(String s, int n){
	String lc = s.toLowerCase();
	String retS = "";
	for (int i = 0; i<lc.length(); i++){
	    int w = (int)lc.charAt(i);
	    if (w<=(int)'z' && w>=(int)'a'){
		if (w+n>(int)'z')
		    retS = retS + (char)((int)'a'+((int)'z')-w);
		else
		    retS = retS + (char)(w+n);
	    }
	    else
		retS = retS + lc.charAt(i);
	}
	return retS;

	    }







	}
