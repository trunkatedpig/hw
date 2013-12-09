import java.io.*;
import java.util.*;

public class StringStuff{
    private String name;
    private int index;
    private String first;
    private String last;
    

    public String capitalize(String name){
	name = name;
	index = name.indexOf(" ");
	first = name.substring(0,1);
	first = first.toUpperCase();
	last = name.substring((index + 1), (index + 2));
	last = last.toUpperCase();
	return first + name.substring(1,(index+1)) + last + name.substring((index+2));
	
    }
    public String bondify(String name){
	name = name;
	name = capitalize(name);
	index = name.indexOf(" ");
	return name.substring((index+1)) + ", " + name;
   
    }

}
    
