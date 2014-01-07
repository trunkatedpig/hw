import java.io.*;
import java.util.*;

public class Cipher {

    public String caesarEncode(String word, int n) {
		word = word.toLowerCase();
		String result = "";
		for (int i = 0; i<word.length(); i++){
			int index = (int) word.charAt(i);
			if (index >= 97 && index <= 122){
				char newC = '-';
				int newChar = index + n;
				if (newChar <= 122){
					newC = (char)(newChar);
				} else {
					index = (newChar - 122) + 96;
					newC = (char)(index);
				}
				result = result + newC;
			}
			else
				result = result + word.charAt(i);
		}
		return result;
	}

	public String caesarEncode2 (String word, int n) {
		word = word.toLowerCase();
		String result = "";
		for (int i = 0; i<word.length(); i++){
			int index = (int) word.charAt(i) - 97;
			if (index >= 0 && index <= 25){
				int newChar = ((index+n)%26) + 97;
				char newC = (char) (newChar);
				result = result + newC;
				}
			else
				result = result + word.charAt(i);
		}
		return result;
	}

	public String rot13 (String word) {
		return caesarEncode2(word, 13);
	}

}