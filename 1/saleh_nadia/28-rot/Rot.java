import java.io.*;
import java.util.*;

public class Rot {
    public String rot(String s, int x) {
	s = s.toLowerCase();
	for (int i=0;i<s.length();i++) {
	    if ((int)s.charAt(i) <= 122 && (int)s.charAt(i) >= 97) {
		int y = (int)s.charAt(i) + x;
		if (y>122) {
		    y = y-26;
		}
		s = s.substring(0,i) + (char)y + s.substring(i+1);
	    }
	}
	return s;
    }

    public static void main (String args[]){
	Rot r = new Rot();
	System.out.println(r.rot("hello",3));
	System.out.println(r.rot("abcxyz",3));
	System.out.println(r.rot("hi there!",1));

    }
}
