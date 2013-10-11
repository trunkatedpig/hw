import java.io.*;
import java.util.*;

public class StringStuff {
    
    private String finalword;

    public String capitalize (String name) {
	int length = name.length();
	int space = name.indexOf(" ");
        int lastletter = space - 1;
	String fname = name.substring(0,1);
	String fnamelast = name.substring(1,space);
	String fnamecap = fname.toUpperCase();
	int firstletter = space + 1;
	int firstletter2 = firstletter + 1;
	String lname = name.substring(firstletter,firstletter2);
	int lnameafter = firstletter + 1;
	String lnamelast = name.substring(lnameafter,length);
	String lnamecap = lname.toUpperCase();
	String finalname = fnamecap + fnamelast + " " + lnamecap + lnamelast;
	return finalname;
    }

    public String bondify (String name) {
	int space = name.indexOf(" ");
	int lnfl = space + 1;
	int length = name.length();
	String first = name.substring(0,space);
	String last = name.substring(lnfl,length);
	String bname = last + "," + " " + first + " " + last;
	return bname;
    }

    public String PigLatinify (String word) {
	String fletter = word.substring(0,1);
	String pigword = word.substring(1);
	if (fletter.equals("a") || fletter.equals("e") || fletter.equals("i") || fletter.equals("o") || fletter.equals("u"))
	    {  finalword = word + "hay";
	}else{
	    finalword = pigword + fletter + "ay"; }
	return finalword;
    }
}
