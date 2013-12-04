import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	StringStuff s;
	s = new StringStuff();
     
	String n1,n2,n3;
	n1 = new String ("james bond");
	n2 = new String ("JacobVera");
	n3 = new String ("mikezamansky");

	String s1,s2,s3,s4,s5;
	s1 = new String ("no"); //testing f2/f3letters fallout case and consonant case
	s2 = new String ("a"); //just to see what will happen
	s3 = new String ("the"); //f2letters
	s4 = new String ("screw"); //f3letters
	s5 = new String ("your"); //vowel
	
	
	System.out.println(s.bondify(s.capitalize(n1))); //Bond, James Bond
	System.out.println(s.bondify(n2)); //Invalid input.
	System.out.println(s.capitalize(n3)); //Invalid input.
	System.out.println(s.PigLatinify(s1)); //onay
	System.out.println(s.PigLatinify(s2)); //aay 
	System.out.println(s.PigLatinify(s3)); //ethay
	System.out.println(s.PigLatinify(s4)); //ewscray
	System.out.println(s.PigLatinify(s5)); //youray
    }
}
