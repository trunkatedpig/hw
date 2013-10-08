import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {

	StringStuff s1;
	s1 = new StringStuff();

	String n = "mary taft";

	System.out.println("Input: " + n);
	System.out.println("Capitalize: " + s1.capitalize(n));
	System.out.println("Bondify: " + s1.bondify(n));

	String temp = "out";
	String temp1 = "plot";

	System.out.println(s1.piglatinify(temp));
	System.out.println(s1.piglatinify(temp1));


    }

}
