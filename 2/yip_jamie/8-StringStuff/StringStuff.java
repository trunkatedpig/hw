import java.io.*;
import java.util.*;

public class StringStuff{
    private String name;

    public String capitalize(String name){
	name = name;
	String first,last;
	int space;
	space = name.indexOf(" ");
        first = name.substring(0,1).toUpperCase();
	first = first + name.substring(1,space);
	last = name.substring(space + 1, space + 2).toUpperCase();
	last = last + name.substring(space + 2);
	return first + " " + last;
    }

    public String bondify(String name){ 
	name = capitalize(name);
	String last,bond;
	int space;
	space = name.indexOf(" ");
	last = name.substring(space + 1,space + 2).toUpperCase();
	last = last + name.substring(space + 2);
	bond = last + ", " + name;
	return bond;
    }
}


