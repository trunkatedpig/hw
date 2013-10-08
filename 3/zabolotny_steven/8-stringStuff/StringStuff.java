import java.io.*;
import java.util.*;

public class StringStuff {
    public String capitalize(String name) {
	int space = name.indexOf(" ");
	String fletter = name.substring(0,1).toUpperCase();
	String fname = name.substring(1,space);
	String sletter = name.substring(space + 1,space + 2).toUpperCase();
	String sname = name.substring(space + 2);
       	return fletter + fname + " " +  sletter + sname;
    }
    public String bondify(String name) {
	int space = name.indexOf(" ");
	String fname = name.substring(0,space);
	String sname = name.substring(space + 1);
	return sname + ", " + fname + " " + sname;
    }
}