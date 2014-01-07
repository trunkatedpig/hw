import java.io.*;
import java.util.*;

public class Caesar {

    public static void main(String[] args){
	Caesar c = new Caesar();
	System.out.println(c.encode("Zoidberg", 3));
	System.out.println(c.encode("FISH", 6));
	System.out.println(c.encode("!a!", 13));
    }

    public String encode(String s, int i) {
	String s2,s3;
	s2 = s.toLowerCase();
	s3 = "";
	for (int j = 0; j < s2.length(); j++){
	    char c = s2.charAt(j);
	    if ((c > 'z') || (c < 'a'))
		s3+=c;
		else{
		    if (c+i<='z')
			s3+=(char)(c+i);
		    else
			s3+=(char)('a'+(i-('z'+1-c)));
		}
	}
        return s3;
    }

}
