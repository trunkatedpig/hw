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

        int testInt = l1.get(1);
        System.out.println("Testing find; it should be the element of index 1 : " + l1.find(testInt));

        System.out.println("Testing remove; it should remove the element of index 1");
        System.out.println("The element is: " + l1.fremove(testInt));
        System.out.println("The list is now: " + l1);
    }

}
