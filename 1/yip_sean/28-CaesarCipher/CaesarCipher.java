import static java.lang.Character.isLetter;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.System.nanoTime;
import java.math.BigInteger;

public class CaesarCipher {
	private final static char[] ALPHABET_LOWERCASE = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	private final static char[] ALPHABET_UPPERCASE = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	public static String encryptLowerCase(String text, int shift) {
		text = text.toLowerCase();
		String ciphertext = "";
		for (int i = 0; i < text.length(); i++) {
			if (isLetter(text.charAt(i))) {ciphertext += ALPHABET_LOWERCASE[(indexOf(ALPHABET_LOWERCASE, text.charAt(i)) + shift) % 26];}
			else {ciphertext += text.charAt(i);}
		}
		return ciphertext;
	}
	
	public static String encryptUpperCase(String text, int shift) {
		text = text.toUpperCase();
		String ciphertext = "";
		for (int i = 0; i < text.length(); i++) {
			if (isLetter(text.charAt(i))) {ciphertext += ALPHABET_UPPERCASE[(indexOf(ALPHABET_UPPERCASE, text.charAt(i)) + shift) % 26];}
			else {ciphertext += text.charAt(i);}
		}
		return ciphertext;
	}
	
	public static String encrypt(String text, int shift) {
		String ciphertext = "";
		for (int i = 0; i < text.length(); i++) {
			if (isLetter(text.charAt(i))) {
				if (isLowerCase(text.charAt(i))) {ciphertext += ALPHABET_LOWERCASE[(indexOf(ALPHABET_LOWERCASE, text.charAt(i)) + shift) % 26];}
				if (isUpperCase(text.charAt(i))) {ciphertext += ALPHABET_UPPERCASE[(indexOf(ALPHABET_UPPERCASE, text.charAt(i)) + shift) % 26];}
			}
			else {ciphertext += text.charAt(i);}
		}
		return ciphertext;
	}
	
	public static int indexOf(char[] array, char element) {
		for (int i = 0; i < array.length; i++) {if (array[i] == element) {return i;}}
		return -1;
	}
	
	public static void main(String[] args) {
		String usage = "Usage:\t java CaesarCipher text shift [-time]\ntext is the string to encrypt, shift is the integer indicating the number of letters to shift by (positive, zero, or negative), [-time] is an optional argument indicating whether or not the program prints the time required to cipher.\nThe time shown is the time required to cipher does not include the time for argument checking and printing.";
		if ((args.length < 2) || (args.length > 3) || !(args[1].matches("[0-9-]*"))) {
			System.out.println(usage);
			return;
		}
		if ((args.length == 3) && !(args[2].equals("-time"))) {
			System.out.println(usage);
			return;
		}
		long t1 = nanoTime();
		String ciphertext = encrypt(args[0], Integer.parseInt(args[1]));
		long t2 = nanoTime();
		System.out.println(ciphertext);
		if (args.length == 3) {System.out.println("Time: " + (t2 - t1) + " ns / " + ((double) (t2 - t1) / 1000000) + " ms / " + ((double) (t2 - t1) / 1000000000) + " s");}
	}
}
