import java.io.*;
import java.util.*;

public class StringStuff {
    private int space;
    private String firstname, lastname;
    private String firstletter, word, firstpair;

    public StringStuff (String name) {
	capitalizing(name);
    }

    public void capitalizing(String name) {
	space = name.indexOf(" ");
	firstname = name.substring(0,1).toUpperCase() + name.substring(1,space);
	lastname = name.substring(space + 1, space + 2).toUpperCase() + name.substring(space + 2);
    }

    public String capitalize() {
	return firstname + " " + lastname;
    }

    public String bondify() {
	return lastname + ", " + firstname + " " + lastname;
    }

    public String PigLatinify(String a) {
	firstletter = a.substring(0,1);
	firstpair = a.substring(0,2);

	if (firstpair.equals("ch") || firstpair.equals("st") || firstpair.equals("th")) {
	    word = a.substring(2) + firstpair + "ay";
	}
	else {
	    if (firstletter.equals("a") || firstletter.equals("e") || firstletter.equals("i") || firstletter.equals("o") || firstletter.equals("u")) {
	    word = a + "yay";
	    }
	    else {
	    word = a.substring(1) + firstletter + "ay";
	    }
	}
	return word;
    }
}
	
