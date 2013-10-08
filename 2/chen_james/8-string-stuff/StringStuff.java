import java.io.*;
import java.util.*;

//really messy right now, gonna clean it up later.

public class StringStuff {

	public String capitalize(String name) {
		String x;
		x = name.toUpperCase();
		return x;	
	}
	
	public int getLocationFirstName (String name) { //gets the location of where first name ends
		int getFirstName = name.indexOf(" ");
		return getFirstName;
	}
	
	public String getFirstName (String name) { //returns actual first name as string
		
		String firstName = name.substring(0,getLocationFirstName(name));
		return firstName;
	}
	
	public int getLength (String name) { //measures the length
		int getLength = name.length();
		return getLength;
	
	}
	
	public String getLastName (String name) { //returns actual last name as String
		String lastName = name.substring(getLocationFirstName(name) + 1,getLength(name));
		return lastName;
	
	}
	
	public String bondify(String name) {
		return getLastName(name) + ", " + getFirstName(name) + " " + getLastName(name);
	}


}