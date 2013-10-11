import java.util.*;
import java.io.*;

public class Driver {
	public static void main (String args[]) {
		StringStuff s;
		s = new StringStuff();
		System.out.println(s.capitalize("bobert mcgee"));
		System.out.println(s.bondify("bobert mcgee"));
		System.out.println(s.pigLatinify("Hello"));
		System.out.println(s.pigLatinify("Chairs"));
		System.out.println(s.pigLatinify("Apple"));
	}
}
