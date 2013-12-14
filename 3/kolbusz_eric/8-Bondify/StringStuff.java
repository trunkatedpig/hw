import java.io.*;
import java.util.*;

public class StringStuff {
    
    public String capitalize(String name) {
	if (name.indexOf(" ") == -1 ) {
		return "Invalid input.";}
	else {
	    int space = name.indexOf(" ");

	    String fnamefletter, lnamefletter;
	    fnamefletter = name.substring(0,1);
	    lnamefletter = name.substring(space+1,space+2);

	    return fnamefletter.toUpperCase() + name.substring(1,space+1)
		+ lnamefletter.toUpperCase() + name.substring(space+2);
	}
    }

    public String bondify(String name) {
       	if (name.indexOf(" ") == -1) {
		return "Invalid input.";}
	else {
	    int space = name.indexOf(" ");

	    String lastname;
	    lastname = name.substring(space+1);
	    
	    return lastname + ", " + name;
	}
    }
}
