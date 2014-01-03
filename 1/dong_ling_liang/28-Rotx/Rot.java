import java.io.*;
import java.util.*;

public class Rot{

    public String encode(String words, int move){
	String ret = "";
	for (int i=0; i<words.length();i++){
	    char ascii = words.toLowerCase().charAt(i);
	    if (ascii >'z' || ascii <'a'){
		ret = ret + ascii;
	    }
	    else{
		ascii = (char)((((int)ascii+move-97)%26)+97);
		ret = ret + ascii;
	    }
	}
	return ret;
    }
}

		