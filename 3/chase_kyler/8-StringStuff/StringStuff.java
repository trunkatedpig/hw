import java.util.*;
import java.io.*;

public class StringStuff {

	public String capitalize(String name) {
		String result;
		result = name.toUpperCase();
		return result;
	}

	public String bondify(String name) {
		String result;
		result = name.substring(name.lastIndexOf(" ") + 1) + ", " + name;
		return result;
	}

}

