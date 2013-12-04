import java.io.*;
import java.util.*;

public class StringStuffDriver {
    public static void main(String[] args) {
	StringStuff test = new StringStuff();
	System.out.println(test.capitalize("katie madsen"));
	System.out.println(test.capitalize("katie Madsen"));
	System.out.println(test.bondify("katie madsen"));
	System.out.println(test.bondify("Katie madsen"));
	System.out.println(test.PigLatinify("automobile"));
	System.out.println(test.PigLatinify("first"));
	System.out.println(test.PigLatinify("chimney"));
    }
}
