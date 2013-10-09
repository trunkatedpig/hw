import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String args[]) {

	StringStuff n = new StringStuff();

	System.out.println(n.capitalize("aida piccato"));

	System.out.println(n.bondify("aida piccato"));

	System.out.println(n.pigLatinify("hello"));

	System.out.println(n.pigLatinify("orange"));
    }
}
