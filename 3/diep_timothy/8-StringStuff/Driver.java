import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	StringStuff s1, s2, s3, s4, s5, s6, s7;
	s1 = new StringStuff("timothy diep");
	s2 = new StringStuff("mike zamansky");
	s3 = new StringStuff("octopus");
	s4 = new StringStuff("turtle");
	s5 = new StringStuff("triceratops");
	s6 = new StringStuff("strength");
	s7 = new StringStuff("rhythm");
	System.out.println(s1.capitalize());
	System.out.println(s1.bondify());
	System.out.println(s2.capitalize());
	System.out.println(s2.bondify());
	System.out.println(s3.PigLatinify());
	System.out.println(s4.PigLatinify());
	System.out.println(s5.PigLatinify());
	System.out.println(s6.PigLatinify());
	System.out.println(s7.PigLatinify());

    }
}
