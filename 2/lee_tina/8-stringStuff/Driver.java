import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	StringStuff s = new StringStuff();
	System.out.println(s.stringCap("james bond"));
	System.out.println(s.bondify("james bond"));
//Tina Lee and Danny Qiu
	System.out.println(s.pigLatinfy("apple"));
	System.out.println(s.pigLatinfy("potato"));
	System.out.println(s.pigLatinfy("troll"));
	System.out.println(s.pigLatinfy("three"));
    }
}
