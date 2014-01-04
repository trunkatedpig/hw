import java.io.*;
import java.util.*;

public class Cipher {
    public String encode(String input, int offset){
		input = input.toLowerCase();
		String output = "";
		offset = offset%26;
		for(int i = 0; i < input.length(); i++){
			char letter = input.charAt(i);
			if (letter > 'z' || letter < 'a')
				output = output + letter;
			else{
				if (letter + offset > 'z')
					letter = (char)(letter - 26);
				output = output + (char)(letter+offset);
			}
		}
	return output;
    }
}