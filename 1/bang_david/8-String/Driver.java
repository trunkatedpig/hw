import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	StringStuff s = new StringStuff();

	System.out.println(s.capitalize("david bang"));
	
	System.out.println(s.capitalize("David bang"));

	System.out.println(s.capitalize("mike zamansky"));

	System.out.println(s.bondify("david bang"));

	System.out.println(s.bondify("James Bond"));

	System.out.println(s.bondify("james Bond"));

	System.out.println(s.bondify("Mike Zamansky"));


	System.out.println (s.PigLatinify ("hey"));
        System.out.println (s.PigLatinify ("Hey"));

	System.out.println (s.PigLatinify ("That"));
	System.out.println (s.PigLatinify ("that"));


	System.out.println (s.PigLatinify ("Apple"));
	System.out.println (s.PigLatinify ("apple"));

	System.out.println (s.PigLatinify ("Shoot"));
	System.out.println (s.PigLatinify ("shoot"));


	System.out.println (s.PigLatinify ("Chill"));
	System.out.println (s.PigLatinify ("chill"));
    }
}

