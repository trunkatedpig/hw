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


		StringStuff s2;
		s2 = new StringStuff();
		System.out.println("Bondify the name: Paulina Ruta");
		System.out.println(s2.bondify("Paulina Ruta"));

	}
}