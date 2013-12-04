import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	
	StringStuff name, word;
	name = new StringStuff();
	word = new StringStuff();

	//System.out.println(name.capitalize("sam kim"));
	//System.out.println(name.bondify("Sam Kim"));

	System.out.println(word.pigLatinify("computer"));
	System.out.println(word.pigLatinify("allow"));
	System.out.println(word.pigLatinify("theater"));
	System.out.println(word.pigLatinify("cheater"));
	System.out.println(word.pigLatinify("sheerer"));
    }
}
