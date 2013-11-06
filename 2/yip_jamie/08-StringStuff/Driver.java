import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String args[]) {
	StringStuff n= new StringStuff ();
	PigLatinfy y= new PigLatinfy();
	System.out.println(n.capitalize("jamie yip"));
	System.out.println(n.bondify("jamie yip"));
	System.out.println(y.PigLatinify("hello"));
    }
}
