import java.io.*;
import java.util.*;

public class stringStuff{

    public String capFirst(String name){
	String f,f1,f2;
	f = name.substring(0,name.indexOf(" "));
	f1 = f.substring(0,1).toUpperCase();
	f2 = f.substring(1);
	f = f1+f2;
	return f;
    }
	    
    public String capLast(String name){
	String l,l1,l2;
	l = name.substring(name.indexOf(" ")+1);
	l1 = l.substring(0,1).toUpperCase();
	l2 = l.substring(1);
	l = l1+l2;
	return l;
    }

    public String capitalize(String name){
	String f,l;
	f = capFirst(name);
	l = capLast(name);
	return f+" "+l;
    }
    
    public String bondify(String name){
	String l,c;
	c = capitalize(name);
	l = capLast(name);
	return l + ", " + c;
    }
}
