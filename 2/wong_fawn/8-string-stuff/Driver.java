import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String args[]) {
    	StringStuff stuff = new StringStuff();
    	Piglatinify pig = new Piglatinify();
    	String name = new String();
    	name = "fawn wong";
    	System.out.println(stuff.capitalize(name));
    	System.out.println(stuff.bondify(name));
    	System.out.println(pig.PigLatin("hello"));
    	System.out.println(pig.PigLatin("Fawn"));
    	System.out.println(pig.PigLatin("eight"));
        System.out.println(pig.PigLatin("Ate"));
    }
}