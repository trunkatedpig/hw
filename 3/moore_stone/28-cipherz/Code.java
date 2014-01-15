import java.io.*;
import java.util.*;

public class Code{

    public String encode(String word, int offset){
	int[] chars = new int[word.length()];
	String result = "";
	word = word.toLowerCase();
	for (int i = 0; i < word.length(); i++){
	    chars[i] = word.charAt(i);
	    chars[i] = chars[i] + offset;
	    while (chars[i] > 122){
		chars[i] = chars[i] - 26;
	    }
	    result = result + Character.toChars(chars[i])[0];
	}
	return result;
    }

}
