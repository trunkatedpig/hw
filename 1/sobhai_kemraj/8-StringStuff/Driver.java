import java.io.*;
import java.util.*;

public class Driver{
	public static void main (String[] args){
		StringStuff stringOne= new StringStuff();

		String var = stringOne.Capitalize("kemraj sobhai");
		System.out.println(var);

		String var2 = stringOne.Bondify("Kemraj Sobhai");
		System.out.println(var2);

		String var3 = stringOne.PigLatinify("kemraj");
		System.out.println(var3);

		String var4 = stringOne.PigLatinify("apple");
		System.out.println(var4);

		String var5 = stringOne.PigLatinify("elephant");
		System.out.println(var5);

		String var6 = stringOne.PigLatinify("indigo");
		System.out.println(var6);

		String var7 = stringOne.PigLatinify("ought");
		System.out.println(var7);

		String var8 = stringOne.PigLatinify("umbrella");
		System.out.println(var8);

		//String var9 = stringOne.PigLatinify("Kemraj");
		//System.out.println(var9);
	}
}
