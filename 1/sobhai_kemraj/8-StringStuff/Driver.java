import java.io.*;
import java.util.*;

public class Driver{
	public static void main (String[] args){
		StringStuff stringOne= new StringStuff();

		String var = stringOne.Capitalize("kemraj sobhai");
		System.out.println(var);

		String var2 = stringOne.Bondify("Kemraj Sobhai");
		System.out.println(var2);
	}
}
