import java.io.*;
import java.util.*;

public class Decode {

    public String decode(String original) {

	String s = original.toLowerCase();
	Cipher c = new Cipher();
	String vowels = "aeiou";
	int maxv = 0;
	int offset = 0;
	String result = "";

	for(int i=0;i<27;i++) {

	    int vcount = 0;
	    String temp = c.encode(s, i);

	    for (int j=0;j<temp.length();j++) {

		if (vowels.contain(temp.charAt(j)))
		    vcount = vcount + 1;

	    }

	    if (vcount > maxv)
		offset = i;

	} 

	result = c.encode(s, offset);
	return result;

    }

    public static void main(String args[]) {

	Decode d = new Decode();


    }

}