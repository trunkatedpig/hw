import java.io.*;
import java.util.*;

public class StringDriver { 

    public static void main(String[] args) { 

	StringStuff s1 = new StringStuff();

	System.out.println(s1.capitalize("alex zilbersher"));
	System.out.println(s1.bondify("alex zilbersher"));
	System.out.println(s1.pigLatinify("snarky"));
	System.out.println(s1.pigLatinify("theorem"));
	System.out.println(s1.pigLatinify("ardvark"));
    }
}