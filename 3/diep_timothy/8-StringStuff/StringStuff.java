import java.io.*;
import java.util.*;

public class StringStuff {
    
    private String firstname;
    private String lastname;
    private String n1;
    private String n2;

    public StringStuff(String name) {
	firstname = name.substring(0,name.indexOf(" "));
	lastname = name.substring(name.indexOf(" ") + 1);
	n1 = firstname.substring(0,1);
	n2 = lastname.substring(0,1);
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
 }
