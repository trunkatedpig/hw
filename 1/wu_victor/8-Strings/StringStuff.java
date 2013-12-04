import java.io.*;
import java.util.*;

public class StringStuff {
    private String fOne; // First Last
    private String fTwo; // Last, First Last
    private String fThree; // For pigLatinify

    private String partOne; // Letter of First Name (After UpperCase)
    private String partTwo; // Letter of Last Name (After UpperCase)

    private String rOne; // Letters b.t. partOne and partTwo
    private String rTwo; // Letters from partTwo to end

    private String sOne; // Letter of First Name
    private String sTwo; // Letter of Last Name
    private String sThree; // First two letters

    private String vComp; // Vowels

    private int c; // Place of sTwo

    
    public void setVar(String n) {
	c = n.indexOf(" ")+1;

	sOne = n.substring(0,1);
	partOne = sOne.toUpperCase();
	rOne = n.substring(1,c);

	sTwo = n.substring(c, c+1);
	partTwo = sTwo.toUpperCase();
	rTwo = n.substring(c+1);

	fOne = 
	    partOne + 
	    rOne + 
	    partTwo + 
	    rTwo;

	fTwo = partTwo + rTwo + ", " + fOne;
    }

    public void setVars(String n) {
	sOne = n.substring(0,1);
	rOne = n.substring(1);
	rTwo = n.substring(2);
	sThree = n.substring(0,2);
	vComp = "aeiou";
    }

    public String capitalize(String n) {
	setVar(n);
	return fOne;
    }
 
    public String bondify (String n) {
	setVar(n);
	return fTwo;
    }
    
    public String pigLatinify (String n) {
	setVars(n);

	if (sThree.equals("th")||sThree.equals("ch")||sThree.equals("sh")) {
	    fThree = rTwo + sThree + "ay";
	}
	else if (vComp.contains(sOne)) {
	    fThree = n + "yay";
	}
	else {
	    fThree = rOne + sOne + "ay";
	}

	return fThree;
    }
}
