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
	name = capitalize(name);

	int i = name.indexOf(" ");
	int l = name.length();

	String FirstName = name.substring(0,i);
	String LastName = name.substring(i+1, l);
	
	return LastName + ", " + FirstName + " " + LastName;

    }
    
    public String piglatinify(String word){
        String n = word.substring(0,1);
        String nrest = word.substring(1);
        String result;
	if (n.equals("a")) {
            result = word + "yay";
        } else if (n.equals("e")) {
            result = word + "yay";
        } else if (n.equals("i")) {
            result = word + "yay";
        } else if (n.equals("o")) {
            result = word + "yay";
        } else if (n.equals("u")) {
            result = word + "yay";
	} else { result = nrest + n + "ay";
	}
        return result;
    }
}
