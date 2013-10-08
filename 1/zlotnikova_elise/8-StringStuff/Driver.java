import java.io.*;
import java.util.*;

public class Driver {
    public static void  main(String[] args) {
	StringStuff Stuff; 
	Stuff = new StringStuff();
	String name = "elise zlotnikova";
        System.out.println(Stuff.capitalize(name));
	System.out.println(Stuff.bondify(name));
    }
}
