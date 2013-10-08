import java.io.*;
import java.util.*;

public class PigLatin {
    private String a;
    private int i;
    public String Piglatinify(String word) {
	a = word.substring(0,1);
	if (a.equals("a")){
	    word = word + "yay";
		}
	if (a.equals("e")){
	    word + "yay";
		}
	if (a.equals("i")){
	    word + "yay";
		}
	if (a.equals("o")){
	    word + "yay";
		}
	if (a.equals("u")){
	    word + "yay";
		}
	if 
    }
    public int findFirstVowel(String word) {
	int i, indexOfVowel;
	letter = word.substring(i,i+1);
	if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
	    indexOfVowel = i;
	}
	else {
	    i = i + 1;
	    findFirstVowel(word);
	}
    }
}