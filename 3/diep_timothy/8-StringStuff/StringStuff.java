import java.io.*;
import java.util.*;

public class StringStuff {
    
    private String firstname;
    private String lastname;
    private String n1;
    private String n2;
    private String s;

    public StringStuff(String name) {
	if (name.indexOf(" ") == -1) {
	    s = name;
	} else {
	    firstname = name.substring(0,name.indexOf(" "));
	    lastname = name.substring(name.indexOf(" ") + 1);
	    n1 = firstname.substring(0,1);
	    n2 = lastname.substring(0,1);
	}
    }
    
    public String capitalize() {
	String first = firstname.replaceFirst(n1, n1.toUpperCase());
	String last = lastname.replaceFirst(n2, n2.toUpperCase());
	return first + " " + last;
    }
	
    public String bondify() {
	String first = firstname.replaceFirst(n1, n1.toUpperCase());
	String last = lastname.replaceFirst(n2, n2.toUpperCase());
	return last + ", " + first + " " + last;
    }
    
    public boolean isVowel(int n) {
	if (n == 0) {
	    if (s.substring(0,1).equals("a")) {
		return true;
	    } else if (s.substring(0,1).equals("e")) { 
		return true;
	    } else if (s.substring(0,1).equals("i")) {
		return true;
	    } else if (s.substring(0,1).equals("o")) {
		return true;
	    } else if (s.substring(0,1).equals("u")) {
		return true;
	    } else {
		return false;
	    }
	} else {
	    if (s.substring(n,n+1).equals("a")) {
		return true;
	    } else if (s.substring(n,n+1).equals("e")) { 
		return true;
	    } else if (s.substring(n,n+1).equals("i")) {
		return true;
	    } else if (s.substring(n,n+1).equals("o")) {
		return true;
	    } else if (s.substring(n,n+1).equals("u")) {
		return true;
	    } else if (s.substring(n,n+1).equals("y")) {
		return true;
	    } else {
		return false;
	    }
	}
    }

    public String PigLatinify() {
	String front;
	if (isVowel(0) == true) {
	    s = s + "yay";
	    return s;
	} else if (isVowel(1) == true) {
	    front = s.substring(0,1);
	    return s.substring(1) + front + "ay";
	} else if (isVowel(2) == true) {
	    front = s.substring(0,2);
       	    return s.substring(2) + front + "ay";
       	} else if (isVowel(3) == true) {
	    front = s.substring(0,3);
	    return s.substring(3) + front + "ay";
	} else {
	    front = s.substring(0,4);
	    return s.substring(4) + front + "ay";
	}
    }
}
