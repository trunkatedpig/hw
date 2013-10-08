import java.io.*;
import java.util.*;

public class Stringword {

	public String capitalize(String name) {
		String firstLetter = name.substring(0,1);
		String capFirstLetter = firstLetter.toUpperCase();
		int space = name.indexOf(" ");
		String firstLetterLastName = name.substring(space + 1, space + 2);
		String capFirstLetterLastName = firstLetterLastName.toUpperCase();
		String finalString = capFirstLetter + name.substring(1, space) + " " + capFirstLetterLastName + name.substring(space + 2);
		return finalString; 
	}

	public String bondify(String name) {
		name = capitalize(name);
		int space = name.indexOf(" ");
		String firstName = name.substring(0, space);
		String lastName = name.substring(space + 1);
		return lastName + ", " + firstName + " " + lastName;
	}
}
