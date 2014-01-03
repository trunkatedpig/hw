import java.io.*;
import java.util.*;

public class Cipher {

    public String caesarEncode(String word, int n) {
		String lowWord = word.toLowerCase();
		String result = "";
		for (int i = 0; i<lowWord.length(); i++){
			int index = (int) lowWord.charAt(i);
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
				result = result + lowWord.charAt(i);
		}
		return result;
	}

}