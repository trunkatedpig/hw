import java.io.*;
import java.util.*;

public class StringStuff {

	private int index;

	public String capitalize(String name) {
		String first, last, full;
		String f1, l1;
		index = name.indexOf(" ");

		f1 = name.substring(0, 1);
		f1 = f1.toUpperCase();
		first = f1 + name.substring(1, index);
		
		l1 = name.substring(index + 1, index + 2);
		l1 = l1.toUpperCase();
		last = l1 + name.substring(index + 2);

		full = first + " " + last;
		return full;
	}

	public String bondify(String name) {
		String last, full;
		String l1;
		index = name.indexOf(" ");
	
		l1 = name.substring(index + 1, index + 2);
		l1 = l1.toUpperCase();
		last = l1 + name.substring(index + 2);

		full = last + ", " + capitalize(name);
		return full;
	}
}