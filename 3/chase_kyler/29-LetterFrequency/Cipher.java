import java.util.*;
import java.io.*;

public class Cipher {

	private double[] CorpusFreqs = new double[26];

	/*public Cipher() {
	try {
		String s = "";
		Scanner sc = new Scanner(new File("Shakespeare.txt"));
		while (sc.hasNext()) {
			s = s + sc.nextLine();
		}
		char c;
		for (int i = 0;i<s.length();i++) {
			c = s.charAt(i);
			if (c >= 'A' && c <= 'Z')
				c = (char)(c+32);
			if (c >= 'a' && c <='z')
				CorpusFreqs[c-97] = CorpusFreqs[c-97] + 1.0;
		}
	}
	catch (Exception e) {}
	}

	public double[] getCF() {
		return CorpusFreqs;
	}*/

	public String lowerCase(String s) {
		char a;
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			a = s.charAt(i);
			if (a <= 'Z')
				a = (char)(a + 32);
			r = r+a;
		}
		s = r;
		return s;
	}

	public String encode(String s, int n) {
		s = lowerCase(s);
		char a;
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			a = s.charAt(i);
			if (a < 'x')
				a = (char)(a+n);
			else
				a = (char)(96 + (a+3-'z'));
			r = r+a;
		}
		return r;
	}



	public void cracker(String s) {
		for (int i = 0; i<26; i++) {
			System.out.println(s);
			System.out.println(encode(s,i));
		}
	}
}






