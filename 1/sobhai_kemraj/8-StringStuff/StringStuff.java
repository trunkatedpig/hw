import java.io.*;
import java.util.*;

public class StringStuff{
	public String Capitalize(String name){
		int space = name.indexOf(" ") +1;
		String first = name.substring(1,space);
		String last = name.substring(space+1);
		String capitalized = name.substring(0,1).toUpperCase() + first + name.substring(space, space+1).toUpperCase() + last;
		return capitalized;
	}

	public String Bondify(String name){
		int space = name.indexOf(" ") +1;
		String last = name.substring(space);
		String finalname = last+", "+name;
		return finalname;
	}
}
