import java.io.*;
import java.util.*;

public class Cipher{
    public String Encode(String phrase, int rot){
	String lowercase = phrase.toLowerCase();
	String encoded = "";
	for (int i=0; i< phrase.length(); i++){
	    if ((int)(lowercase.charAt(i)) <= 122 - (rot % 26) && (int)(lowercase.charAt(i)) >= 97){
		encoded = encoded + (char)(lowercase.charAt(i) + rot);
	    }
	    else if ((int)(lowercase.charAt(i)) > 122 - (rot % 26)){
		encoded = encoded + (char)(96 +(rot - (122 - (int)(lowercase.charAt(i))))); 
	    }
	    else{
		encoded = encoded + (char)lowercase.charAt(i);
	    }
	}
	return encoded;
    }	
}
