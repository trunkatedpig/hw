import java.io.*;
import java.util.*;

public class StringStuff {
    public String capitalize(String name){
	String first = name.substring(0, name.indexOf(" "));
	String last = name.substring(name.indexOf(" ") + 1);
	String upperFirst = (first.substring(0,1)).toUpperCase() + first.substring(1, first.length());
	String upperLast = (last.substring(0,1)).toUpperCase() + last.substring(1, last.length());
	String upperName = upperFirst + " " + upperLast;
	return upperName;

    }
    public String bondify(String name){
	String capName = capitalize(name);
	String first = capName.substring(0, capName.indexOf(" "));
	String last = capName.substring(capName.indexOf(" ") + 1);	
	String bond = last + ", " + first + " " + last;
	return bond;
	}
}
