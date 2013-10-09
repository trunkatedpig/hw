import java.io.*;
import java.util.*;

public class StringStuff {

    public String capitalize(String name){
	String firstInitial, lastInitial;
	firstInitial = name.substring(0,1);
	String firstInit = firstInitial.toUpperCase();
	lastInitial = name.substring(name.indexOf(" ")+1,name.indexOf(" ")+2);
	String lastInit = lastInitial.toUpperCase();
	String daName = firstInit + name.substring(1,name.indexOf(" ")+1) + lastInit + name.substring(name.indexOf(" ")+2);
	return daName;
    }

    public String bondify(String name){
	String lastInitial = name.substring(name.indexOf(" ")+1,name.indexOf(" ")+2);
	String lastInit = lastInitial.toUpperCase();
	String lastName = lastInit + name.substring(name.indexOf(" ")+2);
	String bondified = lastName + ", " + capitalize(name);
	return bondified;
    }

    public String pigLatinify(String word){
	String firstletter = word.substring(0,1).toUpperCase();
	String restofletters = word.substring(1).toUpperCase();
	if (firstletter.equals("A") || firstletter.equals("E") || firstletter.equals("I") ||  firstletter.equals("O")||  firstletter.equals("U"))
	    { return word + "yay";
    }

    else {
	String piggy = firstletter.toLowerCase() + "ay";
	return restofletters.toLowerCase() + piggy;
    }
    }
}
