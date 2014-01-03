import java.util.*;
import java.io.*;

public class Cipher {
	public String encode(String s, int offset){
		s = s.toLowerCase();
		String result = "";

		for (int i=0;i<s.length();i++){
			char toEncode = s.charAt(i);
			if (toEncode >= 97 && toEncode <= 122){
				if (toEncode + offset <= 122)
					result += (char)(toEncode + offset);
				else{
					while (offset > 43){
						offset -= 26;
					}
					result += (char)(toEncode + offset - 26);
				}
			}
			else
				result += (char)toEncode;
		}
		return result;
	}

	public static void main(String[] args){
		Cipher c = new Cipher();
		Integer offset = Integer.valueOf(args[0]);
		System.out.println(c.encode("Isaac", offset));
	}
}
