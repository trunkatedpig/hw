import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String [] args){
       
	String n = new String();
	n = "fish milnikiewicz";
	System.out.println(n);

	StringStuff m = new StringStuff();
	System.out.println(m.capitalize(n));
	System.out.println(m.bondify(n));

	System.out.println(m.piglatinify("fish"));
	System.out.println(m.piglatinify("everything"));
    }
    
}
