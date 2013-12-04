import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	String a,b,c,d;
	a = new String("eric morgenstern");
	b = new String("mike zamansky");
	c = new String("James Bond");
	d = new String("Mike Zamansky");
	StringStuff e;
	e = new StringStuff();
	System.out.println(e.capitalize(a));
	System.out.println(e.capitalize(b));
	System.out.println(e.bondify(c));
	System.out.println(e.bondify(d));
	System.out.println("NOW TO TEST PIGLATINIFY");
	System.out.println(e.PigLatinify(a));
	System.out.println(e.PigLatinify(b));
	System.out.println(e.PigLatinify(c));
	System.out.println(e.PigLatinify(d));
    }
}		
	
	
