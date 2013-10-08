import java.io.*;
import java.util.*;

public class PigLatin {

    private String word;
    private int index;

    public String Piglatinify(String word) {
	if word.indexOf("a") >0{
		index = word.indexOf("a");
	    }
	if ((word.indexOf("e") >0)&&(word.indexOf("e")< index)){
		index = word.indexOf("e");
	    }
	if ((word.indexOf("i") >0)&&(word.indexOf("i")< index)){
		index = word.indexOf("i");
	    }
	if ((word.indexOf("o") >0)&&(word.indexOf("o")< index)){
		index = word.indexOf("o");
	    }
	if ((word.indexOf("u") >0)&&(word.indexOf("u")< index)){
		index = word.indexOf("u");
	    }
    }
}