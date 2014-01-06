import java.io.*;
import java.util.*;

public class Cipher {
    public static void main (String args[]){
	Cipher c = new Cipher();

	System.out.println(c.encode("hello",3));
	System.out.println(c.encode("abcxyz",3));
    }


    public String encode(String word, int e){
	String lword = word.toLowerCase();
	String nword = "";

	for (int i = 0; i < lword.length(); i++){
	    char letter = lword.charAt(i);
	    if (Character.isLetter(letter)){
		letter = (char)((letter + e - 97)% 26 + 97);
	    }
	    nword = nword + letter;

	}
	return nword;
    }

}
