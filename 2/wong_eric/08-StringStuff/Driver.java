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

		PigLatin word1, word2, word3;
		word1 = new PigLatin();
		word2 = new PigLatin();
		word3 = new PigLatin();

		System.out.println(word1.PigLatinify("ate"));
		System.out.println(word2.PigLatinify("hello"));
		System.out.println(word3.PigLatinify("thanks"));
		System.out.println(word1.PigLatinify("ATE"));
		System.out.println(word2.PigLatinify("HELLO"));
		System.out.println(word3.PigLatinify("THANKS"));

	}
}