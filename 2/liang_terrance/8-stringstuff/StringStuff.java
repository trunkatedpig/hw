import java.util.*;
import java.io.*;


public class StringStuff{

    private int space;
    private String name, first, last;

    public String capitalize(String n){
	name = n;
	space = name.indexOf(" ");
	first = name.substring(0,space);
	last = name.substring(space+1);
	first = (first.substring(0,1)).toUpperCase()+ first.substring(1);
	last = (last.substring(0,1)).toUpperCase()+ last.substring(1);
	name = first + " " + last;
	return name;
    }
    
    public String bondify (String n){
	name = n;
	space = name.indexOf(" ");
	first = name.substring(0,space);
	last = name.substring(space+1);
	name = last + ", " + name;
	return name;
    }

    private String part1, part2,lastchar, piglatin;
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
	    lastchar = word.substring(word.length()-1);
	    if ((lastchar.equals("a")) || (lastchar.equals("e"))|| (lastchar.equals("i"))|| (lastchar.equals("o"))||(lastchar.equals("u"))){
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
