import java.util.*;
import java.io.*;

public class Driver{
    public static void main (String args[]){
        
	StringStuff names;
	String n1, n2, n3;
	
	names = new StringStuff();
	n1 = "Terrance Liang";
	n2 = "terrance liang";
	n3 = "james bond";
	
	System.out.println(names.capitalize(n2));
	System.out.println(names.bondify(n1));
	System.out.println(names.bondify(names.capitalize(n3)));



	StringStuff words;
	String w1,w2,w3,w4;
	words = new StringStuff();
	w1 = "ate";
	w2 = "computer";
	w3 = "astronaut";
	w4 = "choice";
	
	System.out.println(words.PigLatinify(w1));
	System.out.println(words.PigLatinify(w2));
	System.out.println(words.PigLatinify(w3));
	System.out.println(words.PigLatinify(w4));


    }



}
