import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {

	StringStuff s = new StringStuff();
	System.out.println(s.capitalize("jane chen"));
	System.out.println(s.bondify("james bond"));
	System.out.println(s.bondify("jane chen"));

	System.out.println("------");

	System.out.println(s.PigLatinify("compare"));
	System.out.println(s.PigLatinify("you"));
	System.out.println(s.PigLatinify("octavia"));
	System.out.println(s.PigLatinify("another"));

    }

}
