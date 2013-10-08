import java.io.*;
import java.util.*;

public class StringStuff {
    public String capitalize(String name) {
	String firstname, lastname;
	int posspace;
	posspace = name.indexOf(" ");
	firstname = name.substring(0,1).toUpperCase();
	firstname = firstname + name.substring(1,posspace);
	lastname = name.substring(posspace+1, posspace+2).toUpperCase();
	lastname = lastname + name.substring(posspace+2);
	return firstname + " " + lastname;
    }
    
    public String bondify(String name) {
	String capname, last;
	int Pspace;
	capname = capitalize(name);
	Pspace = capname.indexOf(" ");
	last = capname.substring(Pspace+1);
	return last + ", " + capname;
    }
    
}
