import java.io.*;
import java.util.*;

public class StringStuff {
	public String capitalize(String name) {
		String first, last;
		int spaceIndex;
		spaceIndex = name.indexOf(" ");
		first = name.substring(0, spaceIndex);
		last = name.substring(spaceIndex + 1);
		first = capFirst(first);
		last = capFirst(last);
		return first + " " + last;
	}
	public String bondify(String name){
		String last;
		int spaceIndex;
		name = capitalize(name);
		spaceIndex = name.indexOf(" ");
		last = name.substring(spaceIndex + 1);
		return last + ", " + name;
	}
	public String capFirst(String word) {
		return word.substring(0,1).toUpperCase() + word.substring(1);
	}
}