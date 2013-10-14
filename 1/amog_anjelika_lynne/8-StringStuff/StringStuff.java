import java.io.*;
import java.util.*;

public class StringStuff{
    public String capitalize (String name) {
	int space;
	String first, last, f, l;
	space = name.indexOf(" ");
	f = name.substring(0).toUpperCase();
	first = f + name.substring(1,space);
	l = name.substring(space + 1).toUpperCase();
	last = l + name.substring(space + 2);
	return first + last;
    }
}
