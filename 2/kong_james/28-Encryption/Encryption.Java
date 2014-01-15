import java.io.*;
import java.util.*;

public class Encryption{
    public String shift(String i, int j){
	i = i.toLowerCase();
	String finalc = "";
	int value = 0;
	for (int k = 0; k < i.length();k++){
	    if (i.charAt(k)<123 && i.charAt(k)>96){
		if (i.charAt(k)+j > 122){
		    value = i.charAt(k) + j - 122 + 96;
		}
		else if (i.charAt(k) + j > 96){
		    value = i.charAt(k) + j;
		}
		finalc = finalc + String.valueOf((char)(value));
	    }
	    else finalc = finalc + i.charAt(k);
	}
	return finalc;
    
    }
}
