import java.io.*;
import java.util.*;

public class StringStuff {

    public String capitalize(String name) {
	String f,l,result;
	int s;

	f = name.substring(0,1);
	f = f.toUpperCase();
	s = name.indexOf(" "); // index of space
	l =  name.substring(s+1,s+2);
	l = l.toUpperCase();

	result = f // capitalized 1st letter
	    + name.substring(1,s) // rest of 1st name
	    + " "
	    + l // capitalized 1st letter
	    + name.substring(s+2); // rest of last name

	return result;
    }

    public String bondify(String name) {
	String f,l,firstName,lastName,result;
	int s;

	s = name.indexOf(" "); // index of space
	f = name.substring(0,1); // 1st letter of first name
	f = f.toUpperCase();
	firstName = f + name.substring(1,s);
	l =  name.substring(s+1,s+2); // 1st letter of last name
	l = l.toUpperCase();
	lastName = l + name.substring(s+2);

	result = lastName + ", " + firstName + " " +  lastName;
	return result;
    }

    public String PigLatinify(String name) {
	String a,result;
	a = name.substring(0,1).toLowerCase();
	if (a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u")) {
	    result = name + "ay";
	}
	else {
	    result = name.substring(1) + a + "ay";
	}
	return result;
    }
}
