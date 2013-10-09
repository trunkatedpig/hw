import java.io.*;
import java.util.*;

public class PigLatin {

    private String part1, part2,last, piglatin;
    private int index;

    public String PigLatinify(String word) {
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
	if (index == 0){
	    last = word.substring(word.length()-1);
	    if ((last.equals("a")) || (last.equals("e"))|| (last.equals("i"))|| (last.equals("o"))||(last.equals("u"))){
		    piglatin = word + "yay";
		}
	   else {
		    piglatin = word + "ay";
	   }}
	else {
	part1= word.substring(0,index);
	part2 = word.substring(index);
	
	piglatin =  part2+part1+"ay";
	}
	
	return piglatin;
  }
}
