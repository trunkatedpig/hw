import java.util.*;
import java.io.*;


public class StringStuff{

    private int space;
    private String name, first, last;

    public String capitalize(String n){
	name = n;
	space = name.indexOf(" ");
	first = name.substring(0,space);
	last = name.substring(space+1);
	first = (first.substring(0,1)).toUpperCase()+ first.substring(1);
	last = (last.substring(0,1)).toUpperCase()+ last.substring(1);
	name = first + " " + last;
	return name;
    }
    
    public String bondify (String n){
	name = n;
	space = name.indexOf(" ");
	first = name.substring(0,space);
	last = name.substring(space+1);
	name = last + ", " + name;
	return name;

    }

}
