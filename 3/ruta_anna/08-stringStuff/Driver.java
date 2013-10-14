import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {

		System.out.println();
		System.out.println("*-* Testing class StringStuff *-*");
		System.out.println();

		StringStuff s1;
		s1 = new StringStuff();

		System.out.println("Capitalize the name: anna ruta");
		System.out.println(s1.capitalize("anna ruta"));
		System.out.println();

		System.out.println("Bondify the name: Paulina Ruta");
		System.out.println(s1.bondify("Paulina Ruta"));
		System.out.println();

		System.out.println("PigLatinify the word: urchin");
		System.out.println(s1.pigLatinify("urchin"));
		System.out.println();

		System.out.println("PigLatinify the word: hello");
		System.out.println(s1.pigLatinify("hello"));
		System.out.println();

		System.out.println("PigLatinify the word: truck");
		System.out.println(s1.pigLatinify("truck"));
		System.out.println();

		System.out.println("PigLatinify the word: that");
		System.out.println(s1.pigLatinify("that"));
	}
}