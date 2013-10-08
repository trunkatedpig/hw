import java.io.*;
import java.util.*;

public class Piglatinify {
	int index, firstVowel;
	String ending;
	public String PigLatin(String word){
		index = 0;
		findFirstVowel(word);
		return word.substring(firstVowel) + word.substring(0,firstVowel) + chooseEnding();
	}
	public void findFirstVowel(String word){
		String letter = word.substring(index, index + 1);
		if (letter.equals("a")||
			letter.equals("e")||
			letter.equals("i")||
			letter.equals("o")||
			letter.equals("u")){
			firstVowel = index;
		}
		else {
			index = index + 1;
			findFirstVowel(word);
		}
	}
	public String chooseEnding(){
		if (index == 0) {
			return "yay";
		}
		else {
			return "ay";
		}
	}
}