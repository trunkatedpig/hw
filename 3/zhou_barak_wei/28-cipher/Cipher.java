public class Cipher {
	
	public static int forevermod26(int i) {
		while (i > 25) {
			i = i % 26;
		}
		return i;
	}
	
	public static String Shift(String string, int shift) {
		String ciphertext = "";
		String s = string.toLowerCase();
		if (s.length() == 0) return ciphertext;
		char[] plaintext = new char[s.length()];
		for (int i=0;i<s.length();i++) {
			//plaintext[i] = (char)(s.charAt(i) + shift);
			char letter = s.charAt(i);
			if (letter >= 97 && letter <= 122) {
				plaintext[i] = (char)(forevermod26((letter + (shift%26)) % 97) + 97);
			}
			else plaintext[i] = letter;
		}
		
		for (int i=0;i<plaintext.length;i++) {
			ciphertext = ciphertext + plaintext[i];
		}
		return ciphertext;
	}
	
	public static void main(String[] args) {
		if (args.length != 2 || !(args[0] instanceof String)) {
			System.out.println("You can't have nice things.");
			System.exit(0);
		}
		System.out.println(Cipher.Shift(args[0], Integer.parseInt(args[1])));
	}
	
}