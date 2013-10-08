import java.io.*;
import java.util.*;

public class StringStuff {
    private String fOne; // First Last
    private String fTwo; // Last, First Last

    private String partOne; // Letter of First Name (After UpperCase)
    private String partTwo; // Letter of Last Name (After UpperCase)

    private String rOne; // Letters b.t. partOne and partTwo
    private String rTwo; // Lettters from partTwo to end

    private String sOne; // Letter of First Name
    private String sTwo; // Letter of Last Name

    private int c; // Place where letter of Last Name

    
    public void setVars(String n) {
	c = n.indexOf(" ")+1;

	sOne = n.substring(0,1);
	partOne = sOne.toUpperCase();
	rOne = n.substring(1,c);

	sTwo = n.substring(c, c+1);
	partTwo = sTwo.toUpperCase();
	rTwo = n.substring(c+1, n.length());

	fOne = 
	    partOne + 
	    rOne + 
	    partTwo + 
	    rTwo;

	fTwo = partTwo + rTwo + ", " + fOne;
    }

    public String capitalize(String n) {
	setVars(n);
	return fOne;
    }
 
    public String bondify (String n) {
	setVars(n);
	return fTwo;
    }
    
}
