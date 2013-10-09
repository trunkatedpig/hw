import java.io.*;
import java.util.*;

public class StringStuff {

    public String capitalize(String name){
	int i = name.indexOf(" ");
	int l = name.length();

	String FirstName = name.substring(1,i);
	String FirstInitial = name.substring(0,1);
	String FI = FirstInitial.toUpperCase();

	String LastName = name.substring(i+2,l);
	String LastInitial = name.substring(i+1,i+2);
	String LI = LastInitial.toUpperCase();

	return FI + FirstName + " " + LI + LastName;
    }

    public String bondify(String name){
	int i = name.indexOf(" ");
	int l = name.length();

	// I was going to try to capitalize the name here, but I wasn't 100% sure on how to

	String FirstName = name.substring(0,i);
	String LastName = name.substring(i+1, l);
	
	return LastName + ", " + FirstName + " " + LastName;
    }

    public String piglatinify(String word){
	String n = word.substring(0,1);
	String nrest = word.substring(1);
	String result;
      	if (n.compareTo("a") = 0) {
	    result = word + "yay";
	} else if (n.compareTo("e") = 0) { 
	    result = word + "yay";
	} else if (n.compareTo("i") = 0) {
	    result = word + "yay";
	} else if (n.compareTo("o") = 0) {
	    result = word + "yay";
	} else if (n.compareTo("u") = 0) {
	    result = word + "yay";
	} else { result = nrest + n + "yay";
	}
	return result;
    }
}
