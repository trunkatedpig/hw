import java.io.*;
import java.util.*;

public class Cipher{
    public static void main (String args[]){
	Cipher C = new Cipher();
	String c=C.encode("hello", 3);
	System.out.println(c);
}
    public String encode(String s, int shift){
	shift=shift%26;
	s= s.toLowerCase();
	String temp= "";
	for (int i=0; i<s.length(); i++){
	    if (s.charAt(i)<97 || s.charAt(i)>122){
		temp=temp+ (char)(s.charAt(i));
	    }
	    else{
		if ((s.charAt(i)+shift)<97){
		    temp=temp+ (char)(s.charAt(i)+shift+26);
		}
		else if((s.charAt(i)+ shift)>122){
		    temp=temp+ (char) (s.charAt(i)+shift-26);
		}
		else{
		    temp=temp+(char) (s.charAt(i)+shift);
		}
	    }
	}
	return temp;

    }
}
