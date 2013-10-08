import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String args[]) {
    	StringStuff stuff = new StringStuff();
    	String name = new String();
    	name = "fawn wong";
    	System.out.println(stuff.capitalize(name));
    	System.out.println(stuff.bondify(name));
    }
}