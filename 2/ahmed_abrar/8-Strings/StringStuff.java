import java.io.*;
import java.util.*;

public class StringStuff {
    private String a,b,c,d,first,last;
    private int x,space;

    public String capitalize( String name ) {
	a = name.substring(0,1).toUpperCase();
	x = name.indexOf(" ");
	b = name.substring(1,x);
	//return b;
	c = name.substring (x+1,x+2).toUpperCase();
	d = name.substring (x+2);
	return a+b+" "+c+d;
    }

    public String bondify( String name ) {
	name = capitalize(name);
	space = name.indexOf(" ");
	first = name.substring(0, space);
	last = name.substring(space+1);
	name = last + ", " + first + " " + last;
	return name; 
    }
}
