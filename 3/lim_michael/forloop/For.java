import java.io.*;
import java.util.*;

public class For {
    private String s;
    private int length;
    private String s1, s2, result;

    public void deletter(String s) {
	s1 = s.substring(0,1);
	s2 = s.substring(1);
    }
 

    public String reverse(String s) {
	int i;
	int d = s.length();
	for(i=0; i<d; i++) {
	    deletter(s);
	    result = s2 + s1;	    
	}
	return result;

	
    }

    public static void main(String[] args) {
	String s = "hello";
	For f = new For();
	System.out.println(f.reverse(s));
	
    }
















}