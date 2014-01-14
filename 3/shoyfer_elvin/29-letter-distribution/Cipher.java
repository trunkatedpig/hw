import java.io.*;
import java.util.*;

public class Cipher {

	private double[] corpusFreqs = new double[26];

	public void printCorpusFreqs() {
		for(int j = 0; j < 26; j++) {
			char thisChar = (char) (97 + j);
			System.out.print(thisChar + ": ");
			System.out.print(corpusFreqs[j]);
			System.out.print("\n");
		}
	}

	private boolean isUpper(int value) {
		// takes ASCII value and returns true if corresponding char is uppercase
		return ((value >= 65) && (value <= 90));
	}

	private boolean isLower(int value) {
		// takes ASCII value and returns true if corresponding char is lowercase
		return ((value >= 97) && (value <= 122));
	}

	private boolean isLetter(int value) {
		// takes ASCII value and returns true if corresponding char is lowercase
		return (isLower(value) || isUpper(value));
	}

	public String encode(String s, int n) { 
			char[] chars = s.toCharArray();
			char[] newChars = new char[chars.length];
			for(int i = 0; i < chars.length; i++) {
				char c = chars[i];
				int value = (int) c;
				int newValue = value;
				if (isLetter(value)) {
					if (isUpper(value)) {
						newValue = (((value - 65) + n) % 26) + 65;
					} else {
						newValue = (((value - 97) + n) % 26) + 97;
					}
				} 
				char newChar = (char) newValue;
				newChars[i] = newChar;
			}
			String encoded = new String(newChars);
			return encoded;
	}

	public void buildCorpusFreq(String filename) {

		try {
			Scanner sc = new Scanner(new File(filename));
			while (sc.hasNext()) {
				String s = sc.nextLine();
				s = s.toLowerCase();
				for (int i = 0; i < s.length(); i++) {
					char c = s.charAt(i);
					int value = (int) c;

					if (isLower(value)) {
						
						value = value - 97;
						corpusFreqs[value]++;
					}
				}


			}
		} catch (Exception e) {

		}
	}
}
