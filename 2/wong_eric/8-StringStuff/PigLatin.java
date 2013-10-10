import java.io.*;
import java.util.*;

public class PigLatin {

    private String wrd;
    private int index;

    public void index(String word) {
	index = word.length();

	if (word.indexOf("a") >= 0) {
		index = word.indexOf("a");
	    }
	if ((word.indexOf("e") >= 0) && (word.indexOf("e") < index)) {
		index = word.indexOf("e");
	    }
	if ((word.indexOf("i") >= 0) && (word.indexOf("i") < index)) {
		index = word.indexOf("i");
	    }
	if ((word.indexOf("o") >= 0) && (word.indexOf("o") < index)) {
		index = word.indexOf("o");
	    }
	if ((word.indexOf("u") >= 0) && (word.indexOf("u") < index)) {
		index = word.indexOf("u");
	    }
	if ((word.indexOf("A") >= 0) && (word.indexOf("A") < index)) {
		index = word.indexOf("A");
	    }
	if ((word.indexOf("E") >= 0) && (word.indexOf("E") < index)) {
		index = word.indexOf("E");
	    }
	if ((word.indexOf("I") >= 0) && (word.indexOf("I") < index)) {
		index = word.indexOf("I");
	    }
	if ((word.indexOf("O") >= 0) && (word.indexOf("O") < index)) {
		index = word.indexOf("O");
	    }
	if ((word.indexOf("U") >= 0) && (word.indexOf("U") < index)) {
		index = word.indexOf("U");
	    }
    }
    
    public String PigLatinify(String word) {
	index(word);

	if (index == 0) {
		wrd = word + "ay";
		return wrd;
	    }
	else {
		wrd = word.substring(index) + word.substring(0, index) + "ay";
		return wrd;
	    }
    }
}