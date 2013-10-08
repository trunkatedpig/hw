import java.io.*;
import java.util.*;

public class StringStuff {
    private String first,last,newname;
    private int space;
    private String s1;

    public String capitalize(String name) {
	first = name.substring(0,1).toUpperCase();
	space = name.indexOf(" ") + 1;
	last = name.substring(space,space+1).toUpperCase();
	newname = first + name.substring(1,space);
	newname = newname + last + name.substring(space+1);
	return newname;
	    }

    public String bondify(String name) {
	s1 = capitalize(name);
	space = s1.indexOf(" ") + 1;
	first = s1.substring(0,space);
	last = s1.substring(space);
	newname = last + ", " + first + last;
	return newname;
	    }
}