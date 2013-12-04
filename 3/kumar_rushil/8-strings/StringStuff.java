import java.util.*;
import java.io.*;
public class StringStuff {

    public String Capitalize (String name){
        String first,last,f,l,fUpper,lUpper;
        int place, length,F,L;
	place = name.indexOf(" ");
	length = name.length();
	first = name.substring(0,place+1);
	last = name.substring(place+1,length);
	f = first.substring(0,1);
	l = last.substring(0,1);
	fUpper = f.toUpperCase();
	lUpper = l.toUpperCase();
	first = first.replace(f,fUpper);  
	last = last.replace(l,lUpper);
        return (first + last);
    }
    public String Bondify (String name){
        String first,last;
        int place,length;
	name = Capitalize (name);
	place = name.indexOf(" ");
	length = name.length();
	first = name.substring(0,place+1);
	last = name.substring(place+1,length);
	return (last + ", " + first + last);
    }
}
