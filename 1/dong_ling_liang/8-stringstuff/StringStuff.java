import java.io.*;
import java.util.*;

public class StringStuff {

    public String capitalize(String name){
	int ind = name.indexOf(" ");
	String f, l;
	f = new String();
	l = new String();
	f = name.substring(0,1).toUpperCase();
	l = name.substring(ind+1,ind+2).toUpperCase();
	return f + name.substring(1,ind+1) + l + name.substring(ind+2);
    }
    
    public String bondify(String name){
	String s = new String();
	s = capitalize(name);
	int n = s.indexOf(" ");
	return s.substring(n+1) + ", " + s;
    }
}