import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String [] args) {
	StringStuff n1,n2,n3;

	n1 = new StringStuff();
	String result1 = n1.capitalize("albert oh");
	System.out.println(result1);
	n2 = new StringStuff();
	String result2 = n2.bondify("james bond");
	System.out.println(result2);
	n3 = new StringStuff();
	String result3 = n3.PigLatinify("please");
	System.out.println(result3);

    }
}
