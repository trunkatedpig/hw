import java.io.*;
import java.util.*;

public class StringStuff {

/* Assume names are sent in all lower case, two names, first and last, with one space in between */

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

/* Takes a work and changes it into pig-latin form */
	public String pigLatinify(String name) {
		String fl = name.substring(0,1);
		String fl2 = name.substring(0,2);
		String sl = name.substring(1,2);
		if (fl.equals("a") || fl.equals("e") || fl.equals("i") || fl.equals("o") || fl.equals("u")) {
			name = name + "-yay";
			}
		else if (fl2.equals("ch") || fl2.equals("sh") || sl.equals("l") || sl.equals("r") || fl2.equals("ph") || fl2.equals("ps") || fl2.equals("th") || fl2.equals("sn") || fl2.equals("st") || fl2.equals("gn") || fl2.equals("kn")) {
			name = name.substring(2) + "-" + fl2 + "ay";
			}
		else {
			name = name.substring(1) + "-" + fl + "ay";
			}
		return name;
	}

}