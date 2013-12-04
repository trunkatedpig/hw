import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
        StringStuff name;
	name = new  StringStuff();

	System.out.println(name.capitalize("kelly chen"));
	System.out.println(name.bondify("Kelly Chen"));
	System.out.println(name.PigLatinify("hello"));
	System.out.println(name.PigLatinify("elephant"));
    }
}
