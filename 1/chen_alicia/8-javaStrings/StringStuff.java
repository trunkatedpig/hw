import java.io.*;
import java.util.*;

public class StringStuff {

    public String capitalize(String name) {
	int space = name.indexOf(" ");
	String first = (name.substring (0,1)).toUpperCase() + name.substring(1,space);
	String last =( name.substring(space+1,space + 2)).toUpperCase() + name.substring(space+2);
	String result = first + " " + last;
	return result;
    }
    public String bondify (String name) {
	int space = name.indexOf(" ");
	String last = name.substring(space+1);
	String result = last + ", " + name;
	return result;
	    }
}


	
