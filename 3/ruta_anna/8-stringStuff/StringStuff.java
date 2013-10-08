import java.io.*;
import java.util.*;

public class StringStuff {

/* Assume names are sent in all lower care, two names, first and last, with one space in between */

	private String firstName;
	private String lastName;

/* Identifies the index of the space and separates the string name into a firstname and lastname */
	private void separateName(String n) {
		int z = (n.indexOf(" "));
		firstName = n.substring(0,z);
		lastName = n.substring(z+1);
	}

/* Capitalizes the first letter of the first name and the last name */
	public String capitalize(String name) {
			separateName(name);
			String a = firstName.substring(0,1);
			firstName = firstName.replaceFirst(a, a.toUpperCase());
			String b = lastName.substring(0,1);
			lastName = lastName.replaceFirst(b, b.toUpperCase());
			return firstName + " " + lastName;
			}

/* Bondifies the given name in the form: last, first last */
	public String bondify(String name) {
		separateName(name);
		return lastName + ", " + firstName + " " + lastName;
		}

}