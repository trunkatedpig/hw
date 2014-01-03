import java.io.*;
import java.util.*;

public class Cipher {
    public String encode(String s, int n) {
	String shifted = "";
	s.toLowerCase();
	char c = 97;
	char temp = 97;
	for (int i = 0; i < s.length(); i ++){
	    temp = s.charAt(i);
	    if (96<temp && 123>temp) {
		temp = (char)(temp + n);
		if (temp >= 123) {
		    temp = (char)(temp - 26);
		}
	    }
	    c = temp;
	    shifted = shifted + c;
	}
	return shifted;
    }
}