import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String args[]) {
    	StringStuff s = new StringStuff();
	System.out.println(s.Capitalize("Victor Gaitour"));
	System.out.println(s.bondify("Victor Gaitour"));	
	System.out.println(s.PigLatinify("apple"));
	System.out.println(s.PigLatinify("city"));
	System.out.println(s.PigLatinify("dong"));
	System.out.println(s.PigLatinify("elephant"));
	System.out.println(s.PigLatinify("choir"));
	System.out.println(s.PigLatinify("stairs"));

    }
}