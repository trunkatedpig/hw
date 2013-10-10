import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String args[]){
	StringStuff n = new StringStuff();
	System.out.println("Capitalize 'kevin kan': " + n.capitalize("kevin kan"));
	System.out.println("Bondify 'kevin kan': " + n.bondify("kevin kan"));
	piglatin w = new piglatin();
	System.out.println(w.piglatinify("piano"));
	System.out.println(w.piglatinify("apple"));
	System.out.println(w.piglatinify("Sting"));
	System.out.println(w.piglatinify("shirt"));
	System.out.println(w.piglatinify("chart"));
	System.out.println(w.piglatinify("thimble"));
    }
}
