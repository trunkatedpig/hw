import java.io.*;
import java.util.*;

public class StringStuff {

    /*
    private String firstname;
    private String lastname;
    private int space;
    
    

   
    public StringStuff (String name) {
	capitalizer(name);

    }
	
    
    public void capitalizer (String name) {

	space = name.indexOf (" ");
	firstname = (name.substring(0,1)).toUpperCase() + name.substring (1, space);
   
	lastname = (name.substring (space + 1, space + 2)).toUpperCase() + name.substring (space + 2);

    }

    public String capitalize () {
	return firstname + " " + lastname;

    }




    public String bondify () { 

	return lastname + ", " + firstname + " " + lastname;

    }


    */


    private String piglatin;
    private String firstletter;
    private String secondletters;

    public StringStuff (String word) {

	firstletter = word.substring (0,1);
	secondletters = word.substring (0,2);
	piglatininate (word);

    }


    public void piglatininate (String word) {

	if (secondletters.equalsIgnoreCase ("ch") ||
secondletters.equalsIgnoreCase ("ph") ||
secondletters.equalsIgnoreCase ("sh") ||
secondletters.equalsIgnoreCase ("rh") ||
	    secondletters.equalsIgnoreCase ("ch") )
	    {
		piglatin = word.substring (2) + word.substring (0,2) + "ay";
		    }

	else { if 
		(word.substring (0,1).equalsIgnoreCase ("a") ||

word.substring (0,1).equalsIgnoreCase ("e") ||
word.substring (0,1).equalsIgnoreCase ("i") ||

word.substring (0,1).equalsIgnoreCase ("o") ||
word.substring (0,1).equalsIgnoreCase ("u") ||
		 word.substring (0,1).equalsIgnoreCase ("y")  )

		{
		    piglatin = word + "ay";
			}

	    else {
		piglatin = word.substring (1) + firstletter + "ay";

		    }

	}

    }
 

    

    public String piglatinify () {

	return piglatin;

	    }
}

