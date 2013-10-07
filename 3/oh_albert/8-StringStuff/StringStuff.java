import java.io.*;
import java.util.*;

public class StringStuff {

    public String capitalize (String name) {
	int length = name.length();
	int lnamelastletter = length - 1;
	int space = name.indexOf(" ");
        int lastletter = space - 1;
	String fname = name.substring(0);
	String fnamelast = name.substring(1,lastletter);
	String fnamecap = fname.toUpperCase();
	int firstletter = space + 1;
	String lname = name.substring(firstletter);
	int lnameafter = firstletter + 1;
	String lnamelast = name.substring(lnameafter,lnamelastletter);
	String lnamecap = lname.toUpperCase();
	String finalname = fnamecap + fnamelast + " " + lnamecap + lnamelast;
	return finalname;
    }

    public String bondify (String name) {
	int space = name.indexOf(" ");
	int fnll = space - 1;
	int lnfl = space + 1;
	int length = name.length();
	int lnll = length - 1;
	String first = name.substring(0,fnll);
	String last = name.substring(lnfl,lnll);
	String bname = last + "," + " " + first + " " + last;
	return bname;
    }

}
