import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import static java.lang.System.nanoTime;
import java.math.BigInteger;

public class CaesarCipher {
	public double[] corpusFreqs;
	
	public CaesarCipher() {}
	public CaesarCipher(String filename) {buildcorpusFreqs(filename);}
	
	public void buildcorpusFreqs(String filename) {
		String text = "";
		try {text = new java.util.Scanner(new java.io.File(filename)).useDelimiter("\\A").next();}
		catch (java.io.IOException e) {}
		corpusFreqs = frequencies(text);
	}
	
	public static String[] decryptBruteForce(String ciphertext) {
		String[] decryptions = new String[26];
		for (int i = 0; i < 26; i++) {decryptions[i] = encrypt(ciphertext, i);}
		return decryptions;
	}
	
	public String decryptIntelligent(String ciphertext) {
		ciphertext = ciphertext.toLowerCase();
		double[] distances = new double[26];
		for (int i = 0; i < 26; i++) {
			ciphertext = encrypt(ciphertext, 1);
			double[] frequencies = frequencies(ciphertext);
			double sum = 0;
			for (int j = 0; j < 26; j++) {sum += Math.pow(frequencies[j] - corpusFreqs[i], 2);}
			distances[i] = Math.sqrt(sum);
		}
		int minimumIndex = 0;
		for (int i = 1; i < 26; i++) {if (distances[i] < distances[minimumIndex]) {minimumIndex = i;}}
		System.out.println(java.util.Arrays.toString(corpusFreqs));
		System.out.println(java.util.Arrays.toString(distances));
		return minimumIndex + ": " + encrypt(ciphertext, minimumIndex);
	}
	
	public static String encrypt(String text, int shift) {
		String ciphertext = "";
		for (int i = 0; i < text.length(); i++) {
			char currentCharacter = text.charAt(i);
			if ((currentCharacter >= 'a') && (currentCharacter <= 'z')) {ciphertext += (char) (((currentCharacter - 'a' + shift) % 26) + 'a');}
			else if ((currentCharacter >= 'A') && (currentCharacter <= 'Z')) {ciphertext += (char) (((currentCharacter - 'A' + shift) % 26) + 'A');}
			else {ciphertext += currentCharacter;}
		}
		return ciphertext;
	}
	
	public static double[] frequencies(String text) {
		text = text.toLowerCase();
		long[] counts = new long[26];
		long sum = 0;
		for (int i = 0; i < text.length(); i++) {
			char currentCharacter = text.charAt(i);
			if ((currentCharacter >= 'a') && (currentCharacter <= 'z')) {
				counts[currentCharacter - 'a']++;
				sum++;
			}
		}
		double[] frequencies = new double[26];
		for (int i = 0; i < 26; i++) {frequencies[i] = (double) counts[i] / sum;}
		return frequencies;
	}
		
	public static void main(String[] args) {
		String help = "Type \"java CaesarCipher\" for help.";
		if (args.length == 0) {
			System.out.println("Usage:\t java CaesarCipher text shift [-time]\ntext is the string to encrypt, shift is the integer indicating the number of letters to shift by (positive, zero, or negative), [-time] is an optional argument indicating whether or not the program prints the time required to cipher.\nThe time shown is the time required to cipher does not include the time for argument checking and printing.");
			return;
		}
		if ((args.length < 2) || (args.length > 3)) {
			System.out.print("Expected 2 or 3 arguments. Entered: ");
			String arguments = "";
			for (String arg : args) {arguments += arg + ", ";}
			System.out.println(arguments.substring(0, arguments.length() - 2) + ".");
			return;
		}
		String shiftUsage = "Invalid argument shift: " + args[1] + ". shift must be an integer between " + MAX_VALUE + " and " + MIN_VALUE + ".";
		if (!(args[1].matches("[0-9-]*"))) {
			System.out.println(shiftUsage);
			return;
		}
		if ((args.length == 3) && !(args[2].equals("-time"))) {
			System.out.println("Invalid option: " + args[2] + ".");
			return;
		}
		BigInteger _shift = new BigInteger(args[1]);
		BigInteger _maxInteger = new BigInteger(String.valueOf(MAX_VALUE));
		BigInteger _minInteger = new BigInteger(String.valueOf(MIN_VALUE));
		if ((_shift.compareTo(_maxInteger) > 0) || (_shift.compareTo(_minInteger) < 0)) {
			System.out.println(shiftUsage);
			return;
		}
		
		int shift = Integer.parseInt(args[1]);
		long t1 = nanoTime();
		String ciphertext = encrypt(args[0], shift);
		long t2 = nanoTime();
		System.out.println(ciphertext);
		if (args.length == 3) {System.out.println("Time: " + (t2 - t1) + " ns / " + ((double) (t2 - t1) / 1000000) + " ms / " + ((double) (t2 - t1) / 1000000000) + " s");}
	}
}
