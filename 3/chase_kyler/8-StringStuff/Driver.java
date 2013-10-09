import java.util.*;
import java.io.*;

public class Driver {
	public static void main(String[] args) {
		StringStuff SS = new StringStuff();
		/*String n = new String("james bond");
		System.out.println(SS.capitalize(n));
		System.out.println(SS.bondify(n));*/
		String n = new String("hello");
		String n2 = new String("urchin");
		String n3 = new String("psycho");
		String n4 = new String("that");
		System.out.println(SS.pigLatinify(n));
		System.out.println(SS.pigLatinify(n2));
		System.out.println(SS.pigLatinify(n3));
		System.out.println(SS.pigLatinify(n4));
		



	}
}
