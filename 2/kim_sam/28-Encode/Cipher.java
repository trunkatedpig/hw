import java.io.*;
import java.util.*;

public class Cipher {

    public String encode(String word, int move) {

	word = word.toLowerCase();
        String result = "";
        move = move % 26;

        for (int i = 0; i < word.length(); i++) {

            if ((word.charAt(i) < 'a')
		||
		(word.charAt(i) > 'z')) { 
		result += word.charAt(i);
	    }
	    else {
		if (word.charAt(i) + move <= 'z') {
		    result += (char)(word.charAt(i) + move);
		}
		else {
		    result += (char)('a' + (move - ('z' + 1 - word.charAt(i))));
		}
	    }
	}
	return result;
    }
}