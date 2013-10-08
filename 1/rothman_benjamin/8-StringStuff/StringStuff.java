import java.io.*;
import java.util.*;

public class StringStuff {

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

}

