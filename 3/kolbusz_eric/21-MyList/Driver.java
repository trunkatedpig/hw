import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

	if (args.length != 1) {
	    System.out.println("Enter array size");
	    System.exit(0);
	}

	int arraySize= Integer.parseInt(args[0]);
	ArrayStuff as = new ArrayStuff(arraySize,100);
	System.out.println(as + "");
	int i = as.get(3);

	System.out.println("Removing "+i+" at index 3.");
	as.remove(3);
	System.out.println(as + "");

	System.out.println("Reinserting");
	as.insert(3,i);
	System.out.println(as + "");

	System.out.println("Inserting "+i+" at index 10.");
	as.insert(10,i);
	System.out.println(as + "");  
    }

}
