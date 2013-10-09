import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String [] args) {
	StringStuff a = new StringStuff();
	System.out.println (a.capitalize ("james bond"));
	System.out.println (a.bondify ("james bond"));
	System.out.println (a.pigLatinify ("under"));
	System.out.println (a.pigLatinify ("trip"));
	System.out.println (a.pigLatinify ("bond"));
    }
}

