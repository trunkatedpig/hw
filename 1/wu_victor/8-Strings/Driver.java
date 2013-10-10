import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	StringStuff s = new StringStuff();

	System.out.println(s.capitalize("tony wu"));
	System.out.println(s.bondify("tony wu"));
	System.out.println(s.capitalize("jason chen"));
	System.out.println(s.bondify("jason chen"));

	System.out.println(s.pigLatinify("thunder"));
	System.out.println(s.pigLatinify("everyday"));
	System.out.println(s.pigLatinify("god"));
	
    }
}

