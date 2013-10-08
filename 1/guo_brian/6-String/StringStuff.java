
import java.util.*;
import java.io.*;

public class StringStuff {
    public String alpha;

    public String capitalize (String name) {
	int a = name.indexOf(" ");
	String b = name.substring(0,1);
	String c = name.substring(a+1,a+2);
	String d = b.toUpperCase();
	String e = c.toUpperCase();
	name = name.replace(b, d);
	name = name.replace(c, e);
	return name;
    }

    public String bondify (String name) {
	name = capitalize(name);
	int a = name.indexOf(" ");
	String b = name.substring(a+1);
	String answer = b + ", " + name;
	return answer;
    }
}