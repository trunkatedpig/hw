import java.io.*;
import java.util.*;

public class Caesar {

    public String  encode(String s, int i) {
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
