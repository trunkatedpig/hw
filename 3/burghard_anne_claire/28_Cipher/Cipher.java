import java.io.*;
import java.util.*;

public class Cipher{

    public String encode(String words, int move){
	String answer = "";
	for (int i=0; i<words.length(); i++){
	    char a = words.toLowerCase().charAt(i);
	    if (a > 'z' || a < 'a') {
		answer = answer + a;
	    }
	    else if (a >= 'z'-move) {
		int w = a;
		int x = 'z';
		int y = x - w;
		int z = move-y;
		int value = w + z;
		a = (char)value;
		answer = answer + a;
	    }
	    else{
		int w = a;
		int value = w + move;
		a = (char)value;
		answer = answer + a;
	    }
	}
	return answer;
    }
}

		
