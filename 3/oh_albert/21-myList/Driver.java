import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	myList x = new myList(10);
	myList y = new myList(10);
	Random z = new Random();
        int l = z.nextInt(9);

	System.out.println("Old String: " + x.toString());
	x.insert(l,30);
	System.out.println("The inserted number is: " + 30 + " at position: " + l);
	System.out.println("New String: " + x.toString());

	System.out.println("-----------------------------------");

	System.out.println("Old String: " + y.toString());
	System.out.println("The removed number: " + y.remove(l));
	System.out.println("New String: " + y.toString());

    }
}
