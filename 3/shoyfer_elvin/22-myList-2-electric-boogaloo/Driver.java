import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) { 
    	myList l1 = new myList();
    	l1.fill();

    	System.out.println("The initial list:");
    	System.out.println(l1);

    	System.out.println("The size of the list:");
    	System.out.println(l1.size()+"");

    	System.out.println("The item at position 3 is: " + l1.get(3));

    	System.out.println("The item at position 3 will be changed to 5:");
    	l1.set(3,5);
    	System.out.println(l1);
    }

}
