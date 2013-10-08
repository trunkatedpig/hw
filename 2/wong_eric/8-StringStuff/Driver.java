import java.io.*;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		StringStuff name1, name2;
		name1 = new StringStuff();
		name2 = new StringStuff();

		System.out.println(name1.capitalize("eric wong"));
		System.out.println(name1.bondify("eric Wong"));

		System.out.println(name2.capitalize("chick ken"));
		System.out.println(name2.bondify("chick ken"));

	}
}