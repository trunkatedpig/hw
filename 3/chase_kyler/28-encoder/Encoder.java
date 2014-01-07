import java.util.*;
import java.io.*;

public class Encoder {

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
				a = (char)(a+3);
			else
				a = (char)(96 + (a+3-'z'));
			r = r+a;
		}
		return r;
	}

}
			
