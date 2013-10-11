import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	StringStuff a = new StringStuff ("elvis presley");
	System.out.println (a.capitalize());
	System.out.println (a.bondify());
	System.out.println (a.PigLatinify("stupid"));
    }
}
	
