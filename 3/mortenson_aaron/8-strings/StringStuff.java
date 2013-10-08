import java.io.*;
import java.util.*;

public class StringStuff {

	public String capFirst(String name) {
		return name.substring(0,1).toUpperCase()+name.substring(1);
	}

	public String capitalize (String name) {
		String first = name.substring(0,name.indexOf(" "));
		String last = name.substring(name.indexOf(" ")+1);
		return capFirst(first) + " " + capFirst(last);
	}

	public String bondify (String name) {
		String first = name.substring(0,name.indexOf(" "));
		String last = name.substring(name.indexOf(" ")+1);
		return capFirst(last) + ", " + capFirst(first) + " " + capFirst(last) + ".";
	}
}
