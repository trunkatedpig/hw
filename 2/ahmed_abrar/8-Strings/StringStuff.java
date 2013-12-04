import java.io.*;
import java.util.*;

public class StringStuff {
    private String a,b,c,d,first,last,rest,firstSound;
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

    public String pigLatin( String word ) {
	first = word.substring(0,1).toLowerCase();
	if (first.equals("a") || first.equals("e") || first.equals("i") || first.equals("o") || first.equals("u"))
	    return word + "yay";
	firstSound = word.substring(0,2).toLowerCase();
	rest = word.substring (2);
	if ( firstSound.equals("ch") | firstSound.equals("th") )
	    return rest + word.substring(0,2) + "ay";
	rest = word.substring(1);
	return rest + word.substring(0,1) + "ay";
    }
}
